package com.company;

import com.company.Unit;

public class Actuator extends Unit {
    double value;

    private void Actuator (double value) {
        this.value = value
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
