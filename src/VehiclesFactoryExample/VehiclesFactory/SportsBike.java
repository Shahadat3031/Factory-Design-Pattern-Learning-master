package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Bike;

// Concrete Products: Implement the product interfaces
public class SportsBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding Sports Bike");
    }
}
