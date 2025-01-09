package main

import "fmt"

type Vehicle interface {
	Start()
	Stop()
	Accelerate()
}

type Car struct {
	Model string
	year  int
}

func (c Car) Start() {
	fmt.Println("Car started")
}

func (c Car) Stop() {
	fmt.Println("Car stopped")
}

func (c Car) Accelerate() {
	fmt.Println("Car accelerated")
}

type electricBike struct {
	Brand   string
	Battery int
}

func (e electricBike) Start() {
	fmt.Println("Bike started")
}

func (e electricBike) Stop() {
	fmt.Println("Bike stopped")
}

func (e electricBike) Accelerate() {
	fmt.Println("Bike accelerated")
}

func OperateVehicle(v Vehicle) {
	v.Start()
	v.Accelerate()
	v.Stop()
}

func main() {
	car := Car{"Toyota", 2020}
	bike := electricBike{"Tesla", 100}

	OperateVehicle(car)
	OperateVehicle(bike)
}
