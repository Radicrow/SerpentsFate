package entities;


public class Player {
	
private String name = "Aspheera";
private int PV_max;
private int PV;
private int MP_max;
private int MP;


private int strength = 0;
private int constitution = 0;
private int agility = 0;
private int dexterity = 0;
private int arcana = 0;

private Weapon weapon;
private Armor armor;
private int potion = 3;

public Player(String name, int PV_max, int PV, int MP_max, int MP, int strength, int constitution, int agility, int dexterity) {
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

public void setWeapon(Weapon weapon) {
	this.weapon = weapon;
}

public void setArmor(Armor armor) {
	this.armor = armor;
}


public int getPotion() {
	return this.potion;
}

public void setPV(int PV) {
	this.PV = PV;
}

public void damage(int damage) {
	this.PV -= damage;
}

public int getPV() {
	return this.PV;
}
public int getPV_max() {
	return this.PV_max;
}

public int getMP() {
	return this.MP;
}
public int getMP_max() {
	return this.MP_max;
}
 

public void condition() {
	if (getPV()>getPV_max()) {
		setPV(this.PV_max);
	}
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

@Override
public String toString() {
	return "Name: " + name + "\n" + "PV: " + PV_max + "\n"+ "MP: " + MP_max + "\n"+ "Str: " + strength + "\n" + "Con: " + constitution + "\n"+ "Agi: " + agility + "\n" + "Dex: " + dexterity + "\n"; 
}

}