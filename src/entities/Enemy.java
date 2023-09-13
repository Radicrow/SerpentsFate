package entities;

import java.util.Random;

public class Enemy {
Random random = new Random();
	
    private String name;
    private double PV;
    private double damage;
    private double base_damage;
    private int defense;
    private int agility;
  


    public Enemy(String name, double PV, double damage, double base_damage, int defense, int agility) {
        this.name = name;
        this.PV = PV;
        this.damage = damage;
        this.base_damage = base_damage;
        this.defense = defense;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public double getPV() {
        return PV;
    }
    
    public void damage(double damage) {
    	this.PV -= damage;
    }

    public double getDamage() {
        return damage*(random.nextInt(4) + 1) + base_damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

}