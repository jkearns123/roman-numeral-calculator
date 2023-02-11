package org.romannumeralcalculator.operations;

import org.romannumeralcalculator.Calculate;

public class Multiply implements Calculate {
    @Override
    public int calculate(int valueA, int valueB) {
        return valueA * valueB;
    }
}
