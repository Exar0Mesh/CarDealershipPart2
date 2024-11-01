package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
    }

    public void display() {
        this.init();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Price");
            System.out.println("2) Make/Model");
            System.out.println("3) Year");
            System.out.println("4) Color");
            System.out.println("5) Mileage");
            System.out.println("6) Vehicle Type");
            System.out.println("7) All Vehicles");

            System.out.println("8) Add Vehicles");
            System.out.println("9) Remove Vehicles");

            System.out.println("10) Exit");

            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    break;
            }
            break;
        }
    }
    private void init() {
        DealershipFileManager dealFile = new DealershipFileManager();
        this.dealership = dealFile.getDealership();
    }
    private static void displayVehicles(ArrayList<Vehicle> buh) {
        for (Vehicle make : buh) {
            System.out.println(make.getMake());
        }
        for (Vehicle model : buh) {
            System.out.println(model.getModel());
        }
        for (Vehicle vin : buh) {
            System.out.println(vin.getVin());
        }
        for (Vehicle year : buh) {
            System.out.println(year.getYear());
        }
        for (Vehicle type : buh) {
            System.out.println(type.getVehicleType());
        }
        for (Vehicle color: buh) {
            System.out.println(color.getColor());
        }
        for (Vehicle odometer : buh) {
            System.out.println(odometer.getOdometer());
        }
        for (Vehicle price : buh) {
            System.out.println(price.getPrice());
        }
    }
    private void processAllVehicleRequest() {
        displayVehicles(dealership.getAllVehicles());
    }
    private void processByPriceRequest() {
        displayVehicles(dealership.getVehiclesByPrice());
    }
    private void processByMakeModelRequest() {
        displayVehicles(dealership.getVehiclesByMakeModel());
    }
    private void processByYearRequest() {
        displayVehicles(dealership.getVehiclesByYear());
    }
    private void processByColorRequest() {
        displayVehicles(dealership.getVehiclesByColor());
    }
    private void processByMileageRequest() {
        displayVehicles(dealership.getVehiclesByMileage());
    }
    private void processByVehicleTypeRequest() {
        displayVehicles(dealership.getVehiclesByType());
    }
        //Here is all the vehicles. Probably needs display vehicles

}
