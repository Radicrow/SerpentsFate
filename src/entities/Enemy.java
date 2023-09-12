package entities;

import java.util.Random;

public class Enemy {

    private String name;
    private double PV;
    private double damage;
    private int defense;
    private int agility;
    private Random rand = new Random();


    public Enemy(String name, double PV, int damage, int defense, int agility) {
        this.name = name;
        this.PV = PV;
        this.damage = rand.nextInt(3) + 1;
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
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

}