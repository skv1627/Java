package com.day11.polymorphism;

public class Triangle extends Shape{
private double height;
private double breadth;

public double calculateArea(double height, double breadth) {
	return (0.5*height*breadth);
}
}
