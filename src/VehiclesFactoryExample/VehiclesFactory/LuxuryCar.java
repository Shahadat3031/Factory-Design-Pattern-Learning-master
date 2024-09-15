package VehiclesFactoryExample.VehiclesFactory;

import VehiclesFactoryExample.inerfaces.Car;

// Concrete Products: Implement the product interfaces
public class LuxuryCar implements Car {
    @Override
    public void ride()                                                                              {
        System.out.println("Riding Luxury Car");
    }
}
