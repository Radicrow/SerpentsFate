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
	        System.out.println("*               Serpent's Fate                  *");
	        System.out.println("*                 Team Arctic Fox               *");
	        System.out.println("*  Members: Igor \"Radicrow\" Acatuassu           *");
	        System.out.println("*           Enzo \"Jkenji\" Kikuchi               *");
	        System.out.println("*                                               *");
	        System.out.println("*               Welcome to the                  *");
	        System.out.println("*          world of Serpent's Fate!             *");
	        System.out.println("*                                               *");
	        System.out.println("*************************************************");
		Menu();
	}
	
	public static void Tutorial() {
		Scanner read  = new Scanner(System.in);
		System.out.println("Serpent's Fate is a text-fight based JRPG where the players will embark on a journey where");
        System.out.println("they create a character and strive to conquer three battles. Each victorious battle yield rewards,");
        System.out.println("but be prepared, as the game gets tougher with each win. Triumph in all three battles to reach a");
        System.out.printf("victory screen, or face defeat in a fight and restart from the beginning.%n%n");
        System.out.println("Press 0 to return");
        
        int choice = read.nextInt();
        
        if(choice == 0) {
        	Menu();
        }
        else {
        	while (choice!=0){
        	choice = read.nextInt();
        }
        }
        }
	
	public static void Story() {
		System.out.println();
	}
	
	public static void Phase1(Player p1) {
		Random random = new Random();
		Scanner read  = new Scanner(System.in);
		System.out.println("As the first rays of morning sunlight pierce through the thick canopy of trees, you stir from your restless slumber.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("The forest is alive with the songs of birds, and a gentle breeze rustles the leaves overhead. Slowly, you open your eyes, squinting against the brightness above.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.printf("You find yourself by the tranquil shores of a crystal-clear lake. The water sparkles with the vibrant colors of the forest, and a sense of calm washes over you. %n%n");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		
		System.out.println("");
		System.out.println("With a deep breath, you rise to your feet, feeling the warmth of the sunlight on your scales.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("Your reflection shimmers on the surface of the water, a stark reminder of your unique heritage.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("You are a snakefolk, an outcast from your tribe, with scales that glisten like precious gems.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("Your journey to the nearby town lies ahead, but it won't be an easy one. ");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("Your own kind considers you a traitor, and the forest is filled with perils. ");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("But as you stand there, staring at your reflection, you can't help but feel a glimmer of hope—a new dawn.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("With determination in your heart, you prepare to face the challenges that await you in this vast and mysterious world.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
	
		int phase_1 = random.nextInt(3)+1;
		
		if(phase_1 == 1) {
			
			
				System.out.println("As you continue your journey towards the town, you come across a checkpoint.");
		        System.out.println("A heavily armored guard, with a stern expression, blocks your path.");
		        System.out.println("Guard: Halt! Who goes there? State your business!");
		        try { Thread.sleep (6000); } catch (InterruptedException ex) {}
		        
		        System.out.println("How will you respond?");
		        System.out.println("1. Explain your peaceful intentions.");
		        System.out.println("2. Attempt to bribe the guard.");
		        System.out.println("3. Draw your weapon and prepare for a fight.");
		        
		        int choice = read.nextInt();

		        switch (choice) {
		            case 1:
		            	 System.out.println("You calmly explain that you are a peaceful traveler on your way to the nearby town.");
		            	 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                 System.out.println("The guard eyes you suspiciously, slowly drawing his weapon. It is clear that he doesn't trust your words");
		                 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                 System.out.println("Guard: So you expect me to believe a filthy serpentine has peaceful business anywhere nearby??");
		                 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                 System.out.println("Not on my watch!");
		                break;
		                
		            case 2:
		            	 System.out.println("You discreetly offer the guard a handful of coins in hopes of gaining passage.");
		            	 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                 System.out.println("Guard: So you'd try to bribe an official of the Kriften kingdom?? Not on my watch!");
		                 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                break;
		                
		            case 3:
		            	 System.out.println("You draw your weapon, ready to face the guard in combat.");
		            	 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                 System.out.println("Guard: So, you want to fight, huh? Very well!");
		                 try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		                break;
		                
		            default:
		                System.out.println("Invalid choice. Please select 1, 2, or 3.");
		                choice = read.nextInt();
		                break;
		        }
		    
			Enemy guard = new Enemy("Guard", 70, 2, 2, 0, 0);
			Combat.Fight(guard, p1);
		}
		
		else if(phase_1 == 2) {
			
			System.out.println("As you continue your journey, you sense a lurking presence nearby.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
	        System.out.println("Suddenly, a purple-scaled serpentine emerges from the shadows!");
	        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
	        System.out.printf("Rival Serpentine: You thought you could escape, traitor!%n%n");
	        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
	        System.out.println("1. Attempt to reason with the rival, explaining your reasons for leaving the tribe.");
	        System.out.println("2. Draw your weapon and prepare to defend yourself against the furious rival.");
	        
	        Enemy rival_serpentine = new Enemy("Rival Serpentine", 100, 3, 1, 3, 5);
			
	        int choice = read.nextInt();
	        switch (choice) {
            case 1:
            	
                System.out.println("You take a deep breath, trying to calm the situation.");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("You begin to explain your reasons for leaving the tribe, emphasizing your desire for a different path.");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("Purple-Scaled Serpentine: I won't listen to your lies!");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("Despite your calm and eloquence, the rival serpentine still seems to possess a murderous intent and approaches you.");
                System.out.println("1. Continue your persuasion attempt, calmly explaining that's wrong with the tribe's customs and why you wish to escape");
    	        System.out.println("2. Give up and draw your weapon");
    	        
                	int choice2 = read.nextInt();
                	switch (choice2) {
                	case 1:
                		System.out.println("Surprisingly enough... The other serpentine stops walking, still eyeing you with caution...");
                		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                		System.out.println("Suddenly, he sighs in frustation, slowly shaking his head as he appears to consider your words");
                		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                		System.out.println("Purple-Scaled Serpentine: I guess... Your reasoning is not entirely absurd...");
                		try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                		System.out.printf("Purple-Scaled Serpentine: Fine... I'll leave and pretend I never saw you... Don't expect the others %nto be as compassionate as me, though... Farewell");
                		
                		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                		System.out.println("With that, the Serpentine turns around and jumps into a bush, completely escaping your field of vision");
                		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                		System.out.println(p1.getName()+": Welp... That went well...");
                		break;
                	case 2:
                		Combat.Fight(rival_serpentine, p1);
                		break;
                	}
                break;
                
            case 2:
                System.out.println("You draw your weapon, ready to defend yourself.");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("Rival Serpentine: So be it, \"kin\"!");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("The rival serpentine readies their own weapon, hostility filling the air."); 
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                Combat.Fight(rival_serpentine, p1);
                break;
                
            default:
                System.out.println("Invalid choice. The other serpentine grows impatient.");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                System.out.println("Rival Serpentine: Enough games! Prepare to face the consequences!");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                Combat.Fight(rival_serpentine, p1);
                break;
        }
	
			
		}
		
		else if(phase_1 == 3) {
			
			 	System.out.println("As you journey through the dense, moss-covered forest, the air is thick with an eerie silence.");
			 	try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		        System.out.println("Suddenly, the ground beneath your feet rumbles, and the trees seem to shiver in fear.");
		        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		        System.out.println("You sense danger lurking nearby.");
		        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

		        System.out.println("You cautiously move forward, and from the shadows emerges a colossal mossy forest monster!");
		        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		        System.out.println("Its body is covered in thick green moss, blending perfectly with the surroundings.");
		        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		        System.out.printf("The monster's eyes gleam with hunger, and it lets out a menacing growl.%n%n");


		        System.out.println("1. Stand your ground and prepare to fight.");
		        System.out.println("2. Attempt to communicate with the monster.");
		        
		        int choice = read.nextInt();
		        switch (choice) {
	            case 1:
	            System.out.println("You ready your weapons and engage the mossy forest monster in a fierce battle.");
	               break;
	                
	            case 2:
	            System.out.println("The mossy forest monster doesn't seem to comprehend your gestures and advances menacingly.");
	            try { Thread.sleep (2000); } catch (InterruptedException ex) {}
	            System.out.println("You have no choice but to fight.");
	                break;
	                
	            default:
	            	System.out.println("Invalid option! Please choose a valid one");
	            	choice = read.nextInt();
	                break;
	        }

			
			Enemy mossy_monster= new Enemy("Mossy Monster", 150, 2, 2, 3, -1);
			Combat.Fight(mossy_monster, p1);
		}
		
		if(p1.getPV() <= 0) {
			
			GameOver();
	}
		try { Thread.sleep (4000); } catch (InterruptedException ex) {}
		
		Phase2(p1);
	}
	
	public static void Phase2(Player p1) {
		Random random = new Random();
		Scanner read  = new Scanner(System.in);
		System.out.println("LEVEL UP!");
		System.out.println("HP increased!");
		
		
		
		while(true) {
		System.out.println("Please increase 5 points of your attributes");
		
		
		System.out.println("Insert the Strength value: ");
		int str_bonus = read.nextInt();
		System.out.println("Insert the Dexterity value: ");
		int dex_bonus = read.nextInt();
		System.out.println("Insert the Constitution value: ");
		int con_bonus = read.nextInt();
		System.out.println("Insert the Agility value: ");
		int agi_bonus = read.nextInt();
		
		if(str_bonus + dex_bonus+con_bonus+agi_bonus ==5) {
			p1.setStrength(p1.getStrength()+str_bonus);
			p1.setDexterity(p1.getDexterity()+dex_bonus);
			p1.setConstitution(p1.getConstitution()+con_bonus);
			p1.setAgility(p1.getAgility()+agi_bonus);
			break;
		}
		System.out.println("Please enter values ​​whose sum equals 5...");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		}
		
		p1.setPV_max(p1.getPV_max()+p1.getConstitution());
		p1.setPV(p1.getPV_max());
		p1.setPotion(3);
		p1.setMP_max(15);
		p1.setMP(p1.getMP_max());
		
		System.out.println("You also find two brand new weapons");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Which one are you going to pick?");
		System.out.println("1- a Golden Dagger (Light Weapon) 2- a Mythril Saber (Heavy Weapon)");
		
		int weapon_2 = read.nextInt();
		if(weapon_2 == 1) {
			Weapon w2 = new Weapon("Light Weapon",10,p1);
			p1.setWeapon(w2);
		}
		
		if(weapon_2 == 2) {
			Weapon w2 = new Weapon("Heavy Weapon",12,p1);
			p1.setWeapon(w2);
		}
		try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		System.out.println(p1.toString());
		try { Thread.sleep (8000); } catch (InterruptedException ex) {}
		
		
		System.out.println("As the sun sets over the dense forest, " +p1.getName() + " slithers silently");
		System.out.println("through the underbrush. The distant sounds of the tribal drums and chants still echo in your ears.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("Suddenly, you come upon a clearing in the forest, and there, bathed in the ethereal glow of fireflies, you see a scarlet-scaled Serpentine shaman.");
		System.out.println("Their eyes are like shimmering emeralds, and they carry an air of wisdom and mysticism. The shaman looks up as you approach.");
		try { Thread.sleep (3000); } catch (InterruptedException ex) {}
		System.out.println("Serpentine Shaman: Greetings, lost one. What brings you to this place?");
		try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		System.out.println("1- I seek guidance and a better tomorrow.");
		System.out.println("2- None of your business. Stand aside!");
		
			int shaman_choice = read.nextInt();
			
			switch (shaman_choice) {
				case 1:
					System.out.println("Serpentine Shaman: I sense the turmoil in your heart, young one. Oh yes... Our ancestors have told me about you...");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("Serpentine Shaman: You have strayed from your tribe, and they consider you a traitor. The path you've chosen is perilous, you know? Still... I understand your reasons."); 
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("Serpentine Shaman: Would you like some advice for your journey?");
					System.out.println(p1.getName()+": Y-Yes... Of course");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("You reply almost without thinking");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("The Shaman then gestures for you to sit on the floor, next to them...");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("And so you do...");
					try { Thread.sleep (2000); } catch (InterruptedException ex) {}
					System.out.println("Both of you spend a couple minutes talking about the perils of this forest... Then those minutes turn into hours");
					System.out.println("And soon, you find yourself talking to them about the simplest of the subjects, from your tribe's traditions");
					System.out.println("To your plans for the future...");
					try { Thread.sleep (6000); } catch (InterruptedException ex) {}
					System.out.println("Finally being able to get this off your chest and talking to someone like this felt... nice...");
					try { Thread.sleep (1000); } catch (InterruptedException ex) {}
					System.out.print(".");
					try { Thread.sleep (1000); } catch (InterruptedException ex) {}
					System.out.print(".");
					try { Thread.sleep (1000); } catch (InterruptedException ex) {}
					System.out.println(".");
					try { Thread.sleep (1000); } catch (InterruptedException ex) {}
					System.out.println("After a while, you gesture with your head that you must continue your journey...");
					try { Thread.sleep (3000); } catch (InterruptedException ex) {}
					System.out.println("Before you go... Young one... One last piece of advice from the forest itself.");
					try { Thread.sleep (3000); } catch (InterruptedException ex) {}
					System.out.println("In the forest, danger lurks in unexpected places. Not only you'll have to worry about the elite guards");
					System.out.println("that now roam this forest... But there's also a... spreading corruption... It's vile claws tainting everything it touches;");
					try { Thread.sleep (6000); } catch (InterruptedException ex) {}
					System.out.println("If you encounter one of these... Please be careful.");
					System.out.println(p1.getName()+": I'll keep that in mind. Thank you for your kindness and advice...");
					
					System.out.println("With that... You give the Shaman a warm smile before turning around and leaving.");
					break;
				case 2:
					System.out.println("Serpentine Shaman: May your path be as you wish. Farewell, lost one.");
					break;
			}
			
		
		int phase_2 = random.nextInt(2)+1;
		try { Thread.sleep (6000); } catch (InterruptedException ex) {}
		if (phase_2==1) {
			System.out.println("As you continue your journey through the twisted forest,");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("a sinister presence hangs heavy in the air. Suddenly, a grotesque figure emerges from the shadows.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("It's a corrupt demonic creature, its form a twisted amalgamation of flesh and darkness.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Its bloodshot eyes fixate on you with malevolent intent, and its jagged claws drip with a sickly, greenish ooze.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Creature: Sssserpentine... I sssmell your fear.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("You instinctively jump back, startled... You reach out for your weapon and hold it in front of your face");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println(p1.getName() + ": Stand back! Whatever you are... ");
			
			Enemy demon = new Enemy("Demonic Creature", 160, 2, 3, 5, 3);
			Combat.Fight(demon,p1);
		}
		else if (phase_2 == 2) {
			System.out.println("As you continue your journey through the twisted forest,");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("you hear a certain someone approaching. You can hear their heavy armor clinging as they walk.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("You hold your breath, hoping to remain unseen by whatever it is... However, it clearly saw you.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Royal Guard: STEP OUT OF THE SHADOWS, VILE CREATURE! I CAN SMELL THE FOUL BLOOD THAT RUNS WITHIN YOUR VEINS");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("You quickly unsheathe your weapon, instinctively jumping back, startled...");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println(p1.getName() + ": Stand back! Whoever you are... ");
			Enemy elite_guard = new Enemy("Kriften's Royal Guard", 130, 3, 3, 6, 0);
			Combat.Fight(elite_guard,p1);
		}
		
		
		if(p1.getPV() <= 0) {
			
			GameOver();
	}
		
		System.out.printf("YOU WON!%n%n");
		try { Thread.sleep (2000); } catch (InterruptedException ex) {}
		Phase3(p1);
	}
	
	public static void Phase3(Player p1) {
		Random random = new Random();
		Scanner read  = new Scanner(System.in);

		
		System.out.println("LEVEL UP!");
		System.out.println("HP increased!");
		
		
		while(true) {
			System.out.println("Please increase 10 points of your attributes");
			
			
			System.out.println("Insert the Strength value: ");
			int str_bonus = read.nextInt();
			System.out.println("Insert the Dexterity value: ");
			int dex_bonus = read.nextInt();
			System.out.println("Insert the Constitution value: ");
			int con_bonus = read.nextInt();
			System.out.println("Insert the Agility value: ");
			int agi_bonus = read.nextInt();
			
			if(str_bonus + dex_bonus+con_bonus+agi_bonus ==10) {
				p1.setStrength(p1.getStrength()+str_bonus);
				p1.setDexterity(p1.getDexterity()+dex_bonus);
				p1.setConstitution(p1.getConstitution()+con_bonus);
				p1.setAgility(p1.getAgility()+agi_bonus);
				break;
			}
			System.out.println("Please enter values ​​whose sum equals 10...");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
			
			p1.setPV_max(p1.getPV_max()+(p1.getConstitution()*2));
			p1.setPV(p1.getPV_max());
			p1.setPotion(3);
			p1.setMP_max(25);
			p1.setMP(p1.getMP_max());
			
			System.out.println("You also find a brand thing... What is it?");
			System.out.println("1- Firescale Armor 2- Mythril Armor 3- Eternal Armor");
			int armadura = read.nextInt();
			
			if (armadura == 1) {
				Armor Firescale = new Armor(8);
				p1.setArmor(Firescale);
			}
			
			else if (armadura == 2) {
				Armor Mythril = new Armor(10);
				p1.setArmor(Mythril);
			}
			else if (armadura == 3) {
				Armor Eternal = new Armor(9);
				p1.setArmor(Eternal);
			}
			
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.print(".");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.print(".");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.println(".");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			
			
			System.out.println("As you continue your journey through the dense forest,");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.println("you suddenly sense a powerful presence nearby. Standing in front of you,"); 
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.println("you behold a well-known figure among the region: Val, the elite guard of the Kriften Empire.");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.println("She stands tall and imposing, a red-scaled dragonborn with eyes that gleam with a fierce determination.");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Her crimson armor gleams in the dappled moonlight");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("She glances at you, fury visible in her gaze...");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Val: Turn around, Serpentine! There's nothing here for your kind...");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("You flinch, not expecting to be \"welcomed\" into the city by someone this powerful");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.print(".");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.print(".");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println(".");
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			System.out.println("Yet... You don't step away... You know that heading back into the forest means you'll likely");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("Find more angry guards, monsters or other Serpentine... You can't take those chances...");
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println(p1.getName()+": I don't care who you are... You're not stopping me from reaching that town and escaping from my tribe");
			
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("She grins maliciously in response, slowly drawing her weapon as well...");
			
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			System.out.println("If that's the end you desire... Then I shall give it to you!");
			
			
			
			Enemy Val = new Enemy("Val", 250, 5,5,5,-10);
			
			Combat.ValFight(Val, p1);
			
			if(p1.getPV() <= 0) {
				
				GameOver();
		}
			
			try { Thread.sleep (2000); } catch (InterruptedException ex) {}
			
			System.out.printf("%n%n%n%n");
			System.out.println("After what it felt like an eternity battling what could only be described as a ferocious beast");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("in the vessel of a red dragonborn, Val suddenly stops... Her entire body covered in wounds and blood!");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("Val: It appears I was wrong about you... I can see how you fight... It's a battle of survival,");
			System.out.printf("not of malice or violence...%n%n");
			try { Thread.sleep (4000); } catch (InterruptedException ex) {}
			
			System.out.println("Val: Very well... You shall proceed. Just don't cause any trouble...");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("Still shocked, you slowly nod your head, sheathing your weapon as she calmly does the same.");
			try { Thread.sleep (5000); } catch (InterruptedException ex) {}
			System.out.println("You then immediatelly start to walk away, still eyeing the dragonborn with caution and a bit of uncertainty");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("She responds to that with a sarcastic smirk, turning around and starting to walk away as well");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("Val: One last thing... You are... Strong. Only a few people have seen and survived my rage...");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.printf("Val: Don't lose sight of what's really important and you'll be fine.%n%n");
			try { Thread.sleep (4000); } catch (InterruptedException ex) {}
			System.out.printf("Val: For now though... That's farewell.%n%n");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("With that, she finally leaves... Allowing you to finally reach your destination");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("It doesn't take long until you reach the town's outskirts, feeling a smile grow on your face");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("As you glance at all those commoners calmly walking around and working as if they had nothing to");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("worry about... Nothing to fear.");
			
			try { Thread.sleep (5000); } catch (InterruptedException ex) {}
			System.out.println("You know this isn't the end, and that you'll probably have to fight a lot to earn your place");
			try { Thread.sleep (200); } catch (InterruptedException ex) {}
			System.out.println("But... today... Escaping is a victory! And it must be cherished.");
			
			try { Thread.sleep (4000); } catch (InterruptedException ex) {}
			
			System.out.println("You look in front of you, hopeful for your future, knowing that you won't have to");
			System.out.println("partake in all those endless killings and those awful nightmares you used");
			System.out.println("This... This is all you could've asked for...");
			try { Thread.sleep (4000); } catch (InterruptedException ex) {}
			
			System.out.println(".");
			try { Thread.sleep (300); } catch (InterruptedException ex) {}
			System.out.println(".");
			try { Thread.sleep (300); } catch (InterruptedException ex) {}
			System.out.println(".");
			try { Thread.sleep (300); } catch (InterruptedException ex) {}
			
			System.out.println("THANK YOU FOR PLAYING THE GAME!!");
			try { Thread.sleep (2200); } catch (InterruptedException ex) {}
			System.exit(0);
		
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
	            	GameStart();
	                break;
	            case 2:
	                Tutorial();
	                break;
	            case 3:
	            	Story();
	            	break;
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
	
	
	public static void GameStart() {
		
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		int strength=0;
		int dexterity=0;
		int constitution=0;
		int agility=0;
		
		
		
		System.out.println("As the darkness engulfs your vision, you feel weightless, adrift in a surreal void. Whispers of distant memories begin to echo in your mind.");
		System.out.println("\"Where am I? This place... it feels like a forgotten dream. Why... Why am I here?\"");
		System.out.printf("As you look around, you see fragmented images of your past flashing before your eyes... The towering trees of your tribal home, %nthe flickering bonfires, and the faces of your kin.%n");
		System.out.printf("\"My tribe... the Serpentine. But... Why did I leave them?\"%n%n");
		
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
		
		int MP_max = 10;
		String bonus = null;
		
		while(true) {
		if(dialogue_choice == 1) {
			 	System.out.println("In your memory, you find yourself in a serene forest glade, surrounded by your Serpentine kin.");
			    System.out.println("The unity and traditions of your tribe warm your heart.");
			    System.out.println("You recall the teachings of your elders, the wisdom passed down through generations.");
			    System.out.println("You were known for your loyalty, your skills as a healer, and your ability to mediate conflicts among your kin.");
			    System.out.println("Green-Scaled Ancestor: \"You were a pillar of our tribe, a keeper of our traditions...\"");
			    bonus = "Con";
			    System.out.println("You received a Constituion bonus...");
			    break;
		}
		else if(dialogue_choice == 2) {
				System.out.println("In this path, you confront the memories of the day you chose to leave your tribe, the sense of isolation, and the reasons behind your decision.");
			    System.out.println("The dream shifts to a stormy night, where rain lashes against the towering trees of your homeland.");
			    System.out.println("Your tribe's accusing eyes pierce through the darkness.");
			    System.out.println("You think about the disagreements and tensions that led to your departure.");
			    System.out.println("Your desire for something more, something beyond the killings and cruelties you witnessed in your tribe, everything pushed you to escape.");
			    System.out.println("Red-Scaled Ancestor: \"You carried the weight of your choices, young one.\"");
			    bonus = "Dex";
			    System.out.println("You received a Dexterity bonus...");
			    break;
		}
		else if(dialogue_choice == 3) {
			  	System.out.println("In this path, you focus on your determination to reach the nearby town, the driving force behind your escape.");
			    System.out.println("The dream transports you to a moonlit desert, vast and unforgiving, with the town's distant lights as your beacon.");
			    System.out.println("You recall the hardships you've faced, the skills you've honed, the friends you left behind.");
			    System.out.println("You're determined to find a new life and purpose beyond the confines of your tribe.");
			    System.out.println("Blue-Scaled Ancestor: \"Your strength of purpose will guide you, young one.\"");
			    bonus = "Agi";
			    System.out.println("You received an Agility bonus...");
			    break;
		}
		else {
			while(dialogue_choice != 1 && dialogue_choice != 2 && dialogue_choice != 3) {
				System.out.println("You must try harder to remember... You must...");
				dialogue_choice = read.nextInt();
			}
		}
		 
	}
		
		try { Thread.sleep (10000); } catch (InterruptedException ex) {}
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
		strength = read.nextInt();
		System.out.println("Insert the Dexterity value: ");
		dexterity = read.nextInt();
		System.out.println("Insert the Constitution value: ");
		constitution = read.nextInt();
		System.out.println("Insert the Agility value: ");
		agility = read.nextInt();
		
		if ( bonus == "Con") {
			constitution+=2;
		}
		else if ( bonus == "Dex") {
			dexterity+=2;
		}
		else if ( bonus == "Agi") {
			agility+=2;
		}
		
		
		if(strength + dexterity + constitution + agility == 17) {
			break;
		}
		
		System.out.println("Please enter values whose sum equals 15...");
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

	
		int PV_max = ((random.nextInt(6)+1)+(random.nextInt(6)+1)+(random.nextInt(6)+1)+constitution)*2;
		
		
		
		
		Player p1 = new Player(name, PV_max, PV_max, MP_max, MP_max, strength, constitution, agility, dexterity); 
		
		if (weapon_choice == 1) {
		    w1 = new Weapon("Light Weapon", 3,p1);
		} else if (weapon_choice == 2) {
		    w1 = new Weapon("Heavy Weapon", 4,p1);
		}

		Armor leather = new Armor(5);
		
		p1.setWeapon(w1);
		p1.setArmor(leather);
		
		System.out.println(p1.toString());
		
		
		
		try { Thread.sleep (5000); } catch (InterruptedException ex) {}

		
		Phase1(p1);
		
			
			
	}

	
	public static void GameOver() {
		Scanner read = new Scanner(System.in);
		
		System.out.println("You drop to your knees... Unable to continue fighting...");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.print(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println(".");
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Your blurry vision starts to darken");
		
		try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		
		System.out.println("Game Over!");
		System.out.printf("Would you like to play again?%n1-YES! 2-No...%n");
		
		int over = read.nextInt();
		if (over == 1) {
		System.out.println("Yes... You'll get another chance!");
		Menu();
		}
		else if(over == 2) {
		System.out.println("I'm sure you'll find a way to stand back up again...");
		System.out.println("In the meantime, though, thank you for playing!");
		System.exit(0);
		}
		else {
			while(over !=1 && over !=2) {
			System.out.printf("Please insert a valid value!");
			over = read.nextInt();
			}
		}
		
	
		
	
	}
	
	
	
	public static void main(String[] args) {
		
       
		Intro();
        

	}
	
}
