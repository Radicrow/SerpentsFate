package entities;
import java.util.Scanner;
import java.util.Random;

public class Combat {

	public static void Fight(Enemy enemy, Player player) {
		System.out.println("And the combat begins!!");
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.println(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
		while(player.getPV()>0 && enemy.getPV()>0) {
		if(player.getAgility()>=enemy.getAgility()) {
			PlayerTurn(enemy, player);
			if (enemy.getPV()<=0) {
				break;
			}
			enemyTurn(enemy, player);
			player.setDefense(player.getOriginalDefense());
		}
		else {
			EnemyAttack(enemy, player);
			if (player.getPV()<=0) {
				break;
			}
			player.setDefense(player.getOriginalDefense());
			PlayerTurn(enemy, player);
		
		}
		System.out.println("Player HP: " + player.getPV());
		System.out.printf("Enemy HP: %.2f %n%n", enemy.getPV());
	}
	}
	
	public static void PlayerTurn(Enemy enemy, Player player) {
		Scanner read = new Scanner(System.in);
		System.out.println("It's your turn, what would you like to do?");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
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
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
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
	
	public static void EnemyDefend(Enemy enemy) {
	    if (enemy.getDefense() == enemy.getOriginalDefense()) {
	        enemy.setOriginalDefense(enemy.getDefense());
	        enemy.setDefense(enemy.getDefense() * 2);
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

public static void usePotion(Enemy enemy) {
if (enemy.getPotion() > 0) {
       
        
        int totalRecovery = 0;
        Random random = new Random();
        

            int roll = (random.nextInt(6) + 1)+(random.nextInt(6) + 1)+(random.nextInt(6) + 1);
            totalRecovery += roll;

        

        double newPV = enemy.getPV() + totalRecovery;
        if (newPV > enemy.getPV_max()) {
            newPV = enemy.getPV_max();
        }
        
        enemy.setPV(newPV);
        
       
        enemy.setPotion(enemy.getPotion() - 1);
        
        System.out.println(enemy.getName()+" drank a potion and recovered " + totalRecovery + " HP.");
        System.out.println(enemy.getName()+"'s HP is now " + enemy.getPV());
}
}


	public static void enemyTurn(Enemy enemy, Player player) {
		Random random = new Random();
		System.out.println("It's " + enemy.getName()+"'s turn!");
		int choice = random.nextInt(3) + 1;
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
		if (choice == 1) {
			System.out.println(enemy.getName()+" attacks!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			EnemyAttack(enemy, player);
		}
		else if(choice == 2) {
			System.out.println(enemy.getName()+" defends!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			EnemyDefend(enemy);
		}
		else if(choice == 3 && enemy.getPotion()>0) {
			System.out.println(enemy.getName()+" uses a potion!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			usePotion(enemy);
		}
		else {
			System.out.println("It's " + enemy.getName()+"'s turn!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			EnemyAttack(enemy, player);
		}
	}
}