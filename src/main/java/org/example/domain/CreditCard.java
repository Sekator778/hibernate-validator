package org.example.domain;

import org.hibernate.validator.constraints.CreditCardNumber;

public class CreditCard {
    @CreditCardNumber(ignoreNonDigitCharacters = true)
    private String lenientCreditCardNumber;

}
