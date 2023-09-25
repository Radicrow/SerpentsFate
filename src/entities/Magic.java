package entities;

public class Magic {
String name;
String element;
double damage;
int MP_cost;

public Magic() {}

public int getMP_cost() {
	return MP_cost;
}

public void setMP_cost(int mP_cost) {
	MP_cost = mP_cost;
}

public Magic(String name, String element, double damage, int MP_cost) {
	
	this.name = name;
	this.element = element;
	this.damage = damage;
	this.MP_cost = MP_cost;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getElement() {
	return element;
}

public void setElement(String element) {
	this.element = element;
}

public double getDamage() {
	return damage;
}

public void setDamage(double damage) {
	this.damage = damage;
}


}