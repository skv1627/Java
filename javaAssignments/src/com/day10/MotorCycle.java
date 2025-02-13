package com.day10;

public class MotorCycle extends Vehicles {

	public MotorCycle(String make, String model, int year, String fuelType, int miles, int fuelUsed) {
		super(make, model, year, fuelType, miles, fuelUsed);
		// TODO Auto-generated constructor stub
	}
	public int fuelEfficiency() {
		int fueleff = miles/fuelUsed;
		return fueleff;
	}
	public int distanceTravelled(int speed,int time) {
		int distance=speed/time;
		return distance;
	}
	public int speed() {
		return 50;
	}
	
}
