package com.day8.strings;

import java.util.Scanner;

public class EndContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str = input.nextLine();
		System.out.print("Enter the second string: ");
		String strNew = input.next();
		String lastTwoOfStr = str.substring(str.length()-2);
		String lastTwoOfStrNew = str.substring(strNew.length()-2);
		boolean isBoolean=lastTwoOfStr.endsWith(lastTwoOfStrNew);
		System.out.println(isBoolean);
	}

}
