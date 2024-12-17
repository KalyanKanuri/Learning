package main

import (
	"context"
	"fmt"
	"time"
)

type key string

const (
	userKey key = "gopher dev"
)

func main() {
	baseCtx := context.Background()
	userCtx := context.WithValue(baseCtx, userKey, "gopher")
	ctx, cancel := context.WithTimeout(userCtx, 1*time.Second)
	defer cancel()

	cancelCtx, cancelFunc := context.WithCancel(ctx)
	defer cancelFunc()

	go func(ctx context.Context) {
		for {
			select {
			case <-ctx.Done():
				if ctx.Err() == context.DeadlineExceeded {
					fmt.Println("timeout")
				} else {
					fmt.Println("context cancelled:", ctx.Err())
				}
				return

			default:
				user := ctx.Value(userKey).(string)
				fmt.Println("Goroutine is working for user", user, time.Now())
				time.Sleep(500 * time.Millisecond)
			}
		}
	}(cancelCtx)

	time.Sleep(2 * time.Second)
	cancelFunc()

	time.Sleep(1 * time.Second)
}
