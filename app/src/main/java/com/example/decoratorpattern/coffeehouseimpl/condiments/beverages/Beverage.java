package com.example.decoratorpattern.coffeehouseimpl.condiments.beverages;

/**
 * This is the main superclass from whom all the beverages inherit the type.
 * We have a public getDescr() method which is overridden by the decorators. In the decorators
 * we set the descripton to be the description of the beverage + description of the decorator, same with
 * the abstract cost() methid.
 */
public abstract class Beverage {
    protected String descr = "Not available";
    public abstract double cost();

    public String getDescr() {
        return descr;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "descr='" + descr + '\'' +
                "cost= " + cost()+
                '}';
    }
}
