package com.day8.strings;

import java.util.Scanner;

public class StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str = input.nextLine();
		System.out.print("Enter the second string: ");
		String strNew = input.nextLine();
		boolean isBoolean = str.startsWith("Red");
		System.out.println(isBoolean);
		boolean isBool = strNew.startsWith("Red");
		System.out.println(isBool);
	
	}

}
