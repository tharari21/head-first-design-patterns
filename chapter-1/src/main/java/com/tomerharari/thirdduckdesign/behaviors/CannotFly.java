package com.tomerharari.thirdduckdesign.behaviors;

public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        // Do nothing -- Cannot fly
        System.out.println("I can't fly!");
    }
}
