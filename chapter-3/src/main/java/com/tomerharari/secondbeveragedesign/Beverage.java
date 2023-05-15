package com.tomerharari.secondbeveragedesign;

public class Beverage {
    String description;
    boolean milk;
    double milkCost;
    boolean soy;
    double soyCost;
    boolean mocha;
    double mochaCost;
    boolean whip; // whip cream
    double whipCost;

    // now the Beverage class implements cost() method and returns the cost of a bevarage with selected condiments and then
    // each individual beverage will also have a cost() method that calls super cost() to get cost of condiments that it has
    public double cost() {
        double totalCost = 0;
        totalCost += (hasSoy() ? 1 : 0);
        totalCost += (hasMocha() ? 1 : 0);
        totalCost += (hasWhip() ? 1 : 0);
        return totalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
class HouseBlend extends Beverage {
    @Override
    public double cost() {
        double baseCost = super.cost();
        return baseCost + 4.29;
    }
}