package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Car;

// Concrete Products: Implement the product interfaces
public class SportsCar implements Car {
    @Override
    public void ride() {
        System.out.println("Riding Sports Car");
    }
}
