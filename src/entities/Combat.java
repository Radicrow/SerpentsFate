package entities;
import java.util.Scanner;
import java.util.Random;


public class Combat {

	public static void Fight(Enemy enemy, Player player) {
		
		while(player.getPV()>0 && enemy.getPV()>0) {
		if(player.getAgility()>enemy.getAgility()) {
			PlayerTurn(enemy, player);
			EnemyAttack(enemy, player);
		}
		else {
			EnemyAttack(enemy, player);
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
		
		System.out.printf("Player damage: %.2f%n", damage);
	}
	
	public static void EnemyAttack(Enemy enemy, Player player) {
		player.damage(enemy.getDamage());
	}
	
	
	public static void PlayerDefend(Player player) {
		player.setDefense(player.getDefense()*2);
	}
	
}


