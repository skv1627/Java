package com.day8.strings;

import java.util.Scanner;

public class Samedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str = input.nextLine();
		System.out.println("Enter the second string: ");
		String strNew = input.nextLine();
		boolean data = str.equals(strNew);
		System.out.println(data);
		
	}

}
