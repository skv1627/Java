package com.day8.strings;

import java.util.Scanner;

public class UnicodePrevious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String name=input.next();
		System.out.print("Enter the index: ");
		int index=input.nextInt();
		int unicode=name.codePointAt(index);
		if(index==0) {
			System.out.println("Out of range");
		}else {
			System.out.println("Character unicode point is: "+(unicode-1));
		}
		
	}

}
