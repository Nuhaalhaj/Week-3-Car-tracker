
package com.mycompany.car.tracker;


public class Car {
     String plateNumber;
    String model;
    int mileage;
    double fuelLevel;
    double Capacity;

    
    public Car(String plateNumber, String model,
               double fuelLevel, double Capacity) {

        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.Capacity = Capacity;
    }


    
    public void drive(int km) {

        double fuelNeeded = km / 10.0;

        if (fuelNeeded <= fuelLevel) {

            mileage += km;
            fuelLevel -= fuelNeeded;

            System.out.println("Driven " + km + " km.");

        } else {

            System.out.println("Not enough fuel for this trip!");
        }
    }



    public void refuel(double amount) {

        if (fuelLevel + amount <= Capacity) {

            fuelLevel += amount;

            System.out.println(
                    amount + " liters of fuel added.");

        } else {

            double fuelAdded = Capacity - fuelLevel;
            double extraFuel = amount - fuelAdded;

            fuelLevel = Capacity;

            System.out.println("Tank is full.");
            System.out.println(
                    "Extra fuel discarded: "
                    + extraFuel + " liters.");
        }
    }


    public void checkStatus() {

        System.out.println("CAR STATUS");
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Fuel Level: " + fuelLevel + " liters");

        if (fuelLevel < Capacity * 0.10) {

            System.out.println("Low fuel warning!");
        }}
    
}
