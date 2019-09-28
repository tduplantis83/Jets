package com.skilldistillery.jets;

public class PassengerJet extends Jet implements CarryPassengers{
	
	
	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price, char jetType) {
		super(model, speed, range, price, jetType);
	}
	
	public void fly() {
		// prints out all fields
		// prints time the jet can fly before running out of fuel
		System.out.print(super.toString());
		System.out.printf("Max Flight Time:\t%.2f Hours \n\n", (super.getRange() / super.getSpeed()));
	}

	@Override
	public void loadPassengers() {
		System.out.println("Welcome passengers. We will now begin boarding at gate A13...");
		System.out.println("First Class passengers may begin boarding at this time.");
		System.out.println(".........");
		System.out.println("If you're a Senior, or are traveling with small children, please step forward to board the plane.");
		System.out.println(".........");
		System.out.println("Next we'd like to invite our Veterans to begin boarding.");
		System.out.println(".........");
		System.out.println("We will now begin general passenger boarding.");
		System.out.println(".........");
		System.out.println("Final call for all passengers at gate A13.");
		System.out.println("Boarding Complete...Retracting jetway.");
	}
	
	public String toString() {
		return super.toString();
	}
	
	
}
