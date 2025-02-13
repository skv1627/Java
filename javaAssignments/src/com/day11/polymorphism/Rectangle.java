package com.day11.polymorphism;

public class Rectangle extends Shape {
private double length;
private double width;

public double calculateArea(double length, double width) {
	return length*width;
}
}
