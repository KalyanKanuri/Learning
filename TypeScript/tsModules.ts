// modules -> modules are just a way to organize code
export function add(a: number, b: number): number {
  return a + b;
}

export default class Calculator {
  multiply(a: number, b: number): number {
    return a * b;
  }
}

export const PI = 3.14;

// the functions or classes or constants which are to be exported and can be used by importing in other files are called modules