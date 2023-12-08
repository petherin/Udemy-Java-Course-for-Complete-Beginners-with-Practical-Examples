package com.intermediate.encapsulation.car;

public class ToyotaSupra extends Car {
    public   ToyotaSupra(String colour){
        super("ToyotaSupra", colour);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A ToyotaSupra engine started");
    }
}
