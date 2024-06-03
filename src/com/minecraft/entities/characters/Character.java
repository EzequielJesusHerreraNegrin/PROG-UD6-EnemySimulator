package com.minecraft.entities.characters;

import com.minecraft.capabilities.Combat;
import com.minecraft.entities.noCharacters.Mod;

public class Character implements Combat {

    private int health;
    private int defense;
    private int strength;

    public Character( int defense, int strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public void getDamage(int attact) {
        if (attact < this.defense) {
            this.defense -= attact;
        } else {
            this.health += this.defense - attact;

        }
        System.out.println("Player damaged: -"+attact);
        System.out.println("Player status:");
        System.out.println("Health: "+this.health);
        System.out.println("Defense: "+this.defense);
    }
    @Override
    public void attact(Mod mod) {
        System.out.println("Player strength: "+getStrength());
        mod.setHealth(mod.getHealth() - this.strength);
    }
}