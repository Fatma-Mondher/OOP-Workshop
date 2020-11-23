package com.company;

import com.company.Unit;

public class Actuator extends Unit {
    double value;
    String building;

    public void setBuilding(String building) {
        this.building = building;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getBuilding() {
        return building;
    }
}
