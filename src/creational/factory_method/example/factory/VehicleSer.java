package creational.factory_method.example.factory;

import creational.factory_method.example.vehicle.Vehicle;

public abstract class VehicleSer {
    public void makeVehicle(){
        Vehicle truck1 = createVehicle();
        truck1.buy();
    }
    public abstract Vehicle createVehicle();
}
