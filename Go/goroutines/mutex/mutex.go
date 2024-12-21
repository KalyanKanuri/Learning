package main

import (
	"fmt"
	"sync"
)

func ExecMutex(wg *sync.WaitGroup, mutex *sync.Mutex, counter *int) {
	wg.Add(1000)
	for i := 0; i < 1000; i++ {
		go func() {
			defer wg.Done()
			mutex.Lock()
			*counter++ // Increment shared counter
			mutex.Unlock()
		}()
	}

	wg.Wait()
	fmt.Println("Counter after Mutex Operations:", *counter)
}
