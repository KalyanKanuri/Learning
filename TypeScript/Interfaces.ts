// interface -> a type that describes an object
interface Place {
  x: number;
  y: number;
}

const coordinates: Place = {
  x: 10,
  y: 20,
};

// interface methods -> a type that describes a function
interface Vehicle {
  describeVehicle: () => string;
  travelTo(point: Point): void;
}

const car: Vehicle = {
  describeVehicle: () => "I'm a car",
  travelTo: (point: Point) => {
    console.log(`I'm traveling to ${point.x}, ${point.y}`);
  },
};

car.travelTo(coordinates);

// inheritance -> a way to create a new class from an existing class
interface Animal {
  name: string;
  age: number;
}



interface Dog extends Animal {
  breed: string;
}


const dog: Dog = {
  name: "Buddy",
  age: 5,
  breed: "Labrador",
};

// multi level inheritance -> a class can inherit from multiple interfaces
interface Person {
  name: string;
  age: number;
}


interface Employee {
  readonly employeeId: string;
}


interface Developer extends Person, Employee {
  skillset: string[];
}


const dev: Developer = {
  name: "John",
  age: 25,
  employeeId: "12345",
  skillset: ["JavaScript", "TypeScript", "Python"],
};


// difference between interface and type-alias
// type-alias cannot be extended
// interfaces are only implmented on objects