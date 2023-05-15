package com.tomerharari.exercise;

import com.tomerharari.exercise.behaviors.WeaponBehavior;

public abstract class  Character {
    WeaponBehavior weaponBehavior;
    public abstract void fight();
    void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
