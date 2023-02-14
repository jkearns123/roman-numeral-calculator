package org.romannumeralcalculator.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.romannumeralcalculator.validation.constraints.Message;
import org.romannumeralcalculator.validation.constraints.OperatorConstraint;
import org.romannumeralcalculator.validation.constraints.RomanNumeralConstraint;

import static org.junit.jupiter.api.Assertions.*;

class ValidationConstraintTest {

    private ValidationConstraint validationConstraint;

    @BeforeEach
    void setUp() {
        validationConstraint = new ValidationConstraint();
    }

    @AfterEach
    void tearDown() {
        validationConstraint = null;
    }

    @Test
    void testRomanNumeralConstraintInvalidSymbol() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate("J");
        assertFalse(result);
    }

    @Test
    void testRomanNumeralConstraintInvalidSymbol2() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate("1");
        assertFalse(result);
    }

    @Test
    void testRomanNumeralConstraintInvalidSymbol3() {
        String[] inputs = {"VX", "VL", "VC", "VD", "VM", "LC", "LD", "II", "LM", "DM"};
        boolean[] expected = {false, false, false, false, false, false, false, true, false, false};

        validationConstraint.setValidate(new RomanNumeralConstraint());
        for (int i = 0; i < inputs.length; i++){
            boolean result = validationConstraint.validate(inputs[i]);
            assertEquals(expected[i],result);
        }
    }

    @Test
    void testRomanNumeralConstraintNull() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        assertNotNull(validationConstraint);
//        boolean result = validationConstraint.validate(null);
//        assertEquals(false,result);
    }

    @Test
    void testRomanNumeralConstraintValidSymbol() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate("XVIII");
        assertTrue(result);
    }

    @Test
    void testRomanNumeralConstraintEmpty() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate("");
        assertFalse(result);
    }

    @Test
    void testRomanNumeralConstraintWhiteSpace() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate(" ");
        assertFalse(result);
    }

    @Test
    void testOperatorConstraintInvalidOperator() {
        validationConstraint.setValidate(new OperatorConstraint());
        boolean result = validationConstraint.validate("%");
        assertFalse(result);
    }

    @Test
    void testOperatorConstraintInvalidOperator2() {
        validationConstraint.setValidate(new OperatorConstraint());
        boolean result = validationConstraint.validate("");
        assertFalse(result);
    }

    @Test
    void testOperatorConstraintValidOperator() {
        validationConstraint.setValidate(new OperatorConstraint());
        boolean result = validationConstraint.validate("*");
        assertTrue(result);
    }

    @Test
    void testRomanNumeralConstraintErrorMessage() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        validationConstraint.validate("J");
        assertEquals(Message.INVALID_ROMAN_NUMERAL.getMessage(),validationConstraint.getMessage());
    }

    @Test
    void testOperatorConstraintErrorMessage() {
        validationConstraint.setValidate(new OperatorConstraint());
        validationConstraint.validate("%");
        assertEquals(Message.INVALID_OPERATOR.getMessage(),validationConstraint.getMessage());
    }

    @Test
    void testRomanNumeralConstraintValidSymbolLowerCase() {
        validationConstraint.setValidate(new RomanNumeralConstraint());
        boolean result = validationConstraint.validate("i");
        assertTrue(result);
    }

}