package com.day11.polymorphism;

public class VehichleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(100);
		System.out.println("Car speed increased to " +car.speedUp(5));
		Bicycle bc = new Bicycle(50);
		System.out.println("Bicycle speed increased to "+bc.speedUp(10));
	}

}
