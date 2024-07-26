// object -> an object is a collection of properties, here cat is an object
const cat = {
  name: "Elton",
  breed: "shepard"
}

// nested object -> here address is an object within the house object
const house = {
  color: "blue",
  address: {
    street: "123 Main St",
    city: "Seattle",
    state: "WA"
  }
}

// type-alias -> a type alias is a new name for an existing type
type MyNum = number;
const alpha: MyNum = 1;

// object types -> a type that describes an object
type Cat = {
  name: string;
  breed: string;
}

type House = {
  color: string;
  address: {
    street: string;
    city: string;
    state: string;
  }
}

// optional properties -> a property that is optional
type HouseWithOptionalColor = {
  color?: string;
  address: {
    street: string;
    city: string;
    state: string;
  }
}

// readonly modifier -> a property that cannot be reassigned
type HouseWithReadonlyColor = {
  readonly color: string;
  address: {
    street: string;
    city: string;
    state: string;
  }
}

// intersection types -> a type that combines multiple types
type HouseWithOptionalColorAndReadonlyColor = HouseWithOptionalColor & HouseWithReadonlyColor;