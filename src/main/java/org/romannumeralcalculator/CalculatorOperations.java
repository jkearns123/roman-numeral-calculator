package org.romannumeralcalculator;

import org.romannumeralcalculator.util.ConvertRomanNumeral;

public class CalculatorOperations {

    private Calculate calculate;
    ConvertRomanNumeral convertRomanNumeral = new ConvertRomanNumeral();

    public void setCalculate(Calculate calculate){
        this.calculate = calculate;
    }

    public String executeCalculation(String valueA, String valueB){
        return convertRomanNumeral.convertNumericValueToRomanNumeralSymbol(calculate.calculate(convertRomanNumeral.convertRomanNumeralSymbolToNumericValue(valueA.toUpperCase()), convertRomanNumeral.convertRomanNumeralSymbolToNumericValue(valueB.toUpperCase())));
    }
}
