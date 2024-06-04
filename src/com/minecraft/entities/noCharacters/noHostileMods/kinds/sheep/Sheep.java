package com.minecraft.entities.noCharacters.noHostileMods.kinds.sheep;

import com.minecraft.capabilities.Damage;
import com.minecraft.entities.noCharacters.Mod;

public class Sheep extends Mod implements Damage{

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

    @Override
    public void getDamage(int attact) {
        this.health -= attact;
    }
}
