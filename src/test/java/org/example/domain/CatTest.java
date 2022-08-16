package org.example.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private static Validator validator;

    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void whenCreateCatWithNotFourPawsThanExpectMessage() {
        Cat cat = new Cat(2);
        Set<ConstraintViolation<Cat>> constraintViolations =
                validator.validate(cat);
        assertEquals("invalid cat",
                constraintViolations.iterator().next().getMessage());
    }
    @Test
    void whenCreateCatWithFourPawsThanNoMessage() {
        Cat cat = new Cat(4);
        Set<ConstraintViolation<Cat>> constraintViolations =
                validator.validate(cat);
        Throwable exception = assertThrows(NoSuchElementException.class, ()-> constraintViolations.iterator().next());
       assertNull(exception.getMessage());
    }
}