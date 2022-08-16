//package org.example;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Iterator;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//import java.util.Set;
//
//
///**
// *
// * @author Adedayo Ominiyi
// */
//public class ValidationAPIUnitTest {
//
//    public ValidationAPIUnitTest() {
//    }
//
//    @Test
//    public void testMemberWithNoValues() {
//        Member member = new Member();
//
//        // validate the input
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<Member>> violations = validator.validate(member);
//        assertEquals(violations.size(), 5);
//    }
//}
