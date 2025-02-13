package com.day8.strings;

import java.util.Scanner;

public class CompareStringAvoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str = input.nextLine().toLowerCase();
		System.out.println("Enter the second string");
		String strNew = input.nextLine().toLowerCase();
		boolean isBoolean = str.equals(strNew);
		System.out.println(isBoolean);
		
	}

}
