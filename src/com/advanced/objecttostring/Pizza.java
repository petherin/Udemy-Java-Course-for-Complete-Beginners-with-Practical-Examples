package com.advanced.objecttostring;

import java.util.Objects;

public class Pizza implements Cloneable {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza pizza = (Pizza) o;

        return Objects.equals(name, pizza.name) &&
                price == pizza.price &&
                pizzaSize == pizza.pizzaSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pizzaSize, price);
//        int result = 7;
//
//        result = 31 * result + (name == null ? 0 : name.hashCode());
//        result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
//        result = 31 * result + Double.valueOf(price).hashCode();
//
//        return result;
    }

    // Is called whenever the object is printed, even if we don't bother using object.toString()
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pizzaSize=" + pizzaSize +
                ", price=" + price +
                '}';
    }
}