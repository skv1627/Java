package com.day9.constructors;

public class Dog {
	String name;
	String breed;
	
	public Dog(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
	}
}
