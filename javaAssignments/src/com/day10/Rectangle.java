package com.day10;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	public int getArea() {
		return length*width;
	}
	public void printDetails() {
		System.out.println("Length is: "+length);
		System.out.println("Width is: "+width);
		System.out.println("Area is: "+getArea());
	}
}
