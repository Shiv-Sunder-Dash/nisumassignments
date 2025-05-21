const numbers = [1, 2, 3, 4, 5, 6, 7, 8];
const evenSquares = numbers
  .filter(num => num % 2 === 0)
  .map(num => num * num);

console.log(evenSquares); // Output: [4, 16, 36, 64]
