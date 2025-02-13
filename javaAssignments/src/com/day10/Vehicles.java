package com.day10;

public class Vehicles {
protected int miles;
protected int fuelUsed;
protected	String make;
protected String model;
protected int year;
protected String fuelType;
public Vehicles(String make,String model,int year,String fuelType,int miles,int fuelUsed) {
	this.make=make;
	this.model=model;
	this.year=year;
	this.fuelType=fuelType;
	this.miles=miles;
	this.fuelUsed=fuelUsed;
	
}
public void printDetails() {
	System.out.println("Make: "+make);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Fueltype: "+fuelType);
}

}
