package creational.factory_method.my_example.factory;

import creational.factory_method.my_example.vihecle.Vehicle;

public abstract class VehicleSer {
    public void makeVehicle(){
        Vehicle truck1 = createVehicle();
        truck1.buy();
    }
    public abstract Vehicle createVehicle();
}
