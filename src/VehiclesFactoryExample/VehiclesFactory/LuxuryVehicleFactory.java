package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Bike;
import VehiclesFactoryExample.inerfaces.Car;
import VehiclesFactoryExample.inerfaces.VehicleFactory;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }

    @Override
    public Bike createBike() {
        return new LuxuryBike();
    }
}
