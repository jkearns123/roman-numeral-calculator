package org.romannumeralcalculator.validation.constraints;

public enum Message {

    INVALID_OPERATOR("Not a valid operator, please use (+,-,/,*)"),
    INVALID_ROMAN_NUMERAL("Not a valid roman numeral"),
    INVALID_INPUT("Input should not be blank,empty or null");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
