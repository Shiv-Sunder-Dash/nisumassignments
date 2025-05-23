package DAY_1;

// Parent class
class Q20_Vehicle {
    public void startEngine() {
        System.out.println("Starting a generic vehicle engine...");
    }
}

// Child class Car overrides startEngine()
class Car extends Q20_Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

// Child class Bike overrides startEngine()
class Bike extends Q20_Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started with kickstart.");
    }
}

// Main class to demonstrate dynamic polymorphism
class VehicleTest {
    public static void main(String[] args) {
        Q20_Vehicle myVehicle;

        myVehicle = new Car();   // Reference is Vehicle, object is Car
        myVehicle.startEngine(); // Outputs: Car engine started with key ignition.

        myVehicle = new Bike();  // Reference is Vehicle, object is Bike
        myVehicle.startEngine(); // Outputs: Bike engine started with kickstart.
    }
}
