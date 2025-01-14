package main

import (
	"encoding/json"
	"fmt"
)

type Person struct {
	Name string
	Age  int
}

func main() {
	p := Person{
		Name: "Gopher",
		Age:  10,
	}
	b, err := json.Marshal(p)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(string(b))
	jsonData := `{"Name":"Gopher","Age":20}`
	json.Unmarshal([]byte(jsonData), &p)
	fmt.Println(p)
}
