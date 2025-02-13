package com.day8.strings;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String name = new String();
		name = input.nextLine();
		System.out.print("Enter the second string: ");
		String name1 = new String();
		name1=input.nextLine();
		System.out.println(name.concat(name1));
	}

}
