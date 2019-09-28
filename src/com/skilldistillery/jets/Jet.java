package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private char jetType;

	public Jet() {

	}

	public Jet(String model, double speed, int range, long price, char jetType) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.jetType = jetType;
	}

	public abstract void fly();

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public char getJetType() {
		return jetType;
	}
	
	public void setJetType(char jetType) {
		this.jetType = jetType;
	}
	
	public double getSpeedInMach() {
		
		return 0.0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Model:\t");
		builder.append(model);
		builder.append("\nSpeed:\t");
		builder.append(speed);
		builder.append(" MPH");
		builder.append("\nRange:\t");
		builder.append(range);
		builder.append(" Nautical Miles");
		builder.append("\nPrice:\t");
		builder.append("$" + price);
		if(jetType == 'C') {
			builder.append("\nType:\tCargo\n");
		}
		else if(jetType == 'F') {
			builder.append("\nType:\tFighter\n");
		}
		else {
			builder.append("\nType:\tPassenger\n");
		}
		
		return builder.toString();
	}
	
	
	
}
