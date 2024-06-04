package com.minecraft.entities.noCharacters.noHostileMods;

import com.minecraft.capabilities.Damage;
import com.minecraft.entities.noCharacters.Mod;

public class PacificMod extends Mod implements Damage{

    public PacificMod(int health) {
        super(health);
    }

    @Override
    public void getDamage(int attact) {
        this.health -= attact;
        System.out.println("\nPacific Mod damaged: -"+attact);
        System.out.println("Pacific Mod status:");
        System.out.println("Health: "+this.health);
    }


}
