package org.romannumeralcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.romannumeralcalculator.operations.Addition;
import org.romannumeralcalculator.operations.Divide;
import org.romannumeralcalculator.operations.Multiply;
import org.romannumeralcalculator.operations.Subtraction;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorOperationsTest {

    private CalculatorOperations calculatorOperations;

    @BeforeEach
    void setUp() {
        calculatorOperations = new CalculatorOperations();
    }

    @AfterEach
    void tearDown() {
        calculatorOperations = null;
    }

    @Test
    void testAddition1() {
        calculatorOperations.setCalculate(new Addition());
        String result = calculatorOperations.executeCalculation("I", "II");
        assertEquals("III", result);
    }

    @Test
    void testAddition2() {
        calculatorOperations.setCalculate(new Addition());
        String result = calculatorOperations.executeCalculation("C", "III");
        assertEquals("CIII", result);
    }

    @Test
    void testSubtraction() {
        calculatorOperations.setCalculate(new Subtraction());
        String result = calculatorOperations.executeCalculation("D", "C");
        assertEquals("CD", result);
    }

    @Test
    void testMultiplication() {
        calculatorOperations.setCalculate(new Multiply());
        String result = calculatorOperations.executeCalculation("X", "L");
        assertEquals("D", result);
    }

    @Test
    void testMultiplication2() {
        calculatorOperations.setCalculate(new Multiply());
        String result = calculatorOperations.executeCalculation("L", "X");
        assertEquals("D", result);
    }

    @Test
    void testDivision() {
        calculatorOperations.setCalculate(new Divide());
        String result = calculatorOperations.executeCalculation("C", "LI");
        assertEquals("I", result);
    }



}