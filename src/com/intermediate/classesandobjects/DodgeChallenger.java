package com.intermediate.classesandobjects;

public class DodgeChallenger {
    private    byte numOfSeats=5;
    private     int numberOfFollowers = 195;
    private     int power=43;
    private     long registrationNumber= 233454354545L;
    private    float fuelConsumptionCombined = 15.5F;
    private    double fuelConsump=153.434333e-1;
    private     char energy='G';
    private     short newNumOfSeats = numOfSeats;
    private    byte newPower = (byte) power;
    private     String colour;

DodgeChallenger(){
    System.out.println("Dodge Challenger is created");
}

  public   DodgeChallenger(String colour){
    this.colour=colour;
        System.out.println("Dodge Challenger is created "+ this.colour);
    }

    public void startTheEngine(){
        System.out.println("Engine started");
    }
}
