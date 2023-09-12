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
    	return this.damage;
    }
    
    public void setDamage(double damage, Player player) {
        System.out.println("Base Damage: " + damage);
        
        if ("Light Weapon".equals(category)) {
            this.damage = damage + (random.nextInt(6) + 1) + (random.nextInt(6) + 1) + (random.nextInt(4) + 1) + player.getDexterity();
        } else if ("Heavy Weapon".equals(category)) {
            this.damage = damage + (random.nextInt(12) + 1) + (1.5 * player.getStrength());
        } else {
            System.out.println("Error!!");
        }

        System.out.println("Final Damage: " + this.damage);
    }


    
   
}