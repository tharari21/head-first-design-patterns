package com.tomerharari.firstbeveragedesign;

// With this design each drink extends beverage and provides its own implementation of cost() abstract method
// This will pose a problem when we want customers to be able to add milk, mocha, or whip cream to their drinks
// Because the cost will vary with these and to design it this way would mean we need a class for each drink with each condiment
// so for instance a class for DecafWithWhipCream and then another for DecafWithSoyMilk...

public abstract class Beverage {
    private String description;

    public Beverage(String description) {
        this.description = description;
    }

    abstract double cost();

}
class HouseBlend extends Beverage {
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    double cost() {
        return 4.29;
    }
}
class DarkRoast extends Beverage {
    public DarkRoast(String description) {
        super(description);
    }

    @Override
    double cost() {
        return 3.87;
    }
}