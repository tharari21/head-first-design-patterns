package com.tomerharari.strategypattern;

public class PistolStrategy implements WeaponStrategy {
    @Override
    public void attack() {
        System.out.println("ATTACKING WITH PISTOL");
    }
}
