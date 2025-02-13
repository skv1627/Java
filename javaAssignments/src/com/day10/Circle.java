package com.day10;

public class Circle extends Shapes {

		public double getPerimeter() {
			perimeter=2*Math.PI*radius*radius;
			return perimeter;
		}
		public double getArea() {
			area=Math.PI*radius*radius;
			return area;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle crc = new Circle();
		crc.setRadius(2.0);
		System.out.println("Area "+crc.getArea());
		System.out.println("Perimeter "+crc.getPerimeter());
		}
	

}
