package com.intermediate.inheritance.car;

public class DodgeChallenger extends Car {

    public   DodgeChallenger(String colour){
        super("Dodge Challenger", colour);
        }

    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine started");
    }
}


