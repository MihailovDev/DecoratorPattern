package com.example.decoratorpattern.coffeehouseimpl.condiments.decorators;

import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.Beverage;

public class Whip extends Decorator {
    private Beverage beverage;
    private final static double whipPrice = 0.14;
    private final static String whipDescr = ", Whip";

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return whipPrice + beverage.cost();
    }

    @Override
    public String getDescr() {
        return beverage.getDescr() + whipDescr;
    }

    @Override
    public String toString() {
        return "Whip{" +
                "beverage=" + beverage +
                ", descr='" + descr + '\'' +
                '}';
    }
}
