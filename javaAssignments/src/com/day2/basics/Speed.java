package com.day2.basics;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input distance in meters: ");
		float distance=input.nextFloat();
		System.out.print("Input hour: ");
		float hour=input.nextFloat();
		System.out.print("Input minutes: ");
		float minutes=input.nextFloat();
		System.out.print("Input seconds: ");
		float seconds=input.nextFloat();
		float meterPerSecond=distance/(hour*3600+minutes*60+seconds);
		float kiloMeterPerHour=(distance/1000)/(hour+(minutes/60)+(seconds/3600));
		float milesPerHour=(distance/1609)/(hour+(minutes/60)+(seconds/3600));
		System.out.println("Your speed in meters/second is "+meterPerSecond);
		System.out.println("Your speed in km/h is "+kiloMeterPerHour);
		System.out.println("Your speed in miles/hour is "+milesPerHour);
	}

}
