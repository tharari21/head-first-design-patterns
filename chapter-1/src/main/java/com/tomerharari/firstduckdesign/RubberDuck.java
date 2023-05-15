package com.tomerharari.firstduckdesign;

public class RubberDuck extends Duck{
    @Override
    public void quack() {
        // Overriden to squeak not quack
    }

    @Override
    public void display() {

    }

    @Override
    public void fly() {
        // DO NOTHING - Easy solution to the fly problem we spoke about in Duck
        // And say we had a duck that does not quack - we can simply override quack method to do nothing
    }
}
