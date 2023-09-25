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
		
		
		boolean self_1 = true;
		boolean self_2 = true;
		
		while(player.getPV()>0 && enemy.getPV()>0) {
		
			
			if(player.getPV()<player.getPV_max()*0.25 && self_1 == true) {
				System.out.println("Your vision starts to get blurry and your muscles feel somewhat numb...");
				System.out.println(player.getName() +": I won't... give up...");
				self_1 = false;
			}
			else if (player.getPV()<player.getPV_max()*0.5 && self_2 == true) {
				System.out.println("You can feel some blood running down your scales... Your blood...");
				self_2 = false;
				}
			
		if(player.getAgility()>=enemy.getAgility()) {
			PlayerTurn(enemy, player);
			
			enemy.setDefense(enemy.getOriginalDefense());
			if (enemy.getPV()<=0) {
				break;
			}
			enemyTurn(enemy, player);
			player.setDefense(player.getOriginalDefense());
		}
		else {
			enemyTurn(enemy, player);
			
			if (player.getPV()<=0) {
				break;
			}
			
			player.setDefense(player.getOriginalDefense());
			
			PlayerTurn(enemy, player);
			
			enemy.setDefense(enemy.getOriginalDefense());
		
		}
		System.out.println("");
		System.out.println(player.getName() +"'s HP: " + player.getPV());
		System.out.println(player.getName() +"'s MP: " + player.getMP());
		System.out.printf("%n" + enemy.getName() +"'s HP: %.2f %n%n", enemy.getPV());
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
            playerCast(enemy, player);
            break;
        case 3:
        	usePotion(player);
        	break;
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
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.println("You enter a defensive stance");
		
	    if (player.getDefense() == player.getOriginalDefense()) {
	        player.setDefense(player.getDefense() * 2);
	    }
	}
	
	public static void EnemyDefend(Enemy enemy) {
	    if (enemy.getDefense() == enemy.getOriginalDefense()) {
	        enemy.setDefense(enemy.getDefense() * 2);
	    }
	}
	
	

