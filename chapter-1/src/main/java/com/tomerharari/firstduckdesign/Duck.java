package com.tomerharari.firstduckdesign;

public abstract class Duck {
    public void quack() {

    }
    public void swim() {

    }
    public abstract void display();
    // Now suppose all ducks need to fly -- simply add fly method
    public void fly() {

    }
    // PROBLEM -- We want to add rubber ducks. RUBBER DUCKS CAN'T FLY
}
