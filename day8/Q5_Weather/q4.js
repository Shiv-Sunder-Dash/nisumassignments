class Car {
  constructor(brand, speed) {
    this.brand = brand;
    this.speed = speed;
  }

  accelerate() {
    this.speed += 10;
    console.log(`${this.brand} is going at ${this.speed} km/h`);
  }
}

// Example usage:
const myCar = new Car('Toyota', 50);
myCar.accelerate(); // Toyota is going at 60 km/h
