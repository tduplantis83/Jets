package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
		super();
	}

	public CargoJet(String model, double speed, int range, long price, char jetType) {
		super(model, speed, range, price, jetType);
	}

	public void fly() {
		// prints out all fields
		// prints time the jet can fly before running out of fuel
		System.out.print(super.toString());
		System.out.printf("Max Flight Time:\t%.2f Hours \n\n", (super.getRange() / super.getSpeed()));
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo onto the jet....");
		System.out.print(super.toString());
		System.out.println("Load complete. Bird is HEAVY.\n");
	}
	
	public String toString() {
		return super.toString();
	}
	
	

}
