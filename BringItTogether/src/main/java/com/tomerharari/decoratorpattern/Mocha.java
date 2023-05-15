package com.tomerharari.decoratorpattern;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
