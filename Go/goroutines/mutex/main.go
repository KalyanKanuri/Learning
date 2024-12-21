package main

import (
	"fmt"
	"sync"
)

func main() {
	var wg sync.WaitGroup
	var mutex sync.Mutex
	var rwMu sync.RWMutex
	counter := 0

	fmt.Println("======================")
	fmt.Println("Executing Mutex Ops")
	fmt.Println("======================")
	ExecMutex(&wg, &mutex, &counter)

	fmt.Println("=========================")
	fmt.Println("Executing RWMutex Ops")
	fmt.Println("=========================")
	ExecRWMutex(&wg, &rwMu, &counter)
}
