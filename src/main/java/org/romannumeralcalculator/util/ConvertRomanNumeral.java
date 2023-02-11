package org.romannumeralcalculator.util;

public class ConvertRomanNumeral {

    Object[][] map = {{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}};

    public int convertRomanNumeralSymbolToNumericValue(String romanNumeralSymbols) {
        int numericValue = 0;

        for (int i = 0; i < romanNumeralSymbols.length(); i++) {
            char symbol = romanNumeralSymbols.charAt(i);

            switch (symbol) {
                case 'I':
                    numericValue += 1;
                    break;
                case 'V':
                    numericValue += 5;
                    if (i > 0 && romanNumeralSymbols.charAt(i - 1) == 'I') {
                        numericValue -= 2;
                    }
                    break;
                case 'X':
                    numericValue += 10;
                    if (i > 0 && romanNumeralSymbols.charAt(i - 1) == 'I') {
                        numericValue -= 2;
                    }
                    break;
                case 'L':
                    numericValue += 50;
                    break;
                case 'C':
                    numericValue += 100;
                    if (i > 0 && romanNumeralSymbols.charAt(i - 1) == 'X') {
                        numericValue -= 20;
                    }
                    break;
                case 'D':
                    numericValue += 500;
                    break;
                case 'M':
                    numericValue += 1000;
                    break;
                default:
                    break;
            }

        }

        return numericValue;

    }

    public String convertNumericValueToRomanNumeralSymbol(int number) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            while (number >= (int) map[i][0]) {
                result.append(map[i][1]);
                number -= (int) map[i][0];
            }
        }
        return result.toString();
    }
}
