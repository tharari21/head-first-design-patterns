package com.tomerharari.strategypattern;

public class SwordStrategy implements WeaponStrategy {
    @Override
    public void attack() {
        System.out.println("ATTACKING WITH SWORD");
    }
}
