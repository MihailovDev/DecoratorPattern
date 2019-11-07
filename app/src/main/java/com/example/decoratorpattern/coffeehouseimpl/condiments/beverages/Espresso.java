package com.example.decoratorpattern.coffeehouseimpl.condiments.beverages;

/**
 * Espresso is a Beverage so we extend the Beverage class.
 * We override the cost method and description string.
 */
public class Espresso extends Beverage {
    private final static double espressoPrice = 1.99;
    public Espresso(){
        descr = "Espresso";
    }
    @Override
    public double cost() {
        return espressoPrice;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "descr='" + descr + '\'' +
                "cost= " + cost() +
                '}';
    }
}
