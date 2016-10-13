package org.cybermoose;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testconstraint() {
        HelloWorld hw = HelloWorld.builder()
                .id(1)
                .content("apan")
                .build();
        Set<ConstraintViolation<HelloWorld>> constraintViolations = validator.validate(hw);
        assertEquals(1, constraintViolations.size());
    }
}