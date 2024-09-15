package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardAuthorization;

public class CreditCardAuthorization implements CardAuthorization {
    @Override
    public void authorizeCard() {
        System.out.println("Credit Card Authorization");
    }
}
