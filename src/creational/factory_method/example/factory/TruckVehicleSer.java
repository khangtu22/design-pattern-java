package creational.factory_method.example.factory;


import creational.factory_method.example.vehicle.TruckVehicle;
import creational.factory_method.example.vehicle.Vehicle;

public class TruckVehicleSer extends VehicleSer {

    @Override
    public Vehicle createVehicle() {
        return new TruckVehicle();
    }
}
