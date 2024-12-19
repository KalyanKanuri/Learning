package main

import (
    "bufio"
    "bytes"
    "fmt"
)

func main() {
    // read using bufio
		fmt.Println("Read using bufio")
		reader := bufio.NewReader(bytes.NewBufferString("Hello, World!\n"))
		line, err := reader.ReadString('\n')
		if err != nil {
			fmt.Println("Error reading string", err)
		} else {
			fmt.Println(line)
		}

		// write using bytes.Buffer
		fmt.Println("Write using bytes.Buffer")
		var buffer bytes.Buffer
		buffer.WriteString("Hello, World!")
		fmt.Println(buffer.String())
}