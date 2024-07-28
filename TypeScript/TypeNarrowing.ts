// Type Gaurds -> a way to check if a type is valid or not
function isPerson(age: number | string): boolean {
  if (typeof age === "number") {
    return age > 0;
  } else {
    return age.length > 0;
  }
}

// truthiness gaurd -> checks if a value is truthy or falsy
function printName(name?: string) {
  if (!name) {
    console.log("No name provided");
  } else {
    console.log(name.toUpperCase());
  }
}

// equality narrowing -> a way to check if two values are equal
function printAge(age: number | string) {
  if (age === 21) {
    console.log("Age is 21");
  } else {
    console.log("please provide a number");
  }
}

// in operator -> a way to check if a value is present in an array or object
function printCar(car: string | number) {
  if (car in ["audi", "bmw", "mercedes"]) {
    console.log("Car is present");
  } else {
    console.log("Car is not present");
  }
}

// instanceof operator -> a way to check if an object is an instance of a class
class Car {
  constructor(public name: string, public launchYear: number) {}
}

const bmw = new Car("bmw", 2019);

function checkInstance(car: Car | string) {
  if (car instanceof Car) {
    console.log(`${car.name} is insatnce of class Car`);
  } else {
    console.log("please provide a valid car instance");
  }
}

// type predicates -> custom functions that can narrow the type of a value
interface Cat {
  name: string,
  breed: string,
  meow: boolean
}

interface Dog {
  name: string,
  age: number
  breed: string
}

function isCat(pet: Cat | Dog): pet is Cat {
  return (pet as Cat).meow !== undefined;
}

// discriminated unions -> involves creating a literal type that is common across multiple types and then used to discriminate
interface Circle {
  kind: "circle";
  area: number;
}

interface square {
  kind: "square";
  area: number;
}

function getArea(shape: Circle | square) {
  switch (shape.kind) {
    case "circle":
      return Math.PI * shape.area;
    case "square":
      return shape.area;
  }
}