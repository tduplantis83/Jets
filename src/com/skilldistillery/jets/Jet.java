package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet () {
		
	}

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public abstract void fly();
	
	public double getSpeedInMach() {
		
		return 0.0;
	}
	
	
}