public static void usePotion(Player player) {
	try { Thread.sleep (1500); } catch (InterruptedException ex) {}
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
        System.out.printf(enemy.getName()+"'s HP is now %.2f", enemy.getPV());
}
}


	public static void enemyTurn(Enemy enemy, Player player) {
		Random random = new Random();
		System.out.println("It's " + enemy.getName()+"'s turn!");
		int choice = random.nextInt(3)+1;
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
	
	public static void valTurn(Enemy enemy, Player player) {
		Random random = new Random();
		System.out.println("It's " + enemy.getName()+"'s turn!");
		int choice = random.nextInt(6)+1;
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
		if (choice == 1||choice == 2||choice == 3) {
			System.out.println(enemy.getName()+" attacks!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			EnemyAttack(enemy, player);
		}
		else if(choice == 4) {
			System.out.println(enemy.getName()+" defends!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			EnemyDefend(enemy);
		}
		else if(choice == 5 && enemy.getPotion()>0) {
			System.out.println(enemy.getName()+" uses a potion!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			usePotion(enemy);
		}
		else {
			System.out.println("It's " + enemy.getName()+"'s turn!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			ValFire(enemy, player);
		}
	}
	
	
	public static void ValFire(Enemy enemy, Player player) {
		
		Random random = new Random();
		
		System.out.println("Val leans back and suddenly spits fire towards you");
		
		double damage = player.getPV();
		
		if (player.getOriginalDefense() == 8) {
		player.damage(random.nextInt(6)+1+random.nextInt(6)+1);
		}
		
		else {
			player.damage(random.nextInt(6)+1+random.nextInt(6)+1+random.nextInt(6)+1+random.nextInt(6)+1);
		}
		damage = damage - player.getPV();
		
		System.out.printf("You received %.2f points of fire damage!%n", damage);
	}
	
	public static void ValFight(Enemy enemy, Player player) {
		System.out.println("And the ultimate combat begins!!");
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.println(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		boolean self_1 = true;
		boolean self_2 = true;
		boolean self_3 = true;
		boolean self_4 = true;
		
		while(player.getPV()>0 && enemy.getPV()>0) {
			
		
			if(player.getPV()<player.getPV_max()*0.25 && self_1 == true) {
				System.out.println("Your vision starts to get blurry and your muscles feel somewhat numb...");
				System.out.println(player.getName() +": I won't... give up...");
				self_1 = false;
			}
			else if (player.getPV()<player.getPV_max()*0.5 && self_2 == true) {
				System.out.println("You can feel some blood running down your scales... Your blood...");
				self_2 = false;
			}
			
			if(enemy.getPV()<enemy.getPV_max()*0.25 && self_3 == true ) {
				System.out.println("VAL: ARGH! YOU'LL PAY FOR THAT, PIPSQUEAK!");
				
				self_3 = false;
			}
			else if (player.getPV()<player.getPV_max()*0.5 && self_4  == true) {
				System.out.println("Val: Hmph... You're stronger than you look... I'll give you that");
				self_4 = false;
			}
			
		if(player.getAgility()>=enemy.getAgility()) {
			PlayerTurn(enemy, player);
			
			enemy.setDefense(enemy.getOriginalDefense());
			
			if (enemy.getPV()<=0) {
				break;
			}
			valTurn(enemy, player);
			
			player.setDefense(player.getOriginalDefense());
		}
		else {
			valTurn(enemy, player);
			
			if (player.getPV()<=0) {
				break;
			}
			
			player.setDefense(player.getOriginalDefense());
			
			PlayerTurn(enemy, player);
			
			enemy.setDefense(enemy.getOriginalDefense());
		
		}
		System.out.println(player.getName() +"'s HP: " + player.getPV());
		System.out.printf(enemy.getName() +"'s HP: %.2f %n%n", enemy.getPV());
	}
	}
	
	public static void playerCast(Enemy enemy, Player player) {
		Scanner read = new Scanner(System.in);
		
		
		
		Magic Firaga = new Magic("Firaga", "Fire", 3, 5);
		Magic Thundaga = new Magic("Thundaga", "Lightning", 2, 3);
		Magic Blizzaga = new Magic("Blizzaga", "Ice", 3, 6);
		
		System.out.println("Which spell would you like to cast?");
		System.out.println("1- (Cost: 5) Firaga (Cost: 3) 2- Thundaga (Cost: 6) 3- Blizzaga");
		
		int choice = read.nextInt();
		double damage;
		switch (choice) {
		case 1:
			if(player.getMP()<Firaga.getMP_cost()) {
				System.out.println("You don't have enough mana to cast that spell...");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				break;
			}
			damage = enemy.getPV();
			
			if (enemy.getName() == "Mossy Monster") {
			enemy.damage(player.getSpell_damage(Firaga) * 3);
			System.out.println("The enemy is extra weak against fire!");
			}
			else if(enemy.getName() == "Val") {
				System.out.println("The enemy is extra strong against fire!");
				enemy.damage(player.getSpell_damage(Firaga)/4);
			}
			else {
			enemy.damage(player.getSpell_damage(Firaga));
			}
			damage = damage - enemy.getPV();
			System.out.println("You dealt: " + damage + " points of damage");
			player.setMP(player.getMP() - Firaga.getMP_cost());
			break;
		case 2:
			if(player.getMP()<Thundaga.getMP_cost()) {
				System.out.println("You don't have enough mana to cast that spell...");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				break;
			}
			damage = enemy.getPV();
			
			if (enemy.getName() == "Guard" ||enemy.getName() == "Kriften's Royal Guard") {
			System.out.println("The enemy is weak against lightning!");
			try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			enemy.damage(player.getSpell_damage(Thundaga) * 3);
			}
			else if(enemy.getName() == "Mossy Monster") {
				System.out.println("The enemy is strong against lightning!");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				enemy.damage(player.getSpell_damage(Thundaga)/3);
			}
			else {
			enemy.damage(player.getSpell_damage(Thundaga));
			}
			damage = damage - enemy.getPV();
			System.out.println("You dealt: " + damage + " points of damage");
			player.setMP(player.getMP() - Thundaga.getMP_cost());
			break;
			
		case 3:
			if(player.getMP()<Blizzaga.getMP_cost()) {
				System.out.println("You don't have enough mana to cast that spell...");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				break;
			}
			damage = enemy.getPV();
			
			if (enemy.getName() == "Rival Serpentine") {
			enemy.damage(player.getSpell_damage(Blizzaga) * 1.5);
			System.out.println("The enemy is somewhat weak against ice!");
			}
			else {
			enemy.damage(player.getSpell_damage(Blizzaga));
			}
			damage = damage - enemy.getPV();
			System.out.println("You dealt: " + damage + " points of damage");
			player.setMP(player.getMP() - Blizzaga.getMP_cost());
			break;
		default:
			System.out.println("Please choose a valid option");
			choice = read.nextInt();
			break;
		}
	}
}

