package CardFactoryExample.ConcreteFactory4;

import CardFactoryExample.AbstractFactory2.CardFactory;
import CardFactoryExample.AbstractProducts1.CardAuthorization;
import CardFactoryExample.AbstractProducts1.CardConfirmation;
import CardFactoryExample.AbstractProducts1.CardVerification;
import CardFactoryExample.ConcreteProducts3.DebitCardAuthorization;
import CardFactoryExample.ConcreteProducts3.DebitCardConfirmation;
import CardFactoryExample.ConcreteProducts3.DebitCardVerification;

public class DebitCardFactory implements CardFactory {
    @Override
    public CardVerification createCardVerification() {
        return new DebitCardVerification();
    }

    @Override
    public CardAuthorization createCardAuthorization() {
        return new DebitCardAuthorization();
    }

    @Override
    public CardConfirmation createCardConfirmation() {
        return new DebitCardConfirmation();
    }
}
