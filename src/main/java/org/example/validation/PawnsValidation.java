package org.example.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.domain.Cat;

public class PawnsValidation implements ConstraintValidator<CountPaws, Cat> {
    @Override
    public boolean isValid(Cat cat, ConstraintValidatorContext constraintValidatorContext) {
        return cat.getCountPaws() == 4;
    }

    @Override
    public void initialize(CountPaws constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
