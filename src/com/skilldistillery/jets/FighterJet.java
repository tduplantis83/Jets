package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price, char jetType) {
		super(model, speed, range, price, jetType);
	}
	
	public void fly() {
		// prints out all fields
		// prints time the jet can fly before running out of fuel
		System.out.print(super.toString());
		System.out.printf("Max Flight Time:\t%.2f Hours \n\n", (super.getRange() / super.getSpeed()));
	}

	@Override
	public void fight() {
		System.out.println("Initiating Dogfight...");
		System.out.print(super.toString());
		System.out.println("\nManeuver: 4g Inverted Dive\nDistance to Mig28: 2 meters");
		System.out.println("Communicating with enemy: Flip him the bird & take a Polaroid");
		System.out.println("Moving to his six....");
		System.out.println("Too close for missles. Switching to Guns!");
		System.out.println("Enemy DESTROYED!!!!");

	}
	
	public String toString() {
		return super.toString();
	}


}
