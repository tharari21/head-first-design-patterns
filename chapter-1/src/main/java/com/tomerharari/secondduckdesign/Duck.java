package com.tomerharari.secondduckdesign;
/*
Joe realized that inheritance probably wasn’t the answer,
because he just got a memo that says that the executives now want to update the
product every six months (in ways they haven’t yet decided on).
Joe knows the spec will keep changing and he’ll be forced to look at and
possibly override fly() and quack() for every new Duck subclass that’s ever added to the program... forever.
So, he needs a cleaner way to have only some (but not all) of the duck types fly or quack
*/
public abstract class Duck {

    /*
        With this implementation behaviors like fly and quack will be made interfaces
        This way we can make a duck fly or quack by simply implementing the interface

        We know that not all of the subclasses should have flying or quacking behavior,
        so inheritance isn’t the right answer.

        But while having the subclasses implement
        Flyable and/or Quackable solves part of the problem (no inappropriately flying rubber ducks),
        it completely destroys code reuse for those behaviors,
        so it just creates a different maintenance nightmare - meaning we now need to implement the
        fly and quack behavior for all flyable and quackable ducks
        And of course there might be more than one kind of flying behavior even among the ducks that do fly...


     */
    public void swim() {

    }
    public abstract void display();

}
