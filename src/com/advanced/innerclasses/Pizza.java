package com.advanced.innerclasses;

import com.advanced.enumcoding.PizzaSize;

public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    // Inner class. Can access the containing class's
    // private variables above.
    class PizzaSlice {
        public String calculatePizzaSliceArea() {
            switch (pizzaSize) {
                case SMALL:
                default:
                    return "Small slice";
                case MEDIUM:
                    return "Medium slice";
                case LARGE:
                    return "Large slice";
            }
        }
    }

    public PizzaSlice cutPizzaSlice(){
        // Here we are using the PizzaSlice inner class.
        return new PizzaSlice();
    }

    private double calculatePrice() {
        switch (pizzaSize){
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;

        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}