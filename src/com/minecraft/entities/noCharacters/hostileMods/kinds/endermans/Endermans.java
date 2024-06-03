package com.minecraft.entities.noCharacters.hostileMods.kinds.endermans;

import com.minecraft.entities.noCharacters.hostileMods.HostileMod;

public class Endermans extends HostileMod {


    public Endermans(int health , int strength) {
        super(health , strength);
    }
    
    @Override
    public void move() {
        System.out.println("It can teleport to a place it can see.");
        super.move();
    }

    public int getHealth() {
        return this.health;
    }
}
