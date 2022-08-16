package org.example.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.money.Monetary;
import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    private static Validator validator;
    Set<ConstraintViolation<CreditCard>> constraintViolations;

    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    void whenRightCardNumberThenEmptyViolations() {
        CreditCard card = new CreditCard();
        card.setLenientCreditCardNumber("7992-7398-713");
        constraintViolations = validator.validateProperty(card, "lenientCreditCardNumber");
        assertTrue(constraintViolations.isEmpty());
    }
    @Test
    void whenWrongLength() {
        CreditCard card = new CreditCard();
        card.setBalance(Money.of(new BigDecimal(100.0), Monetary.getCurrency("EUR")));
        constraintViolations = validator.validateProperty(card, "balance");
        assertEquals(0, constraintViolations.size());
    }

}