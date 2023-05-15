package com.tomerharari.thirdduckdesign;

import com.tomerharari.thirdduckdesign.behaviors.FlyBehavior;
import com.tomerharari.thirdduckdesign.behaviors.Quack;
import com.tomerharari.thirdduckdesign.behaviors.QuackBehavior;

public abstract class Duck {
    // This is the design principle of programming to an interface
    // because we now can use any class that implements Flybehavior
    // programming to an interface does not only need to use interfaces. Can use abstract classes as well or superclasses
    // The idea is that the Duck does not need to know the flyBehavior or QuackBehavior - only that it has it but it can
    // use any type of Flybehavior
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even fake ones");
    }
    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
