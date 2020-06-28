package creational.factory_method.my_example;

import creational.factory_method.my_example.factory.TruckVehicleSer;
import creational.factory_method.my_example.factory.VehicleSer;

public class Demo {
    private static VehicleSer vehicleSer;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        vehicleSer = new TruckVehicleSer();
    }

    static void runBusinessLogic() {
        vehicleSer.makeVehicle();
    }

}
