package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicle> inventory;
    //add values until you call vehicles to do it
    private String name, address, phone;

    //Constructor
    public Dealership(String name, String address, String phone) {
        inventory = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.phone = phone;
        //How to deal with ArrayLists, particularly how to get info out of it
        //Dealership must be displayed through the first line
    }
    public ArrayList<Vehicle> getVehiclesByPrice() {
        if (Vehicle price : inventory) {
            return price;
        }
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel() {
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByYear() {
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByColor() {
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByMileage() {
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclesByType() {
        return inventory;
    }
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }
    //Past here is reading the file's vehicles one by one
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle() {
    }
}
//public void getVehiclesByPrice(min, max)

