package com.day11.polymorphism;

public class ShapeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		System.out.println("Area of Circle "+c.calculateArea(7.0));
		System.out.println("Area of Rectangle "+r.calculateArea(9.0, 3.0));
		System.out.println("Area of Triangle "+t.calculateArea(4.0, 2.0));
	}

}
