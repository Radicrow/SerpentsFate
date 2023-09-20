package entities;


public class Player {
	
private String name = "Aspheera";
private double PV_max;
private double PV;
private double MP_max;
private double MP;


private int strength = 0;
private int constitution = 0;
private int agility = 0;
private int dexterity = 0;
private int arcana = 0;

private Weapon weapon;
private Armor armor;
private double originalDefense;
private double defense;
private int potion = 3;

public Player() {
	
}

public Player(String name, double PV_max, double PV, double MP_max, double MP, int strength, int constitution, int agility, int dexterity) {
	this.name = name;
	this.PV_max = PV_max;
	this.PV = PV;
	this.MP_max=MP_max;
	this.MP = MP;
	this.potion = 3;

	this.strength = strength;
	this.constitution = constitution;
	this.agility = agility;
	this.dexterity = dexterity;

	
}

public String getName() {
	return this.name;
}

public int getConstitution() {
	return constitution;
}

public void setConstitution(int constitution) {
	this.constitution = constitution;
}

public void setStrength(int strength) {
	this.strength = strength;
}

public void setAgility(int agility) {
	this.agility = agility;
}

public void setDexterity(int dexterity) {
	this.dexterity = dexterity;
}

public void setWeapon(Weapon weapon) {
	this.weapon = weapon;
}

public void setPotion(int potion) {
	this.potion = potion;
}

public void setPV_max(double pV_max) {
	PV_max = pV_max;
}

public void setMP_max(double mP_max) {
	MP_max = mP_max;
}

public void setMP(double mP) {
	MP = mP;
}

public Weapon getWeapon() {
	return weapon;
}

public void setArmor(Armor armor) {
	this.armor = armor;
	this.defense = armor.getDefense();
	this.originalDefense = armor.getDefense();
}

public double getDefense() {
	return this.defense;
}

public int getPotion() {
	return this.potion;
}

public void setPV(double PV) {
	this.PV = PV;
}

public void setDefense(double defense) {
	this.defense = defense;
}

public void damage(double damage) {
	double ph;
	ph = (damage - (this.defense));
	
	if(ph<0) {
		ph = 0;
	}
	this.PV -= ph;
}

public double getPV() {
	return this.PV;
}
public double getPV_max() {
	return this.PV_max;
}

public double getMP() {
	return this.MP;
}
public double getMP_max() {
	return this.MP_max;
}

public int getAgility() {
	return this.agility;
}

public int getStrength() {
	return this.strength;
}

public int getDexterity() {
	return this.dexterity;
}

public double getDamage() {
	return weapon.getDamage();
}

public double getOriginalDefense() {
    return originalDefense;
}

public void setOriginalDefense(double originalDefense) {
    this.originalDefense = originalDefense;
}

@Override
public String toString() {
	return "Name: " + name + "\n" + "PV: " + PV_max + "\n"+ "MP: " + MP_max + "\n"+ "Str: " + strength + "\n" + "Con: " + constitution + "\n"+ "Agi: " + agility + "\n" + "Dex: " + dexterity + "\n"; 
}

}