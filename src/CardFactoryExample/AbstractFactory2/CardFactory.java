package CardFactoryExample.AbstractFactory2;

import CardFactoryExample.AbstractProducts1.CardAuthorization;
import CardFactoryExample.AbstractProducts1.CardConfirmation;
import CardFactoryExample.AbstractProducts1.CardVerification;

public interface CardFactory {
    CardVerification createCardVerification();
    CardAuthorization createCardAuthorization();
    CardConfirmation createCardConfirmation();
}
