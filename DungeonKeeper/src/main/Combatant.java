package main;

public class Combatant {
	
	private String name;
	private byte initiative;
	private byte order;
	
	public Combatant() {
		
		name = "";
		initiative = 0;
		order = 0;
		
	}
	
	public Combatant(String n, byte i) {
		
		name = n;
		initiative = i;
		order = 0;
		
	}
	
	// --- Setters --- //
	
	public void setName(String n) {
		name = n;
	}
	
	public void setInit(byte i) {
		initiative = i;
	}
	
	public void setOrder(byte o) {
		order = o;
	}
	
	// --- Getters --- //
	
	public String getName() {
		return name;
	}
	
	public byte getInit() {
		return initiative;
	}
	
	public byte getOrder() {
		return order;
	}

}

















