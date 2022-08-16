package org.example.domain;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Currency;

import javax.money.MonetaryAmount;

public class CreditCard {
    @CreditCardNumber(ignoreNonDigitCharacters = true)
    private String lenientCreditCardNumber;
    @Currency("EUR")
    private MonetaryAmount balance;

    public void setLenientCreditCardNumber(String lenientCreditCardNumber) {
        this.lenientCreditCardNumber = lenientCreditCardNumber;
    }

    public void setBalance(MonetaryAmount balance) {
        this.balance = balance;
    }
}
