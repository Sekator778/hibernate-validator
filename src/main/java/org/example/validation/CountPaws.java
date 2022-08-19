package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 6.1. Creating a simple constraint
 * To create a custom constraint, the following three steps are required:
 * Create a constraint annotation
 * Implement a validator
 * Define a default error message
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PawnsValidation.class)
public @interface CountPaws {
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
