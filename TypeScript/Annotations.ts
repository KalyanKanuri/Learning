// the String 
const myCar: string = "BMW";

// number
const num: number = 1;

// booleans
const isMarried: boolean = false;

// any
const something: any = "doSomething";

// void -> a function which will not return anything will have a void type
function doSomething(): void {
  let a = "b";
}

// never type -> a function which never returns anything
function someLoop(): never {
  while (true) {
    console.log("loop running");
  }
} 