package org.example.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void whenTestUserNameMinLengthAndMaxLength() {
        User user = new User("Alex",
                            "abs@shpp.com",
                            25,
                            LocalDate.of(2020, 1, 8),
                            "admin"
                             );
        Set<ConstraintViolation<User>> constraintViolations =
                validator.validate(user);

        assertEquals(1, constraintViolations.size());
        assertEquals(
                "{custom.age.message}",
                constraintViolations.iterator().next().getMessage()

        );
    }
}