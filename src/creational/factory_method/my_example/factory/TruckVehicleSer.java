package creational.factory_method.my_example.factory;


import creational.factory_method.my_example.vihecle.TruckVehicle;
import creational.factory_method.my_example.vihecle.Vehicle;

public class TruckVehicleSer extends VehicleSer {

    @Override
    public Vehicle createVehicle() {
        return new TruckVehicle();
    }
}
