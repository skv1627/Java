package com.day11.polymorphism;

public class Circle extends Shape {
	private double radius;
	
	public double calculateArea(double radius) {
		return Math.PI*radius*radius;
	}

}
