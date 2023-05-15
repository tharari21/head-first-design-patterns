package com.tomerharari.strategypattern;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();
        character.setWeapon(new PistolStrategy());
        character.performAttack();
        character.setWeapon(new SwordStrategy());
        character.performAttack();
    }
}
