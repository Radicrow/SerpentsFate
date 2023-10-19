package entities;

import java.util.Random;

public class Player {

	private String name;
	private double PV_max;
	private double PV;
	private double MP_max;
	private double MP;

	private int strength = 0;
	private int constitution = 0;
	private int agility = 0;
	private int dexterity = 0;
	private int arcana = 2;
	private double spell_damage;

	private Weapon weapon;
	private Armor armor;
	private double originalDefense;
	private double defense;
	private int potion = 3;

	public Player() {

	}

	public Player(String name, double PV_max, double PV, double MP_max, double MP, int strength, int constitution,
			int agility, int dexterity) {
		this.name = name;
		this.PV_max = PV_max;
		this.PV = PV;
		this.MP_max = MP_max;
		this.MP = MP;
		this.potion = 3;

		this.strength = strength;
		this.constitution = constitution;
		this.agility = agility;
		this.dexterity = dexterity;

	}

	public double getSpell_damage(Magic magic) {//metodo que calcula o dano magico com base no objeto magia passado comom um argumento
		Random random = new Random();
		double dice = magic.getDamage() + this.arcana;//add do valor de dano da magia e a arcana 
		double damage = 0;//inicializado em zero pq vai ser acumulado durante o loop for

		for (int i = 0; i <= dice; i++) {//gera um numero aleatorio de 1 a 6
			damage += random.nextInt(6) + 1;
		}
		return damage;
	}//simulaçao do dano magico feito por rolagem de dados aleatorios 

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
		this.defense = armor.getDefense();//obtem o valor de defesa da armurada e atribui ele a variavel de instancia de defesa, atuat a defesa do player em função da armadura equipada
		this.originalDefense = armor.getDefense();//para manter um registro do valor original de defesa do jogador antes de quaisquer alterações 
	}//esse método permite que o jogador equipe uma peça de armadura, atualizando sua defesa e mantendo o registro da defesa original para futuras referências.

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

	public void damage(double damage) {//calculo do dano recebido em função de sua defesa
		double ph;//variavel pra armazenar o dano
		ph = (damage - (this.defense));//aqui vai ser subtraido o valor da defesa do jogador do dano recebido

		if (ph < 0) { //condição que verifica se o valor do ph for negativo (se defendeu, bloqueou o dano por causa da defesa)
			ph = 0;//ph é definido como zero para garantir que o ganhe poontos de vida extra devido a defesa
		}
		this.PV -= ph;//redução dos pontos de vida
	}
	//

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

	public double getDamage() {//Chama o método getDamage() da instância de arma atualmente equipada pelo jogador 
		return weapon.getDamage();// retorna o valor de dano da arma.
	}//esse método encapsula a lógica para obter o dano causado pelo jogador com base na arma que ele está usando.

	public double getOriginalDefense() {
		return originalDefense;
	}

	public void setOriginalDefense(double originalDefense) {
		this.originalDefense = originalDefense;
	}

	@Override
	public String toString() {//mostra as informações dos status do jogador
		return "Name: " + name + "\n" + "PV: " + PV_max + "\n" + "MP: " + MP_max + "\n" + "Str: " + strength + "\n"
				+ "Con: " + constitution + "\n" + "Agi: " + agility + "\n" + "Dex: " + dexterity + "\n";
	}

}