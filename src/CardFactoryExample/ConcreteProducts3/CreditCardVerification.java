package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardVerification;

public class CreditCardVerification implements CardVerification {
    @Override
    public void verifyCard() {
        System.out.println("Credit Card Verification");
    }
}
