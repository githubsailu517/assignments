package com.h2k.collections;

public class Car {
	String make;
	String model;
	
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public String toString(){
		return make + " " + model; 
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
