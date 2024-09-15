package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardAuthorization;

public class DebitCardAuthorization implements CardAuthorization {
    @Override
    public void authorizeCard() {
        System.out.println("Debit Card Authorization");
    }
}
