package com.day8.strings;

import java.util.Scanner;

public class SplitEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
		System.out.print("Enter the split size: ");
		int splitSize = input.nextInt();
		if(str.length()%splitSize!=0) {
			System.out.println("Cannot Divide Evenly");
		}else {
			for(int i=0;i<str.length();i+=splitSize) {
				System.out.println(str.substring(i, i+splitSize));
			}
		}
		
	}

}
