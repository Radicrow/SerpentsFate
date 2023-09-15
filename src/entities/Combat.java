package entities;
import java.util.Scanner;
import java.util.Random;


public class Combat {

	public static void Fight(Enemy enemy, Player player) {
		
		while(player.getPV()>0 && enemy.getPV()>0) {
		if(player.getAgility()>=enemy.getAgility()) {
			PlayerTurn(enemy, player);
			EnemyAttack(enemy, player);
			player.setDefense(player.getOriginalDefense());
		}
		else {
			EnemyAttack(enemy, player);
			player.setDefense(player.getOriginalDefense());
			PlayerTurn(enemy, player);
		
		}
		System.out.println("Player HP:"+ " "+player.getPV());
		System.out.println("Enemy HP:"+ " "+enemy.getPV());
	}
	}
	
	public static void PlayerTurn(Enemy enemy, Player player) {
		Scanner read = new Scanner(System.in);
		System.out.println("It's your turn, what would you like to do?");
		System.out.printf("          1-Fight!%n          2-Magic!%n          3-Use Potion%n          4-Defend%n");
		
		int choice = read.nextInt();
		
		switch (choice) {
        case 1:
        	PlayerAttack(enemy, player);
            break;
        case 2:
            
            break;
        case 3:
        	usePotion(player);
        case 4:
        	PlayerDefend(player);
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");
           
            break;
    }
		
		
		
		
	}
	
	
	public static void PlayerAttack(Enemy enemy, Player player) {
		double damage = enemy.getPV();
	
		enemy.damage(player.getDamage());
		
		damage = damage - enemy.getPV();
		
		System.out.printf("You dealt %.2f points of damage!%n", damage);
	}
	
	public static void EnemyAttack(Enemy enemy, Player player) {
		
		double damage = player.getPV();
		
		player.damage(enemy.getDamage());
		
		damage = damage - player.getPV();
		
		System.out.printf("You received %.2f points of damage!%n", damage);
	}
	
	
	public static void PlayerDefend(Player player) {
	    if (player.getDefense() == player.getOriginalDefense()) {
	        player.setOriginalDefense(player.getDefense());
	        player.setDefense(player.getDefense() * 2);
	    } else {
	        System.out.println("You are already defending.");
	    }
	}
	

public static void usePotion(Player player) {
    if (player.getPotion() > 0) {
       
        
        int totalRecovery = 0;
        Random random = new Random();
        

            int roll = (random.nextInt(6) + 1)+(random.nextInt(6) + 1)+(random.nextInt(6) + 1);
            totalRecovery += roll;

        

        double newPV = player.getPV() + totalRecovery;
        if (newPV > player.getPV_max()) {
            newPV = player.getPV_max();
        }
        
        player.setPV(newPV);
        
       
        player.setPotion(player.getPotion() - 1);
        
        System.out.println("You drank a potion and recovered " + totalRecovery + " HP.");
        System.out.println("Your HP is now " + player.getPV());
    } else {
        System.out.println("You are out of potions!");
    }
}
	
}


