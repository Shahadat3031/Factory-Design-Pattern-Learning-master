package CardFactoryExample.ConcreteFactory4;

import CardFactoryExample.AbstractFactory2.CardFactory;
import CardFactoryExample.AbstractProducts1.CardAuthorization;
import CardFactoryExample.AbstractProducts1.CardConfirmation;
import CardFactoryExample.AbstractProducts1.CardVerification;
import CardFactoryExample.ConcreteProducts3.CreditCardAuthorization;
import CardFactoryExample.ConcreteProducts3.CreditCardConfirmation;
import CardFactoryExample.ConcreteProducts3.CreditCardVerification;

public class CreditCardFactory implements CardFactory {
    @Override
    public CardVerification createCardVerification() {
        return new CreditCardVerification();
    }

    @Override
    public CardAuthorization createCardAuthorization() {
        return new CreditCardAuthorization();
    }

    @Override
    public CardConfirmation createCardConfirmation() {
        return new CreditCardConfirmation();
    }
}
