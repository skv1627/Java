package com.day4;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a month number: ");
		int month=input.nextInt();
		boolean leapYear=false;
		System.out.print("Input a year: ");
		int year=input.nextInt();
		if(year%4==0) {
			leapYear=true;
			if(year%100==0) {
				if(year%400==0) {
					leapYear=true;
				}else {
					leapYear=false;
				}
			}if(leapYear==true) {
				if(month==2) {
					System.out.printf("February %d has 29 days",year);
				}
				
			}
			
		}else {
			
	if(month==1) {
			System.out.printf("January %d has 31 days",year);
	}else if(month==2) {
		System.out.printf("February %d has 28 days",year);
	}else if(month==3) {
		System.out.printf("March %d has 31 days",year);
	}else if(month==4) {
		System.out.printf("April %d has 30 days",year);
	}else if(month==5) {
		System.out.printf("May %d has 31 days",year);
	}else if(month==6) {
		System.out.printf("June %d has 30 days",year);
	}else if(month==7) {
		System.out.printf("July %d has 31 days",year);
	}else if(month==8) {
		System.out.printf("August %d has 31 days",year);
	}else if(month==9) {
		System.out.printf("September %d has 30 days",year);
	}else if(month==10) {
		System.out.printf("October %d has 31 days",year);
	}else if(month==11) {
		System.out.printf("November %d has 30 days",year);
	}else if(month==12) {
		System.out.printf("December %d has 31 days",year);
	}	

}
}
}