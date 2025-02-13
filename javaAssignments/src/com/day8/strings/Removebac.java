package com.day8.strings;

public class Removebac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("abrambabasc");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='b') {
				str.deleteCharAt(i);
				
			}
		}
		System.out.println(str.toString());
	}

}
