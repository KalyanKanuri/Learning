package main

import (
	"fmt"
	"sync"
)

func ReadRWMutex(wg *sync.WaitGroup, rwMu *sync.RWMutex, counter *int) {
	for i := 0; i < 1000; i++ {
		go func() {
			defer wg.Done()
			rwMu.RLock()
			_ = *counter // Safely read the counter
			rwMu.RUnlock()
		}()
	}
	wg.Wait()
}

func WriteRWMutex(wg *sync.WaitGroup, rwMu *sync.RWMutex, counter *int) {
	for i := 0; i < 1000; i++ {
		go func() {
			defer wg.Done()
			rwMu.Lock()
			*counter++ // Safely increment the counter
			rwMu.Unlock()
		}()
	}
	wg.Wait()
}

func ExecRWMutex(wg *sync.WaitGroup, rwMu *sync.RWMutex, counter *int) {
	// Add counts for both readers and writers
	wg.Add(2000) // 1000 readers + 1000 writers

	// Launch ReadRWMutex
	go ReadRWMutex(wg, rwMu, counter)

	// Launch WriteRWMutex
	go WriteRWMutex(wg, rwMu, counter)

	// Wait for all goroutines to complete
	wg.Wait()
	fmt.Println("Counter after RWMutex Operations:", *counter)
}
