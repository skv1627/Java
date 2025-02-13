package com.day9.constructors;

public class Rectangle {

	int length;
	int width;
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	public int area() {
		return length*width;
		
	}
	public int perimeter() {
		return 2*(length+width);
	}
	
	public void printDetails() {
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}
