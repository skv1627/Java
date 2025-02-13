package com.day11.polymorphism;

public class Bicycle extends Vehicle {

	public Bicycle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}
	public float speedUp(float speedIncrease) {
		return speed+=speedIncrease;
	}

}
