package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardConfirmation;

public class DebitCardConfirmation implements CardConfirmation {
    @Override
    public void confirmCard() {
        System.out.println("Debit Card Confirmation");
    }
}
