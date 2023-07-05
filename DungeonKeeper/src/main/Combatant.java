package main;

public class Combatant {
	
	private String name;
	private Integer initiative;
	private Integer order;
	
	public Combatant() {
		
		name = "";
		initiative = 0;
		order = 0;
		
	}
	
	public Combatant(String n, int i) {
		
		name = n;
		initiative = i;
		order = 0;
		
	}
	
	// --- Setters --- //
	
	public void setName(String n) {
		name = n;
	}
	
	public void setInit(int i) {
		initiative = i;
	}
	
	public void setOrder(int o) {
		order = o;
	}
	
	// --- Getters --- //
	
	public String getName() {
		return name;
	}
	
	public Integer getInit() {
		return initiative;
	}
	
	public Integer getOrder() {
		return order;
	}
	
	// --- Misc --- //
	
	public String toString() {
		return name + ": " + initiative;
	}

}

















