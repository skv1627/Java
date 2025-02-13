package com.day8.strings;

public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name="This is Exercise 5";
		 String name1="This is Exercise 1";
		 int  isSame=name.compareTo(name1);
		if(isSame==0) {
			System.out.print(name+" is equal to "+name1);
		}else if(isSame<0) {
			System.out.print(name+" is less than "+name1);
		}else {
			System.out.print(name+" is greater than "+name1);
		}
	}

}
