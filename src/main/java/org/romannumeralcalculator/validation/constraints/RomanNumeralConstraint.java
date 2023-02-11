package org.romannumeralcalculator.validation.constraints;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumeralConstraint implements Validate {
    
    private static final Pattern PATTERN = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    @Override
    public boolean validate(String input) {
        Matcher matcher = PATTERN.matcher(input);

        if (input == null || input.isEmpty() || input.trim().isEmpty()){
            return false;
        } else if (!matcher.matches()) {
            return false;
        }else {
            return true;
        }
    }
}
