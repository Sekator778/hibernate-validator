package org.example.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

class StudentDTOTest {
    private final Logger LOGGER = LoggerFactory.getLogger(StudentDTOTest.class);

    @Test
    void getDateOfBirth() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = factory.getValidator();
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setWorking(true);
            studentDTO.setAboutMe("some info");
            studentDTO.setAge(44);
            Set<ConstraintViolation<StudentDTO>> constraintViolations =
                    validator.validate(studentDTO);

            for (ConstraintViolation<StudentDTO> violation : constraintViolations
            ) {
                LOGGER.error(violation.getMessage());
            }
        }
    }
}