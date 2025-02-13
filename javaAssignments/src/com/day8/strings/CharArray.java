package com.day8.strings;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] character= {'T','h','e',' ','b','o','o','k',' ','c','o','n','t','a','i','n','s',' ','2','3','4',' ','p','a','g','e','s'};
		String ref = new String(character);
		String str = String.valueOf(character);
		System.out.println(ref);
		System.out.println(str);
	}

}
