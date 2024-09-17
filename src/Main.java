import CardFactoryExample.AbstractFactory2.CardFactory;
import CardFactoryExample.AbstractProducts1.CardAuthorization;
import CardFactoryExample.AbstractProducts1.CardConfirmation;
import CardFactoryExample.AbstractProducts1.CardVerification;
import CardFactoryExample.ConcreteFactory4.CreditCardFactory;
import CardFactoryExample.ConcreteFactory4.DebitCardFactory;
import VehiclesFactoryExample.VehiclesFactory.LuxuryVehicleFactory;
import VehiclesFactoryExample.VehiclesFactory.SportsVehiclesFactory;
import VehiclesFactoryExample.inerfaces.Bike;
import VehiclesFactoryExample.inerfaces.Car;
import VehiclesFactoryExample.inerfaces.VehicleFactory;

// Client Code
// Abstract এ আমরা বলে দিবো কি কি ক্রিয়েট করবো, আর  Concrete এ তা ইমপ্লিমেনন্ট করবো
public class Main {
    public static void main(String[] args) {

//        VehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
//        Car luxuryCar = luxuryVehicleFactory.createCar();
//        Bike luxuryBike = luxuryVehicleFactory.createBike();
//        luxuryCar.ride();
//        luxuryBike.ride();
//
//        VehicleFactory sportsCarFactory = new SportsVehiclesFactory();
//        Car sportsCar = sportsCarFactory.createCar();
//        Bike sportsBike = sportsCarFactory.createBike();
//        sportsCar.ride();
//        sportsBike.ride();

        CardFactory creditCardFactory = new CreditCardFactory();
        CardVerification creditCardVerification =  creditCardFactory.createCardVerification();
        CardAuthorization creditCardAuthorization =  creditCardFactory.createCardAuthorization();
        CardConfirmation creditCardConfirmation =  creditCardFactory.createCardConfirmation();

        creditCardVerification.verifyCard();
        creditCardAuthorization.authorizeCard();
        creditCardConfirmation.confirmCard();

        CardFactory debitCardFactory = new DebitCardFactory();
        CardVerification debitCardVerification = debitCardFactory.createCardVerification();
        CardAuthorization debitCardAuthorization = debitCardFactory.createCardAuthorization();
        CardConfirmation debitCardConfirmation = debitCardFactory.createCardConfirmation();

        debitCardVerification.verifyCard();
        debitCardAuthorization.authorizeCard();
        debitCardConfirmation.confirmCard();
    }
}