package com.day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the year: ");
		int year=input.nextInt();
		boolean leapYear=false;
		if(year%4==0) {
			leapYear=true;
			if(year%100==0) {
				if(year%400==0) {
					leapYear=true;
				}else {
					leapYear=false;
				}
			}
		}
		if(leapYear==false) {
			System.out.printf("%d is Not a leap year",year);
		}else {
			System.out.printf("%d Is a leap year",year);
		}
	}

}
