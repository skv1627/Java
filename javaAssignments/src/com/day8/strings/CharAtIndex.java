package com.day8.strings;

import java.util.Scanner;

public class CharAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name="Java Exercises!";
		System.out.print("Enter the index you want to fetch: ");
		int index=input.nextInt();
		char ch=name.charAt(index);
		System.out.print("The character at position "+index+" is "+name.charAt(index));
	}

}
