package com.company;

import java.util.UUID;

public class Unit {
    String name;
    UUID id;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
