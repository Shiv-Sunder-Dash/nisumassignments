package DAY_1;
class Q14_Vehicle {
    String brand;
    int speed;
    public Q14_Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends Q14_Vehicle {
    int seatingCapacity;
    public Car(String brand, int speed, int seatingCapacity) {
        super(brand, speed);
        this.seatingCapacity = seatingCapacity;
    }
    public void displayCarInfo() {
        System.out.println("----- Car Info -----");
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}
class Bus extends Q14_Vehicle {
    int passengerCapacity;
    public Bus(String brand, int speed, int passengerCapacity) {
        super(brand, speed);
        this.passengerCapacity = passengerCapacity;
    }
    public void displayBusInfo() {
        System.out.println("----- Bus Info -----");
        displayInfo();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}
class TransportInfo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 5);
        Bus bus = new Bus("Volvo", 120, 50);
        car.displayCarInfo();
        System.out.println();
        bus.displayBusInfo();
    }
}
