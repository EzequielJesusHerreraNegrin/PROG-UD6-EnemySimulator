package com.minecraft.entities.noCharacters.noHostileMods.kinds.sheep;

import com.minecraft.entities.noCharacters.Mod;

public class Sheep extends Mod {

    public Sheep(int health) {
        super(health);
    }

    @Override
    public void move() {
        System.out.println("It through the field");
        super.move();
    }

    public int getHealth() {
        return this.health;
    }
}
