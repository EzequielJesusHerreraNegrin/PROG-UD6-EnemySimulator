package com.minecraft.entities.noCharacters;

public class Mod {

    protected int health;


    public Mod(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void move(){
        System.out.println("I'm coming for you.");
    }

}
