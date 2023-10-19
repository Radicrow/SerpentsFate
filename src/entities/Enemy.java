package entities;

import java.util.Random;

public class Enemy {
Random random = new Random();
	
    private String name;//armazena o nome do inimigo
    private double PV;//representa os pontos de vida ATUAL do inimigo
    private double damage;// indica o dano que o inimigo pode causar
    private double base_damage;// representa o dano base, adicionado ao dano calculado aleatoriamente
    private int agility;//a agilidade que influencia na ordem dos turnos
    private int potion = 3; //registro do numero de poções 
    private double max_PV;// armazena o valor máximo de pontos de vida
    private int originalDefense;// mantém o valor ORIGINAL da defesa
    private int defense;// controla o valor ATUAL da defesa
  


    public Enemy(String name, double PV, double damage, double base_damage, int originalDefense, int agility) {
        this.name = name;
        this.PV = PV;
        this.max_PV = PV;
        this.damage = damage;
        this.base_damage = base_damage;
        this.originalDefense = originalDefense;
        this.agility = agility;
        this.potion = 3;
        
    } //construtor
    
    //get retorna e set define -> valor/ quantidade/ numero
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
    
    public void damage(double damage) { //método que calcula o dano q o inimigo recebe em função de sua defesa
    	
    	double dam = damage - this.defense;
    	this.PV -= dam;
    	
    	if (this.PV<0) {
    		this.PV = 0;
    	}
    }

    public double getDamage() { //calculo do dano que o inimigo pode causar aleatoriamente
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

//dano dele é diferente