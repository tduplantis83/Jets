package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
		super();
	}

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		// prints out all fields
		super.toString();

		// prints time the jet can fly before running out of fuel
		System.out.println("Total Flight Time: " + (super.getRange() / super.getSpeed()));
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo onto the jet....");
		System.out.println("Load complete. Bird is HEAVY.");
	}
	
	

}
