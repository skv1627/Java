package com.day6.loops;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch=input.next().charAt(0);
		int asciiValue = (int)ch;
		System.out.println("The Ascii Value is"+asciiValue);
	}

}
