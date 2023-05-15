package com.tomerharari.strategypattern;

public class Character {
    private WeaponStrategy weapon;

    public void setWeapon(WeaponStrategy weapon) {
        this.weapon = weapon;
    }
    void performAttack() {
        weapon.attack();
    }
}
