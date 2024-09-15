package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Bike;
import VehiclesFactoryExample.inerfaces.Car;
import VehiclesFactoryExample.inerfaces.VehicleFactory;

//Concrete Factories: Implement the factory interface to create concrete products.
public class SportsVehiclesFactory implements VehicleFactory {
    public Car createCar() {
        return new SportsCar();
    }

    @Override
    public Bike createBike() {
        return new SportsBike();
    }
}
