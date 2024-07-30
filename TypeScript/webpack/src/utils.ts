export default class MathFuncs {
  constructor(public x: number, public y: number) {}
  add(): number {
    return this.x + this.y
  }

  mul(): number {
    return this.x * this.y
  }

  div(): number {
    return this.x / this.y
  }
}