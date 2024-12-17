package main

import (
	"fmt"
	"time"
)

func exec_channels(arr []int, ch chan int) {
	sum := 0
	for _, val := range arr {
		fmt.Println("inside exec_channels()", val)
		sum += val
	}
	ch <- sum
}

func main() {
	nums_chan := make(chan int)
	nums := make([]int, 0)

	for i := 0; i < 10; i++ {
		nums = append(nums, i)
	}

	go exec_channels(nums, nums_chan)

	time.Sleep(3 * time.Second)
	totalSum := <-nums_chan
	fmt.Println("Total Sum:", totalSum)
}
