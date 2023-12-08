package com.intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger=new DodgeChallenger();
        dodgeChallenger.startTheEngine();

        DodgeChallenger dodgeChallengerOrange=new DodgeChallenger("orange");
        dodgeChallengerOrange.startTheEngine();
    }
}
