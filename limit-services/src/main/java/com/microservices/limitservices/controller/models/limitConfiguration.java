package com.microservices.limitservices.controller.models;

public class limitConfiguration {

	private int maximum;
	private int minimum;	
	
	public limitConfiguration() {
		super();
	}
	
	public limitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
	
}
