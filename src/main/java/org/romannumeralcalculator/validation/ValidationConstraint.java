package org.romannumeralcalculator.validation;

import org.romannumeralcalculator.validation.constraints.Message;
import org.romannumeralcalculator.validation.constraints.OperatorConstraint;
import org.romannumeralcalculator.validation.constraints.RomanNumeralConstraint;
import org.romannumeralcalculator.validation.constraints.Validate;

public class ValidationConstraint {
    private Validate validate;

    public void setValidate(Validate validate) {
        this.validate = validate;
    }

    public boolean validate(String input){
        return this.validate.validate(input);
    }

    public String getMessage(){
        if (validate instanceof RomanNumeralConstraint){
            return Message.INVALID_ROMAN_NUMERAL.getMessage();
        } else {
            return Message.INVALID_OPERATOR.getMessage();
        }
    }


}
