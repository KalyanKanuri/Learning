// Classes -> classes are blueprints for creating objects
class Something {
  // fields
  // methods
}

// constructors -> a function that is called when an object is created
class Ball {
  shape: string;
  color: string;
  constructor(shape: string, color: string) {
    this.shape = shape;
    this.color = color;
  }
}

// inheritance -> a class that inherits from another class
class Point {
  x: number;
  y: number;
  constructor(x: number, y: number) {
    this.x = x;
    this.y = y;
  }
}

class CustomLocation extends Point {
  constructor(x: number, y: number) {
    super(x, y);
  }
}

// readonly modifier -> a field that can only be read and cannot be modified
class Car {
  readonly name: string;
  constructor(name: string) {
    this.name = name;
  }
}

// public modifier -> a field that can be accessed from anywhere
class Person {
  public name: string; // all th fields are public by default
  constructor(name: string) {
    this.name = name;
  }
}

// private modifier -> fields that can only be accessed within the class
class Animal {
  private _name: string; // we can use #name instead of name which is builtin js modifier 
  constructor(name: string) {
    this._name = name;
  }
}

// protected modifier -> fields that can only be accessed within the class and its subclasses
class Shape {
  protected _name: string;
  constructor(name: string) {
    this._name = name;
  }
}

class Circle extends Shape {
  constructor(name: string) {
    super(name);
  }
}

// getters -> a function that returns the value of a private field
class Vehicle {
  private _name: string;
  constructor(name: string) {
    this._name = name;
  }
  get getName(): string {
    return this._name;
  }
}

let vehicle = new Vehicle("Car");
vehicle.getName;

// setters -> a function that sets the value of a private field
class Employee {
  private _name: string;
  constructor(name: string) {
    this._name = name;
  }
  set setName(name: string) {
    this._name = name;
  }
}

let emp = new Employee("John");
emp.setName = "Jane";


// interfaces with classes -> a class can implement an interface

interface Mobile {
  brand: string,
  price: number,
  color: string,
  display(): void
}

class Phone implements Mobile {
  constructor(
    public brand:  string, 
    public price : number, 
    public color: string
  ) {}

  display(): void {
    console.log(this.brand, this.price, this.color);
  }
}

// abstract classes -> a class that cannot be instantiated but can be inherited
abstract class Business {
  constructor(public name: string) {}
  abstract calculateProfit(): number;
}

class SmallBusiness extends Business {
  constructor(
    public name: string,
    private rate: number,
    private time: number,
    private commission: number
  ) {
    super(name);
  }
  calculateProfit(): number {
    return this.rate * this.time + this.commission;
  }
}

class BigBusiness extends Business {
  constructor(
    public name: string,
    private rate: number,
    private time: number,
    private commission: number,
    private expenses: number

  ) {
    super(name);
  }
  calculateProfit(): number {
    return this.rate * this.time + this.commission - this.expenses;
  }
}