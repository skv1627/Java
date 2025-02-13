package com.day8.strings;

import java.util.Scanner;

public class ReplaceWithAnotherCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if(str.contains("dog")) {
			str=str.replace("dog", "fog");
		}
		System.out.println(str);
	}

}
