package CardFactoryExample.ConcreteProducts3;

import CardFactoryExample.AbstractProducts1.CardVerification;

public class DebitCardVerification implements CardVerification {
    @Override
    public void verifyCard() {
        System.out.println("Debit Card Verification");
    }
}
