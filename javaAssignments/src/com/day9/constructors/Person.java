package com.day9.constructors;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void printDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
