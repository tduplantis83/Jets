package com.skilldistillery.jets;

public class PassengerJet extends Jet{
	
	
	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		//prints out all fields
		super.toString();
		
		//prints time the jet can fly before running out of fuel
		System.out.println("Total Flight Time: " + (super.getRange() / super.getSpeed()));
	}
	
	
}
