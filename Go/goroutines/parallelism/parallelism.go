package main

import (
	"fmt"
	"runtime"
	"sync"
	"time"
)

// Detailed logging structure for task execution
type TaskResult struct {
	TaskID         int
	ThreadID       uint64
	ComputationSum int
	ExecutionTime  time.Duration
}

// Simulate CPU-intensive task with detailed tracking
func intensiveTask(id int, resultChan chan TaskResult, wg *sync.WaitGroup) {
	defer wg.Done()

	// Get the goroutine ID (using runtime stack trace)
	var goID uint64
	var stackBuf [64]byte
	stackLen := runtime.Stack(stackBuf[:], false)
	fmt.Sscanf(string(stackBuf[:stackLen]), "goroutine %d ", &goID)

	start := time.Now()

	// Simulate intensive computation
	sum := 0
	for i := 0; i < 100_000_000; i++ {
		sum += i
	}

	// Prepare and send task result
	result := TaskResult{
		TaskID:         id,
		ThreadID:       goID,
		ComputationSum: sum,
		ExecutionTime:  time.Since(start),
	}

	resultChan <- result
}

func main() {
	// Determine and set maximum parallelism
	numCPUs := runtime.NumCPU()
	runtime.GOMAXPROCS(numCPUs)

	// Print system configuration
	fmt.Printf("🖥️ System Parallelism Configuration:\n")
	fmt.Printf("   - Total Available CPUs: %d\n", numCPUs)
	fmt.Printf("   - Current GOMAXPROCS Setting: %d\n\n", runtime.GOMAXPROCS(0))

	// Prepare synchronization mechanisms
	var wg sync.WaitGroup
	resultChan := make(chan TaskResult, numCPUs)

	// Start parallel tasks
	startTime := time.Now()

	for i := 0; i < numCPUs; i++ {
		wg.Add(1)
		go intensiveTask(i, resultChan, &wg)
	}

	// Wait for all tasks to complete
	go func() {
		wg.Wait()
		close(resultChan)
	}()

	// Collect and display results
	fmt.Println("📊 Task Execution Results:")
	for result := range resultChan {
		fmt.Printf("Task %d:\n", result.TaskID)
		fmt.Printf("   - Goroutine ID: %d\n", result.ThreadID)
		fmt.Printf("   - Computation Result: %d\n", result.ComputationSum)
		fmt.Printf("   - Execution Time: %v\n", result.ExecutionTime)
	}

	// Print total execution time
	totalTime := time.Since(startTime)
	fmt.Printf("\n🏁 Total Parallel Execution Time: %v\n", totalTime)
}
