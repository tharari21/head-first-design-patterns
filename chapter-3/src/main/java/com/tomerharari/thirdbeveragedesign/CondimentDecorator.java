package com.tomerharari.thirdbeveragedesign;


// We inherit from Beverage so that the type of condiments are still Beverage.
// That's the only reason we need inheritance here
// The behavior from Beverage comes from composition and not inheritance
// to stick to our design principle of favoring inheritance over composition
// because we are using object composition, we get a whole lot more flexibility about how to mix and match condiments and beverages.
//if we rely on inheritance, then our behavior can only be determined statically at compile time. In other words,
//we get only whatever behavior the superclass gives us or that we override. With composition, we can mix and match decorators any way we like...at runtime.
//we can implement new decorators at any time to add new behavior. If we relied on inheritance, we’d have to go in and change existing code anytime we wanted new behavior.
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
    public Size getSize() {
        return beverage.getSize();
    }
}
