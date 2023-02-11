package org.romannumeralcalculator.validation.constraints;

public class OperatorConstraint implements Validate {

    @Override
    public boolean validate(String input) {

        if (input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*")){
            return true;
        }else {
            return false;
        }
    }
}
