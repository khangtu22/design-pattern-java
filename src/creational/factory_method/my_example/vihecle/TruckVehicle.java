package creational.factory_method.my_example.vihecle;

public class TruckVehicle implements Vehicle{

    @Override
    public void buy() {
        System.out.println("Bought a truck.");
        drive();
    }

    @Override
    public void drive() {
        System.out.println("Took a ride.");
    }
}
