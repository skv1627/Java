package com.day11.polymorphism;

public class Programmer extends Employee{

	public void calculateSalary() {
		System.out.println("Salary of Programmer is $100K");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		p.calculateSalary();
	}

}
