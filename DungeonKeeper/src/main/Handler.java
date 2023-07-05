package main;

import java.util.*;

public class Handler {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Combatant> fighters = new ArrayList<Combatant>();
	
	// Start Here
	public void getCombatants() {
		System.out.print("How many players?: ");
		
		int players = sc.nextInt();
		
		System.out.print("\nHow many enemies? : ");
		
		int enemies = sc.nextInt();
		
		buildEncounter(players, enemies);
	}
	
	private void buildEncounter(int p, int e) {
		
		Combatant[] players = new Combatant[p];
		Combatant[] enemies = new Combatant[e];
		
		for (int i = 0; i < p; i++) {
			players[i] = new Combatant();
		}
		
		for (int i = 0; i < e; i++) {
			enemies[i] = new Combatant();
		}
		
		for (int i = 0; i < p; i++) {
			System.out.print("Player " + (i + 1) + " name?: ");
			
			players[i].setName(sc.next());
			
			System.out.print("Player " + (i + 1) + " initiative?: ");
			
			players[i].setInit(sc.nextInt());
			
			fighters.add(players[i]);
		}
		
		for (int i = 0; i < e; i++) {
			System.out.print("Enemy " + (i + 1) + " name?: ");
			
			enemies[i].setName(sc.next());
			
			System.out.print("Enemy " + (i + 1) + " initiative?: ");
			
			enemies[i].setInit(sc.nextInt());
			
			fighters.add(enemies[i]);
		}
		
		System.out.print(fighters);
		
		CombatantSort();
		
	}
	
	private void CombatantSort() {
		
		CombatComparator cc = new CombatComparator();
		
		fighters.sort(cc);
		
		System.out.print(fighters);
		
		
		
	}

}




























