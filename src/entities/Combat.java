package entities;
import java.util.Scanner;
import java.util.Random;


public class Combat {

	public static void Fight(Enemy enemy, Player player) {
		
		while(player.getPV()>0 && enemy.getPV()>0)
		if(player.getAgility()>enemy.getAgility()) {
			PlayerAttack(enemy, player);
			EnemyAttack(enemy, player);
		}
		else {
			EnemyAttack(enemy, player);
			PlayerAttack(enemy, player);
		
		}
		System.out.println("Player HP:"+ " "+player.getPV());
		System.out.println("Enemy HP:"+ " "+enemy.getPV());
	}
	
	public static void PlayerAttack(Enemy enemy, Player player) {
		System.out.println(player.getDamage());
		enemy.damage(player.getDamage());
	}
	
	public static void EnemyAttack(Enemy enemy, Player player) {
		player.damage(3);
	}
	
}
