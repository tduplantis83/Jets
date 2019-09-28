package com.skilldistillery.jets;

import java.text.NumberFormat;

public abstract class Jet {
	private String model;
	private double speed;
	private double mach;
	private int range;
	private long price;
	private char jetType;
	NumberFormat nf = NumberFormat.getCurrencyInstance();

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
	
	private void setMach() {
		this.mach = this.speed * 0.001303;
	}
	
	public double getMach() {
		setMach();
		return this.mach;
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
		//format speed for output
		String fmtSpeed = String.format("%.0f", speed);
		String fmtMach = String.format("%.4f", getMach());
		
		StringBuilder builder = new StringBuilder();
		builder.append("Model:\t");
		builder.append(model);
		builder.append("\nSpeed:\t");
		builder.append(fmtSpeed);
		builder.append(" MPH / ");
		builder.append(fmtMach); 
		builder.append(" Mach");
		builder.append("\nRange:\t");
		builder.append(range);
		builder.append(" Nautical Miles");
		builder.append("\nPrice:\t");
		builder.append(nf.format(price));
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
