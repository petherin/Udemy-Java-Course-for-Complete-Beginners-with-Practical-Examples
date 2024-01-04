package com.intermediate.polymorphism.car;

public class DodgeChallenger extends Car implements ElectricMode {

    public   DodgeChallenger(String colour){
        super("Dodge Challenger", colour);
        }

    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine started");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("A Dodge Challenger electric engine started");
    }
}


