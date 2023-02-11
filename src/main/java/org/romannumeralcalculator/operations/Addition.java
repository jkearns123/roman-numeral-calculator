package org.romannumeralcalculator.operations;

import org.romannumeralcalculator.Calculate;

public class Addition implements Calculate {
    @Override
    public int calculate(int valueA, int valueB) {
        return valueA + valueB;
    }
}
