package org.example.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.domain.User;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements ConstraintValidator<Age, User> {

    @Override
    public void initialize(Age constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        Period between = Period.between(user.getBirthday(), LocalDate.now());
        return between.getYears() == user.getAge();
    }
}
