package entities;

public class Magic {
String name;//nome da magia
String element;//elemento (fogo, gelo e raio)
double damage;//dano causado
int MP_cost;//custo de mana

public Magic() {}//constutor padrão 

public int getMP_cost() { //retorna o custo da mana
	return MP_cost;
}

public void setMP_cost(int mP_cost) { //define o custo em pontos de mana
	MP_cost = mP_cost;
}

public Magic(String name, String element, double damage, int MP_cost) {//constutor que inicaliza os atributos da magia
	
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