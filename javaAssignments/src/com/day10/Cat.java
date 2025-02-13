package com.day10;

public class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.makeSound();
	}

}
