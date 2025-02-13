package com.day8.strings;

import java.util.Scanner;

public class IndexOfCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: \n");
		String str = input.nextLine();
		str = str.toLowerCase();
		System.out.println("a  b c d e f g h i j");
		System.out.println("====================");
		for(char ch ='a';ch<='j';ch++) {
			System.out.print(str.indexOf(ch)+" ");
		}
		System.out.println("\nk l m n o p q r s t");
		System.out.println("====================");
		for(char ch = 'k';ch<='t';ch++) {
			System.out.print(str.indexOf(ch)+" ");
		}
		System.out.println("\n u v w x y z");                
		System.out.println("===========");
		for(char ch = 'u';ch<='z';ch++) {
			System.out.print(str.indexOf(ch)+" ");
		}
		
	}

}
