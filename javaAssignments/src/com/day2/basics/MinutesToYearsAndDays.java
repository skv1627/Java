package com.day2.basics;

import java.util.Scanner;

public class MinutesToYearsAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		float min=input.nextInt();
		float years=(min/525600);
		int y=(int)years;
		float days=(years%y)*365;
		int d=(int)days;
		int m=(int)min;
		years=(int)years;
		days=(int)days;
		System.out.printf("%d minutes is approximately %d years and %d days",m,y,d);
	}

}
