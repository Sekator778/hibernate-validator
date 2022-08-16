package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PawnsValidation.class)
public @interface CountPaws {
    String message();
    Class<?>[] groups() default {};
    public abstract Class<? extends Payload> [] payload() default {};

}
