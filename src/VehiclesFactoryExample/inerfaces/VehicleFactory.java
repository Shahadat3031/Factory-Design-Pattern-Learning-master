package VehiclesFactoryExample.inerfaces;

// Concrete Factories - Implement the factory interface to create concrete products.
public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
