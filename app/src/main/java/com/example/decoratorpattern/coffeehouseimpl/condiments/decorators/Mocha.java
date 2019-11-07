package com.example.decoratorpattern.coffeehouseimpl.condiments.decorators;

import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.Beverage;

/**
 * Mocha is a decorator so we extend the Decorator class. The Decorator class also extends
 * Beverage. When we use Mocha we also have to instantiate a reference to a Beverage (beverage).
 * Using the instance variable we hold the beverage that we are wrapping. We use a constructor
 * that set the object we are wrapping. Overriding the cost() and getDescr() methods allows to
 * add the decorators state to the beverage.
 */
public class Mocha extends Decorator {
    Beverage beverage;
    private final static double mochaPrice = 0.32;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return mochaPrice + beverage.cost();
    }

    @Override
    public String getDescr() {
        return beverage.getDescr() + ", Mocha";
    }

    @Override
    public String toString() {
        return "Mocha{" +
                "beverage=" + beverage +
                ", descr='" + descr + '\'' +
                "cost= " + cost() +
                '}';
    }
}
