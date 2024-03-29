package com.advanced.objecthashcode;

import java.util.Arrays;

public class PizzaApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Available sizes:");
        for (PizzaSize pizzaSize: PizzaSize.values()){
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println();

        Pizza pizzaOrder = new Pizza("Margerita", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: £" + pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered another pizza:");
        System.out.println("Name: " + samePizza.getName());
        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: £" + samePizza.getPrice());

        System.out.println(pizzaOrder.equals(samePizza));

        System.out.println("-------------------------------------------");
        System.out.println(pizzaOrder.getClass().getSimpleName());
        System.out.println(pizzaOrder.getClass().getName());
        System.out.println(Arrays.toString(pizzaOrder.getClass().getFields()));
        System.out.println(Arrays.toString(pizzaOrder.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(pizzaOrder.getClass().getMethods()));
        System.out.println(Arrays.toString(pizzaOrder.getClass().getDeclaredMethods()));
        System.out.println(pizzaOrder.getClass().getSuperclass());

        System.out.println("-------------------------------------------");
        System.out.println("pizzaOrder's hashcode " + pizzaOrder.hashCode());
        System.out.println("samePizza's hashcode " + samePizza.hashCode());
    }
}
