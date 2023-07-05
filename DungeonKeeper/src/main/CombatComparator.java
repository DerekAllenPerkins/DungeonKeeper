package main;

import java.util.Comparator;

public class CombatComparator implements Comparator<Combatant> {

	public int compare(Combatant c1, Combatant c2) {
		return c2.getInit().compareTo(c1.getInit());
	}
	
}
