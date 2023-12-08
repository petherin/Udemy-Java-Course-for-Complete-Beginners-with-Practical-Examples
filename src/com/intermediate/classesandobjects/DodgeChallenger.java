package com.intermediate.classesandobjects;

public class DodgeChallenger {
        byte numOfSeats=5;
        int numberOfFollowers = 195;
        int power=43;
        long registrationNumber= 233454354545L;
        float fuelConsumptionCombined = 15.5F;
        double fuelConsump=153.434333e-1;
        char energy='G';
        short newNumOfSeats = numOfSeats;
        byte newPower = (byte) power;
        String colour;

DodgeChallenger(){
    System.out.println("Dodge Challenger is created");
}

    DodgeChallenger(String colour){
    this.colour=colour;
        System.out.println("Dodge Challenger is created "+ this.colour);
    }

    public void startTheEngine(){
        System.out.println("Engine started");
    }
}
