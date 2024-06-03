package com.minecraft.entities.noCharacters.hostileMods;

import com.minecraft.capabilities.Combat;
import com.minecraft.entities.noCharacters.Mod;

public abstract class HostileMod extends Mod implements Combat{

    private int strength;

    public HostileMod(int health, int strength) {
        super(health);
        this.strength = strength;
    }

    @Override
    public void attact(Mod mod) {
        System.out.println("\nHostile Mod Strength: "+this.strength);
        mod.setHealth(mod.getHealth() - this.strength);
    }

    @Override
    public void getDamage(int attact) {
        this.health -= attact;
        System.out.println("Hostile Mod damaged: -"+attact);
        System.out.println("\nHostile Mod status:");
        System.out.println("Health: "+this.health);
    }
}
