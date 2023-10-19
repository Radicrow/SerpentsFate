package entities;
import java.util.Random;

public class Weapon {
	Random random = new Random();
    private String category;
	private double damage;
	private Player player;

    public Weapon(String category, double damage, Player player) {
        this.category = category;
        this.damage = damage;
        this.player = player;
    }
    
    public void setPlayer(Player player) {
    	this.player = player;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDamage() {
    	if ("Light Weapon".equals(category)) {
            return this.damage + ((random.nextInt(6) + 1) + (random.nextInt(6) + 1) + player.getDexterity()); //media 17 para dex = 10
        } else if ("Heavy Weapon".equals(category)) {
            return this.damage + (random.nextInt(10) + 1) + (1.2 * player.getStrength());//media 17.5 para str = 10
        } else {
            return 0;
        }//metodo que calcula seu dano com base na categoria e nos atributos do jogador e permite que o dano da arma seja ajustado conforme necessário.

    }
    
    public void setDamage(double damage, Player player) {
  
    	this.damage = damage;
    }


    
   
}