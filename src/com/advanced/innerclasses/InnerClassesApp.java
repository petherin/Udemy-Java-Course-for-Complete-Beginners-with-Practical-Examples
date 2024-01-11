package com.advanced.innerclasses;

import com.advanced.enumcoding.PizzaSize;



public class InnerClassesApp {
    private static boolean isPizzaReady(int waitedInMinutes) {
        // This is a method local inner class ie a class
        // defined inside a method. Not commonly used.
        class Oven {
            public boolean isPizzaBakedProperly() {
                // We can use waitedInMinutes passed into the function
                // inside this class. So we don't have to pass it into
                // isPizzaBakedProperly itself.
                return waitedInMinutes > 30;
            }
        }
        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }

    public static void main(String[] args) {
        // Create an object from the Pizza class defined in this file,
        // as opposed to the Pizza class in enumcoding package.
        // The PizzaSize, however, DOES come from enumcoding package.
        // We can't create an object of class Pizza from outside
        // this InnerClassesApp class, it's hidden from the outside world.
        Pizza firstPizza = new Pizza("Margerita", PizzaSize.MEDIUM);
        System.out.println("Name: " + firstPizza.getName());

        // This is using an anonymous class which can be used to override
        // Pizza's methods e.g. getName.
        // Not commonly used.
        Pizza secondPizza = new Pizza("Margerita", PizzaSize.MEDIUM) {
            @Override
            public String getName() {
                return "Anonymous";
            }
        };
        System.out.println("Name: " + secondPizza.getName());

        if (isPizzaReady(40)) {
            System.out.println("The pizza is ready");
        } else {
            System.out.println("The pizza is not ready yet");
        }

        // Here's how to create an object of an inner class.
        // PizzaSlice is an inner class of Pizza.
        // First create Pizza.
        Pizza thirdPizza = new Pizza("Pizza cake", PizzaSize.LARGE);
        // Then use the funky syntax below to create the PizzaSlice.
        // Pizza.PizzaSlice pizzaSlice = thirdPizza.new PizzaSlice();
        // Or we can get a new PizzaSlice by calling a function on
        // Pizza that returns a PizzaSlice, which is nicer.
        Pizza.PizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();
        System.out.println(pizzaSlice.calculatePizzaSliceArea());
    }


}
