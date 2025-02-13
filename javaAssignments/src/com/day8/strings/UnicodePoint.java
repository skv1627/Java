package com.day8.strings;

import java.util.Scanner;

public class UnicodePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String:: ");
		String name = input.nextLine();
		System.out.print("Enter the index: ");
		int index = input.nextInt();
		int unicode=name.codePointAt(index);
		System.out.print("Unicode point at index "+index+" is: "+unicode );
	}

}
