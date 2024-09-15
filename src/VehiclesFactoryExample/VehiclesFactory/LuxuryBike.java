package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Bike;

// Concrete Products: Implement the product interfaces
public class LuxuryBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding Luxury Bike");
    }
}
