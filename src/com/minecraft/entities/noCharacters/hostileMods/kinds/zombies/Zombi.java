package com.minecraft.entities.noCharacters.hostileMods.kinds.zombies;

import com.minecraft.entities.noCharacters.hostileMods.HostileMod;

public class Zombi extends HostileMod {


    public Zombi(int health, int strength) {
        super(health, strength);
    }
    
    @Override
    public void move() {
        System.out.println("\nIt moves towards you");
        super.move();
    }

    public int getHealth() {
        return this.health;
    }
    
    public int getStrength(){
        return this.strength;
    }

}
