package com.tomerharari.decoratorpattern;

public abstract class Beverage {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }
    @Override
    public double cost() {
        return 4.29;
    }
}
class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 4.29;
    }
}