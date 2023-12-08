package com.intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger=new DodgeChallenger("red");
        dodgeChallenger.startTheEngine();

        DodgeChallenger dodgeChallengerOrange=new DodgeChallenger("orange");
        dodgeChallengerOrange.startTheEngine();

        ToyotaSupra toyotaSupra=new ToyotaSupra("black");
        toyotaSupra.startTheEngine();
    }

}
