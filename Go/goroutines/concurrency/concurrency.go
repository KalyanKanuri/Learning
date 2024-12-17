package main

import (
	"fmt"
	"runtime"
	"time"
)

func printNumbers() {
	for i := 1; i <= 5; i++ {
		time.Sleep(100 * time.Millisecond)
		fmt.Println("Numbers:", i)
	}
}

func printLetters() {
	for i := 'a'; i <= 'e'; i++ {
		time.Sleep(150 * time.Millisecond)
		fmt.Println("Letters:", string(i))
	}
}

func main() {
	// Set GOMAXPROCS to 1 to use 1 core CPU for concurrency
	runtime.GOMAXPROCS(1)

	// Start goroutines
	go printNumbers()
	go printLetters()

	// Stop the main goroutine for 2 seconds
	time.Sleep(2 * time.Second)
	fmt.Println("Main function completed")
}
