package com.day10;

public class Person {
	String firstName;
	String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void printDetails() {
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
	}
	
}
