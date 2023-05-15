package com.tomerharari.thirdduckdesign;

import com.tomerharari.thirdduckdesign.behaviors.CannotFly;
import com.tomerharari.thirdduckdesign.behaviors.FlyWithWings;
import com.tomerharari.thirdduckdesign.behaviors.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
