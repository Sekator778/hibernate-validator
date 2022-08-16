package org.example.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

class StudentTest {
    private final Logger LOGGER = LoggerFactory.getLogger(StudentTest.class);

    @Test
    void getDateOfBirth() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = factory.getValidator();
            Student student = new Student();
            student.setWorking(true);
            student.setAboutMe("some info");
            student.setAge(44);
            Set<ConstraintViolation<Student>> constraintViolations =
                    validator.validate(student);

            for (ConstraintViolation<Student> violation : constraintViolations
            ) {
                LOGGER.error(violation.getMessage());
            }
        }
    }
}