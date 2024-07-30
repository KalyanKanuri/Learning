interface Animal {
  name: string;
  sound: string;
  makeSound(): void;  
}

interface Dog extends Animal {
  name: string;
  breed: string;
  sound: string;
  makeSound(): void;
}