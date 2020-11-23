package com.company;

public class Main {

    public static void main(String[] args) {
	//
    class BuildingManagementSystem }
    private Arraylist<building> building:
    BuildingManagementSystem(ArrayList<building> building) {

        this.items = items;
    }
    BuildingManagementSystem () {

        this(new ArrayList<building>());
    }
    public void addBuilding (building building) {
        if (!building.contains(building)) {
            building.add(building);
        }
    }
    public void removeBuilding (building building) {
        items.remove(building);
    }
    public double getBuildingManagementSystem () {
        double total = 0.0;
        for (building building: building) {
            total += building.getBuildingName();
        }
        return total;
    }
}
