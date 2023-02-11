package org.romannumeralcalculator;

import org.romannumeralcalculator.operations.Addition;
import org.romannumeralcalculator.operations.Divide;
import org.romannumeralcalculator.operations.Multiply;
import org.romannumeralcalculator.operations.Subtraction;
import org.romannumeralcalculator.validation.ValidationConstraint;
import org.romannumeralcalculator.validation.constraints.OperatorConstraint;
import org.romannumeralcalculator.validation.constraints.RomanNumeralConstraint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidationConstraint validationConstraint = new ValidationConstraint();
        CalculatorOperations calculatorOperations = new CalculatorOperations();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roman Numeral");
        String romanNumeralA = scanner.nextLine();

        validationConstraint.setValidate(new RomanNumeralConstraint());

        if (!validationConstraint.validate(romanNumeralA)) {
            System.out.println(validationConstraint.getMessage());
        } else {
            System.out.println("Enter Operation");
            String operator = scanner.nextLine();
            validationConstraint.setValidate(new OperatorConstraint());
            if (!validationConstraint.validate(operator)) {
                System.out.println(validationConstraint.getMessage());
            } else {
                System.out.println("Enter Roman Numeral");
                String romanNumeralB = scanner.nextLine();
                validationConstraint.setValidate(new RomanNumeralConstraint());
                if (!validationConstraint.validate(romanNumeralB)) {
                    System.out.println(validationConstraint.getMessage());
                } else {
                    validationConstraint.setValidate(new RomanNumeralConstraint());
                    String result;
                    switch (operator) {
                        case "+":
                            calculatorOperations.setCalculate(new Addition());
                            result = calculatorOperations.executeCalculation(romanNumeralA, romanNumeralB);
                            if (!validationConstraint.validate(result)) {
                                System.out.println(validationConstraint.getMessage());
                            } else {
                                System.out.println(result);
                            }
                            break;
                        case "-":
                            calculatorOperations.setCalculate(new Subtraction());
                            result = calculatorOperations.executeCalculation(romanNumeralA, romanNumeralB);
                            if (!validationConstraint.validate(result)) {
                                System.out.println(validationConstraint.getMessage());
                            } else {
                                System.out.println(result);
                            }
                            break;
                        case "*":
                            calculatorOperations.setCalculate(new Multiply());
                            result = calculatorOperations.executeCalculation(romanNumeralA, romanNumeralB);
                            if (!validationConstraint.validate(result)) {
                                System.out.println(validationConstraint.getMessage());
                            } else {
                                System.out.println(result);
                            }
                            break;
                        case "/":
                            calculatorOperations.setCalculate(new Divide());
                            result = calculatorOperations.executeCalculation(romanNumeralA, romanNumeralB);
                            if (!validationConstraint.validate(result)) {
                                System.out.println(validationConstraint.getMessage());
                            } else {
                                System.out.println(result);
                            }
                            break;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }
        }

        scanner.close();
    }
}