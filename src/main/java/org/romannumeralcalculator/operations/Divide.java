package org.romannumeralcalculator.operations;

import org.romannumeralcalculator.Calculate;

public class Divide implements Calculate {
    @Override
    public int calculate(int valueA, int valueB) {
        return valueA / valueB;
        //TODO: catch when dividing by zero
    }
}
