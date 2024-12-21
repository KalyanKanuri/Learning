# Mutex in Go

A **mutex** (short for mutual exclusion) is a synchronization primitive provided in Go's `sync` package to ensure that only one goroutine can access a critical section of code at a time. Mutexes are used to prevent race conditions and maintain consistency when shared data is accessed concurrently by multiple goroutines.

## Types of Mutexes in Go
Go provides two types of mutexes:
1. `sync.Mutex`: A standard mutex that provides mutual exclusion.
2. `sync.RWMutex`: A reader-writer mutex that allows multiple readers or one writer.

### sync.Mutex
The `sync.Mutex` type provides two primary methods:
- `Lock()`: Acquires the mutex. If another goroutine has already locked the mutex, the current goroutine will block until the mutex is unlocked.
- `Unlock()`: Releases the mutex, allowing another goroutine to acquire it.

#### Example of sync.Mutex
```go
package main

import (
	"fmt"
	"sync"
)

var (
	mu    sync.Mutex
	count int
)

func increment(wg *sync.WaitGroup) {
	defer wg.Done()

	mu.Lock()
	count++
	mu.Unlock()
}

func main() {
	var wg sync.WaitGroup

	for i := 0; i < 10; i++ {
		wg.Add(1)
		go increment(&wg)
	}

	wg.Wait()
	fmt.Println("Final count:", count)
}
```

### sync.RWMutex
The `sync.RWMutex` type provides methods for both readers and writers:
- `RLock()`: Acquires a read lock. Multiple goroutines can acquire the read lock simultaneously as long as no goroutine holds the write lock.
- `RUnlock()`: Releases a read lock.
- `Lock()`: Acquires a write lock. It blocks until all readers and writers have released their locks.
- `Unlock()`: Releases the write lock.

#### Example of sync.RWMutex
```go
package main

import (
	"fmt"
	"sync"
)

var (
	rwMu  sync.RWMutex
	data  int
)

func readData(wg *sync.WaitGroup) {
	defer wg.Done()

	rwMu.RLock()
	fmt.Println("Reading data:", data)
	rwMu.RUnlock()
}

func writeData(wg *sync.WaitGroup, value int) {
	defer wg.Done()

	rwMu.Lock()
	data = value
	fmt.Println("Writing data:", value)
	rwMu.Unlock()
}

func main() {
	var wg sync.WaitGroup

	for i := 1; i <= 5; i++ {
		wg.Add(1)
		go writeData(&wg, i)

		wg.Add(1)
		go readData(&wg)
	}

	wg.Wait()
}
```

## Key Considerations
1. **Deadlocks**: A deadlock occurs when two or more goroutines wait indefinitely for each other to release a lock. Always ensure that `Unlock()` is called, even in error cases. Using `defer` for unlocking can help avoid this issue.

2. **Performance**: Overusing locks can degrade performance, especially if many goroutines are contending for the same lock. Use `sync.RWMutex` for read-heavy scenarios to allow multiple readers.

3. **Granularity**: Lock only the critical section of code that requires mutual exclusion to minimize contention.

4. **Avoid Recursive Locks**: Go's `sync.Mutex` does not support recursive locking, so calling `Lock()` on the same mutex in a goroutine that already holds it will result in a deadlock.

## Alternatives to Mutexes
For certain use cases, other synchronization primitives may be more appropriate:
- **Channels**: Often preferred in Go for managing concurrency without explicit locking.
- **Atomic Operations**: Use the `sync/atomic` package for simple, low-level operations on shared variables without locks.

## Summary
- Mutexes in Go are powerful tools for managing concurrent access to shared data.
- Use `sync.Mutex` for general mutual exclusion and `sync.RWMutex` for read-heavy workloads.
- Be cautious of deadlocks and contention when using mutexes.
- Consider alternatives like channels or atomic operations for simpler scenarios.

