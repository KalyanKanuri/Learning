import { add } from './tsModules';
import calc from './tsModules';
import { PI } from './tsModules';

console.log(add(2, 3));
const cal = new calc()
console.log(cal.multiply(2, 3));
console.log(PI);