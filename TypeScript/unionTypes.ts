// unionTypes -> a combination of multiple types
let age: number | string = 21;
age = "24";


// type narrowing -> a type guard
if (typeof age === "string") {
  age = parseFloat(age);
}

