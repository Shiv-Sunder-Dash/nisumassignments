package DAY_1;
class Q20_Vehicle {
    public void startEngine() {
        System.out.println("Starting a generic vehicle engine...");
    }
}
class Car1 extends Q20_Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}
class Bike extends Q20_Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started with kickstart.");
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Q20_Vehicle myVehicle;
        myVehicle = new Car1();
        myVehicle.startEngine();
        myVehicle = new Bike();
        myVehicle.startEngine();
    }
}
