package main

import "fmt"

type shape interface {
	getArea() float64
}

type triangle struct {
	base   float64
	height float64
}

type square struct {
	sideline float64
}

func (t triangle) getArea() float64 {
	return 0.5 * t.base * t.height
}

func (s square) getArea() float64 {
	return s.sideline * s.sideline
}
func printArea(s shape) {
	fmt.Println("Area: ", s.getArea())
}

func main() {
	t := triangle{
		base:   3,
		height: 10,
	}

	s := square{
		sideline: 4,
	}

	printArea(t)
	printArea(s)
}
