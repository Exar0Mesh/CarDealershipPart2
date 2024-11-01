package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership dealership = getDealership();
        try {


            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;


            while((input = bufReader.readLine()) != null) {
                if(input.startsWith("id")) {
                    continue;
                }
            }

            while ((input = bufReader.readLine()) != null) {

                String[] lineSplit = input.split(Pattern.quote("|"));

                int vin = Integer.parseInt(lineSplit[0]);
                int year = Integer.parseInt(lineSplit[1]);
                String make = lineSplit[2];
                String model = lineSplit[3];
                String vehicleType = lineSplit[4];
                String color = lineSplit[5];
                int odometer = Integer.parseInt(lineSplit[6]);
                float price = Float.parseFloat(lineSplit[7]);
                Vehicle something = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(something);

            }
            bufReader.close();
        } catch (IOException e) {
            e.getStackTrace();
            e.printStackTrace();
        }
        return dealership;
    }
    public void saveDealership() {

    }
}
