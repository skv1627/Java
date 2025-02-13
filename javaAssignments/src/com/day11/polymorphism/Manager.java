package com.day11.polymorphism;

public class Manager extends Employee{
public void calculateSalary() {
	System.out.println("Salary of Manager is $120k");
}
public static void main(String[] args) {
	Manager m = new Manager();
	m.calculateSalary();
}
}
