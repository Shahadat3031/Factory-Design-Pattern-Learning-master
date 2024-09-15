package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardConfirmation;

public class CreditCardConfirmation implements CardConfirmation {
    @Override
    public void confirmCard() {
        System.out.println("Credit Card Confirmation");
    }
}
