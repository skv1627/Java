package com.day8.strings;

import java.util.Scanner;

public class ToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
		str = str.toUpperCase();
		System.out.println(str);
	}

}
