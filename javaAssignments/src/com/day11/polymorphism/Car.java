package com.day11.polymorphism;

public class Car extends Vehicle{

	public Car(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}
	public int speedUp(int speedIncrease) {
		return speed+=speedIncrease;
	}
	
}
