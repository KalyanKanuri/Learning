package main

import (
	"fmt"
	"time"
)

func main() {
	// Create two channels
	ch1 := make(chan string)
	ch2 := make(chan string)

	// Goroutine to send to the first channel
	go func() {
		time.Sleep(2 * time.Second)
		ch1 <- "Hello from channel 1"
		close(ch1) // Close the channel after sending
	}()

	// Goroutine to send to the second channel
	go func() {
		time.Sleep(1 * time.Second)
		ch2 <- "Hello from channel 2"
		close(ch2) // Close the channel after sending
	}()

	// Use select to receive from either channel
	timeout := time.After(3 * time.Second)
	for {
		select {
		case msg1, ok := <-ch1:
			if ok {
				fmt.Println(msg1)
			} else {
				fmt.Println("Channel 1 is closed")
				ch1 = nil
			}
		case msg2, ok := <-ch2:
			if ok {
				fmt.Println(msg2)
			} else {
				fmt.Println("Channel 2 is closed")
				ch2 = nil
			}
		case <-timeout:
			fmt.Println("Timeout reached")
			return // Exit the loop
		}

		// Break the loop if all channels are nil
		if ch1 == nil && ch2 == nil {
			fmt.Println("All channels are closed, exiting.")
			break
		}
	}
}
