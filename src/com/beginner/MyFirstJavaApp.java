package com.beginner;

import com.intermediate.classesandobjects.DodgeChallenger;

public class MyFirstJavaApp {
    public static void main(String[] args){
        byte numOfSeats=5;
        int numberOfFollowers = 195;
        int power=43;
        long registrationNumber= 233454354545L;

        float fuelConsumptionCombined = 15.5F;
        double fuelConsump=153.434333e-1;
        char energy='G';

        System.out.println("Price: £" + numberOfFollowers);

        short newNumOfSeats = numOfSeats;

        byte newPower = (byte) power;
        System.out.println(newPower);

        String desc = "hello there";

        DodgeChallenger dodgeChallengerOrange=new DodgeChallenger("orange");

    }
}
