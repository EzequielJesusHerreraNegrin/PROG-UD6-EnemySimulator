package com.minecraft.entities.noCharacters.hostileMods;

import com.minecraft.capabilities.Combat;
import com.minecraft.entities.noCharacters.Mod;

public abstract class HostileMod extends Mod implements Combat{

    protected int strength;

    public HostileMod(int health, int strength) {
        super(health);
        this.strength = strength;
    }

    @Override
    public int attact() {
        System.out.println("\nHostile Mod attack: "+this.strength);
        return this.strength;
    }

    @Override
    public void getDamage(int attact) {
        this.health -= attact;
        System.out.println("\nHostile Mod damaged: -"+attact);
        System.out.println("Hostile Mod status:");
        System.out.println("Health: "+this.health);
    }
}
