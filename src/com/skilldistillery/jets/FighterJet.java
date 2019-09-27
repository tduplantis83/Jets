package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		//prints out all fields
		super.toString();
		
		//prints time the jet can fly before running out of fuel
		System.out.println("Total Flight Time: " + (super.getRange() / super.getSpeed()));
	}

	@Override
	public void fight() {
		System.out.println("Initiate Dogfight\nManeuver: 4g Inverted Dive\nDistance to Mig28: 2 meters");
		System.out.println("Communicating with enemy: Flip him the bird.\nDocument: Take a Polaroid");
	}


}
