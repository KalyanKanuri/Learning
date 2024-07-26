// arrays -> an array is a collection of values
const names: string[] = ["Elton", "Kalyan", "Kiran"];
const numbers: number[] = [1, 2, 3];
const booleans: boolean[] = [true, false, true];

// common syntax Arrat<string>
const names2: Array<string> = ["Elton", "Kalyan", "Kiran"];
const numbers2: Array<number> = [1, 2, 3];
const booleans2: Array<boolean> = [true, false, true];

// custom object type arrays
type Point = {
  x: number,
  y: number
}

const coords: Array<Point> = [
  { x: 23, y: 45 },
  { x: 12, y: 34 },
];


// Multi dimensional arrays -> an array of arrays
const matrix: Array<Array<number>> = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];

const matrix2: number[][] = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];
