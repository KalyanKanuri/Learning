// generics -> a way to create reusable components
function identity<T>(arg: T): T {
    return arg;
}

function randomIdentity<T>(arg: T[]): T {
    let randomIndex = Math.floor(Math.random() * arg.length);
    return arg[randomIndex];
}

let output1 = randomIdentity<string>(["Kalyan", "Sriya", "Sri"]);
let output2 = randomIdentity<number>([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]);
console.log(output1, output2);

// multi generics -> combination of multiple types
function merge<T, U>(obj1: T, obj2: U) { 
  return {
    ...obj1,
    ...obj2,
  };
}

let result = merge({name: "Kalyan"}, {age: 21});
console.log(result)

// type constraints -> a way to restrict types
function extractAndConvert<T extends object, U extends keyof T>(obj: T, key: U) {
    return obj[key];
}

let output3 = extractAndConvert({name: "Kalyan"}, "name");
console.log(output3)

// default type parameters
function createArray<T = string>(length: number, value: T): T[] {
  let arr: T[] = [];
  for (let i = 0; i < length; i++) {
    arr[i] = value;
  }
  return arr;
}

let output4 = createArray(3, "Kalyan");
console.log(output4)

// generic classes -> a class that can work with any type
class GenericClass<T> {
  private data: T;
  constructor(data: T) {
    this.data = data;
  }
  get Data(): T {
    return this.data;
  }
}

let obj = new GenericClass("Kalyan");
console.log(obj.Data)