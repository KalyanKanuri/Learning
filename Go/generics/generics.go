package main

import (
	"fmt"
	"sync"
)

type Numbers interface {
	int | int32 | int64 | float32 | float64
}

var wg sync.WaitGroup

func add[T Numbers](a T, b T) T {
	defer wg.Done()
	sum := a + b
	fmt.Println(sum)
	return sum
}

func main() {
	wg.Add(1)
	add(1, 2)
	wg.Wait()
}
