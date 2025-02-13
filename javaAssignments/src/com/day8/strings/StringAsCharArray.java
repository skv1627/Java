package com.day8.strings;

public class StringAsCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swarna";
		char[] nameChar = str.toCharArray();
		for(int i=0;i<str.length();i++) {
		System.out.print(nameChar[i]+",");
		}
	}

}
