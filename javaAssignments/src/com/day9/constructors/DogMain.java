package com.day9.constructors;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("bunny","pomerain");
		Dog dog2 = new Dog("Snoopy","Huskie");
		System.out.println("First dog details: ");
		dog1.printDetails();
		System.out.println("Second dog details: ");
		dog2.printDetails();
		dog1.setName("Woof");
		dog1.setBreed("Lab");
		System.out.println("Third dog details: ");
		dog1.printDetails();
		System.out.println("Fourth dog details: ");
		dog2.setName("jikki");
		dog2.setBreed("dolmation");
		dog2.printDetails();
		
		
	}

}
