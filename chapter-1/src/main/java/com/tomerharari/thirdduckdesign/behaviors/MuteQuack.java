package com.tomerharari.thirdduckdesign.behaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // DO NOTHING -- Does not quack
        System.out.println("<< Silence >>");
    }
}
