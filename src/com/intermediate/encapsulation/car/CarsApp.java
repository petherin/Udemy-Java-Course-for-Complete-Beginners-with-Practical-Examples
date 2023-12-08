package com.intermediate.encapsulation.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger=new DodgeChallenger("red");
        System.out.println(dodgeChallenger.getCarName() + "'s price is £ " + dodgeChallenger.getPrice());
        dodgeChallenger.setPrice(35000);
        System.out.println(dodgeChallenger.getCarName() + "'s new price is £ " + dodgeChallenger.getPrice());
        dodgeChallenger.startTheEngine();
        System.out.println("The car has " + dodgeChallenger.getMileage() + " miles");
        dodgeChallenger.drive(100);
        System.out.println("After driving, the car has " + dodgeChallenger.getMileage() + " miles");

        DodgeChallenger dodgeChallengerOrange=new DodgeChallenger("orange");
        dodgeChallengerOrange.startTheEngine();

        ToyotaSupra toyotaSupra=new ToyotaSupra("black");
        toyotaSupra.startTheEngine();
    }

}
