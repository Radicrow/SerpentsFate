package entities;

import java.util.Random;

public class Enemy {
Random random = new Random();
	
    private String name;
    private double PV;
    private double damage;
    private double base_damage;
    private int agility;
    private int potion = 3;
    private double max_PV;
    private int originalDefense;
    private int defense;
  


    public Enemy(String name, double PV, double damage, double base_damage, int originalDefense, int agility) {
        this.name = name;
        this.PV = PV;
        this.max_PV = PV;
        this.damage = damage;
        this.base_damage = base_damage;
        this.originalDefense = originalDefense;
        this.agility = agility;
        this.potion = 3;
        
    }

    public String getName() {
        return name;
    }
    
    public void setPotion(int potion) {
    	this.potion = potion;
    }
    
    public void setPV_max(double max_PV) {
    	this.max_PV = max_PV;
    }
    
    public void setPV(double PV) {
    	this.PV = PV;
    }
    
    public double getPV_max() {
    	return max_PV;
    }
    
    public int getPotion() {
    	return this.potion;
    }

    public double getPV() {
        return this.PV;
    }
    
    public void damage(double damage) {
    	
    	double dam = damage - this.defense;
    	this.PV -= dam;
    	
    	if (this.PV<0) {
    		this.PV = 0;
    	}
    }

    public double getDamage() {
        return damage*(random.nextInt(4) + 1) + base_damage;
    }

    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
    	this.defense = defense;
    }
    
    public int getOriginalDefense() {
        return originalDefense;
    }

    public void setOriginalDefense(int originalDefense) {
        this.originalDefense = originalDefense;
    }

    
    public int getAgility() {
        return agility;
    }

}