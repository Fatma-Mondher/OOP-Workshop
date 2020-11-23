package com.company;

import java.util.ArrayList;

public abstract class BuildingManagementSystem {
    private String name;
    private int   nr ;

    BuildingManagementSystem (String name, int nr) {
        this.name = name;
        this.nr  = nr;

    }
    public String getName () {
        return name;
    }
    public int getNr() {
        return nr;
    }
    public String toString () {
        return "[Person name='"+name+"' nr='"+nr+"']";
    }
    public static void main (String args[]) { // subexercise 2
        ArrayList<building> ps = new ArrayList<building>();
        ps.add(new building("SDU" , 44));
        ps.add(new building("OUH" , 2));
        ps.add(new building("KU"  , 3));
        ps.add(new building("AU", 4));
        ps.add(new building("AAU", 5));

    }
    public void removeBulding () {
        for (int i=0 ; i<building.size() ; i++) {
            building item = building.get(i);
            try {
                boolean expired = building.remove();
                if (expired) {
                    items.remove(i);
                }
            } catch (UnsupportedOperationException e) {
            } }
    }


