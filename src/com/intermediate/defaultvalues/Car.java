package com.intermediate.defaultvalues;

public class Car {
    private byte numberOfSeats;
    private short horsePower;
    private int price;
    private long registrationNumber;

    private float fuelConsumption;
    private double preciseFuelConsumption;

    private boolean isDamaged;
    private char energyEfficiencyCategory;
    private String colour;

    private Boolean hasElectricEngine;
    private Engine engine;

    public void getDetails(){
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("HorsePower: " + horsePower);
        System.out.println("Price: " + price);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Precise Fuel Consumption: " + preciseFuelConsumption);
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy Efficiency Category: " + energyEfficiencyCategory);
        System.out.println("Car colour: " + colour);
        System.out.println("This car has electric engine: " + hasElectricEngine);
        System.out.println("The engine this car has is: " + engine);
    }
}
