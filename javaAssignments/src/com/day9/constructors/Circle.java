package com.day9.constructors;

public class Circle {
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return (Math.PI*radius*radius);
	}
	public double circumference() {
		return (2*Math.PI*radius);
	}
	public void printDetails() {
		System.out.println("Circle Details: ");
		System.out.println("Radius: "+radius);
		System.out.println("Area: "+area());
		System.out.println("Circumference: "+circumference());
	}
}
