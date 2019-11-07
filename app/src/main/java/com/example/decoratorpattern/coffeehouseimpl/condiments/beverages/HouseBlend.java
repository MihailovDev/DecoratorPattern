package com.example.decoratorpattern.coffeehouseimpl.condiments.beverages;

/**
 * HouseBlend is a Beverage so we extend from the Beverage class and override the cost
 * and description.
 */
public class HouseBlend extends Beverage {
    private final static String description = "House Blend Coffee";
    private final static double houseBlendPrice = 0.99;

    public HouseBlend() {
        descr = description;
    }

    @Override
    public double cost() {
        return houseBlendPrice;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                "descr='" + descr + '\'' +
                "cost= " + cost() +
                '}';
    }
}
