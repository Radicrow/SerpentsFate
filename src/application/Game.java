package application;

import java.util.Scanner;
import java.util.Random;

import entities.Armor;
import entities.Combat;
import entities.Player;
import entities.Weapon;
import entities.Magic;
import entities.Enemy;

public class Game {
	
	
	
	public static void Intro() {
		  System.out.println("*************************************************");
	        System.out.println("*               Serpent's Fate                   *");
	        System.out.println("*                 Team Arctic Fox               *");
	        System.out.println("*  Members: Igor \"Radicrow\" Acatuassu           *");
	        System.out.println("*           Enzo \"Jkenji\" Kikuchi               *");
	        System.out.println("*                                               *");
	        System.out.println("*               Welcome to the                   *");
	        System.out.println("*          world of Serpent's Fate!              *");
	        System.out.println("*                                               *");
	        System.out.println("*        [Fox Logo here later -Radicorvo]           *");
	        System.out.println("*************************************************");
		Menu();
	}
	
	public static void Tutorial() {
		
	}
	
	public static void Story() {
		
	}
	
	public static void Menu() {
		
		 Scanner scanner = new Scanner(System.in);
	        int choice;

	        System.out.println("               Serpent's Fate!");
	        System.out.println("                 1. New Game");
	        System.out.println("                 2. Tutorial");
	        System.out.println("                 3. Story");
	        System.out.println("                 4. Exit");
	        System.out.print("              Enter your choice: ");

	        while (true) {
	            if (scanner.hasNextInt()) {
	                choice = scanner.nextInt();
	                break;
	            } else {
	                System.out.println("Invalid input. Please enter a valid choice.");
	                scanner.nextLine();
	            }
	        }

	        switch (choice) {
	            case 1:
	            	character_Creation();
	                break;
	            case 2:
	                Tutorial();
	                break;
	            case 3:
	            	Story();
	            case 4:
	                System.out.println("Thank you for playing Serpent's Fate. Goodbye!");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid choice. Please select a valid option.");
	                Menu();
	                break;
	        }

	        scanner.close();
	    }
	
	
	public static void character_Creation() {
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		int strength=0;
		int dexterity=0;
		int constitution=0;
		int agility=0;
		
		System.out.println("As the darkness engulfs your vision, you feel weightless, adrift in a surreal void. Whispers of distant memories begin to echo in your mind.");
		System.out.println("\"Where am I? This place... it feels like a forgotten dream. Why... Why am I here?\"");
		System.out.printf("As you look around, you see fragmented images of your past flashing before your eyes... The towering trees of your tribal home, %nthe flickering bonfires, and the faces of your kin.%n");
		System.out.println("\"My tribe... the Serpentine. But... Why did I leave them?\"");
		
		try { Thread.sleep (6000); } catch (InterruptedException ex) {}
		
		System.out.printf("%nSuddenly, a faint shimmering light appears, revealing three ethereal figures... Your ancestors. They beckon you to explore your memories, %nto choose which part of your past you wish to revisit.%n");
		System.out.println("\"First... Tell us, young one, what is your name?\"");

		
		String name = read.nextLine();
		System.out.printf("\"%s... That's right... That's right...\"%n",name);
		System.out.print(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		
		System.out.printf("\"Choose wisely, young one. The past will shape your future.\"%n");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.printf("\"Remember the strength of your tribe, the bond of kinship.\"%n");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.printf("\"Or perhaps, recall the moment you decided to escape, the path you now walk alone.\"%n");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
		System.out.printf("The dream world shimmers, offering you different paths to explore:%n");
		System.out.println("What will you explore?");
		
		System.out.println("1- You remember the warmth of the tribe, their unity, and shared traditions...");
		System.out.println("2- You recall the moment you chose to leave, the reasons behind your departure...");
		System.out.println("3- You reflect on the newfound purpose driving you toward the distant town...");
		int dialogue_choice = read.nextInt();
		
		int MP_max = 0;
		
		while(true) {
		if(dialogue_choice == 1) {
			MP_max = (random.nextInt(6) + 1) + (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
			 	System.out.println("In your memory, you find yourself in a serene forest glade, surrounded by your Serpentine kin.");
			    System.out.println("The unity and traditions of your tribe warm your heart.");
			    System.out.println("You recall the teachings of your elders, the wisdom passed down through generations.");
			    System.out.println("You were known for your loyalty, your skills as a healer, and your ability to mediate conflicts among your kin.");
			    System.out.println("Green-Scaled Ancestor: \"You were a pillar of our tribe, a keeper of our traditions...\"");
			    constitution +=2;
			    break;
		}
		else if(dialogue_choice == 2) {
			MP_max = (random.nextInt(4) + 1) + (random.nextInt(4) + 1) + (random.nextInt(4) + 1);
				System.out.println("In this path, you confront the memories of the day you chose to leave your tribe, the sense of isolation, and the reasons behind your decision.");
			    System.out.println("The dream shifts to a stormy night, where rain lashes against the towering trees of your homeland.");
			    System.out.println("Your tribe's accusing eyes pierce through the darkness.");
			    System.out.println("You think about the disagreements and tensions that led to your departure.");
			    System.out.println("Your desire for something more, something beyond the killings and cruelties you witnessed in your tribe, everything pushed you to escape.");
			    System.out.println("Red-Scaled Ancestor: \"You carried the weight of your choices, young one.\"");
			    dexterity += 2;
			    break;
		}
		else if(dialogue_choice == 3) {
			MP_max = 10;
			  	System.out.println("In this path, you focus on your determination to reach the nearby town, the driving force behind your escape.");
			    System.out.println("The dream transports you to a moonlit desert, vast and unforgiving, with the town's distant lights as your beacon.");
			    System.out.println("You recall the hardships you've faced, the skills you've honed, the friends you left behind.");
			    System.out.println("You're determined to find a new life and purpose beyond the confines of your tribe.");
			    System.out.println("Blue-Scaled Ancestor: \"Your strength of purpose will guide you, young one.\"");
			    agility += 2;
			    break;
		}
		else {
			while(dialogue_choice != 1 && dialogue_choice != 2 && dialogue_choice != 3) {
				System.out.println("You must try harder to remember... You must...");
				dialogue_choice = read.nextInt();
			}
		}
	}
		
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		System.out.println(".");
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
		
		System.out.println("You have 15 points to distribute among the following attributes:");
		System.out.printf("Strength, Dexterity, Agility, Constitution %n");
		
		
		while (true) {
			while (true) {
		System.out.println("Insert the Strength value: ");
		strength += read.nextInt();
		System.out.println("Insert the Dexterity value: ");
		dexterity += read.nextInt();
		System.out.println("Insert the Constitution value: ");
		constitution += read.nextInt();
		System.out.println("Insert the Agility value: ");
		agility += read.nextInt();
		
		if(strength + dexterity + constitution + agility == 17) {
			break;
		}
		
		System.out.println("Please enter values ​​whose sum equals 15...");
		}
		System.out.printf("Yes yes, you remember your training. %nAll the power you possess has been the result of your choices over the years.%n");
		System.out.println("Are you satisfied with your choices?");
		System.out.printf("Strength: %d%nDexterity: %d%nConstitution: %d%nAgility: %d%n", strength, dexterity, constitution, agility);
		System.out.println("1-Yes, 2-No");
		int choice = read.nextInt();
		
		if(choice == 1) {
			break;
		}
		}

		System.out.println("Which weapon have you brought with you?");
		System.out.println("1-A Dagger (light Weapon), 2-A Two-Handed Sword (Heavy Weapon)");
		int weapon_choice = read.nextInt();
		
		Weapon w1 = null; 

	
		int PV_max = (random.nextInt(6)+1)+(random.nextInt(6)+1)+(random.nextInt(6)+1)+constitution;
		
		
		
		
		Player p1 = new Player(name, PV_max, PV_max, MP_max, MP_max, strength, constitution, agility, dexterity); 
		
		if (weapon_choice == 1) {
		    w1 = new Weapon("Light Weapon", 2,p1);
		    System.out.println(w1.getDamage());
		} else if (weapon_choice == 2) {
		    w1 = new Weapon("Heavy Weapon", 5,p1);
		    System.out.println(w1.getDamage());
		}

		Armor leather = new Armor(1.5 * constitution);
		
		p1.setWeapon(w1);
		p1.setArmor(leather);
		
		System.out.println(p1.toString());
		
		read.close();
		
		try { Thread.sleep (5000); } catch (InterruptedException ex) {}

		
		Enemy guard = new Enemy("Guard", 30, 2, 0, 2);
		Combat.Fight(guard, p1);
		
		Phase1();
	}
	public static void Phase1() {
		
	}
	
	public static void main(String[] args) {
		
		
		int constitution = 5;
		Armor leather = new Armor(1.5 * constitution);
		Player p1 = new Player("Radi", 20, 20, 20, 20, 10, 5, 0, 0); 
		Weapon w1 = new Weapon("Light Weapon", 2, p1); 
		p1.setWeapon(w1);
		p1.setArmor(leather);
		
		
		
		System.out.println(w1.getDamage());
		
		
		
	}
	
}
