package com.example.decoratorpattern.coffeehouseimpl.condiments.decorators;

import com.example.decoratorpattern.coffeehouseimpl.condiments.beverages.Beverage;

/**
 * This is the main Decorator class. It extends Beverage because we need type matching.
 * Also we need all decorators implement the getDescr() method.
 */
public abstract class Decorator extends Beverage {
    public abstract String getDescr();
}
