package com.tomerharari.thirdduckdesign;

import com.tomerharari.thirdduckdesign.behaviors.FlyWithWings;
import com.tomerharari.thirdduckdesign.behaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // Technically we said that we should not program to an implementation - rather to an interface.
        // Here we are programming to an implementation which is against our principle but only Later in the book we’ll have more patterns in our toolbox that can help us fix it.
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
