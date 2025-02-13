package com.day8.strings;

import java.util.Scanner;

public class LexicograhicallyIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String name = new String();
		name = input.nextLine().toLowerCase();
		System.out.print("Enter the second string: ");
		String name1 = new String();
		name1=input.nextLine().toLowerCase();
		int isSame=name.compareTo(name1);
		if(isSame==0) {
			System.out.println(name+" is same as "+name1);
		}else if(isSame>0) {
			System.out.println(name+" is greater than "+name1);
		}else {
			System.out.println(name+" is less than "+name1);
		}
		
	}

}
