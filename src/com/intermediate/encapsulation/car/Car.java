package com.intermediate.encapsulation.car;

public class Car {
    private byte numOfSeats = 5;
    private int numberOfFollowers = 195;
    private int power = 43;
    private long registrationNumber = 233454354545L;
    private float fuelConsumptionCombined = 15.5F;
    private double fuelConsump = 153.434333e-1;
    private char energy = 'G';
    private short newNumOfSeats = numOfSeats;
    private byte newPower = (byte) power;
    private String colour;
    private String carName;
    private int price = 29999;
    private int mileage = 14999;


    Car() {
        System.out.println("Car is created");
    }

    public Car(String carName, String colour) {
        this.carName = carName;
        this.colour = colour;
        System.out.println(this.carName + " is created " + this.colour);
    }

    public void startTheEngine() {
        System.out.println("Engine started");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage) {
        this.mileage +=Math.abs(mileage);
    }

    public String getCarName() {
        return carName;
    }
}