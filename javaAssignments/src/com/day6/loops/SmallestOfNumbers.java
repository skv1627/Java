package com.day6.loops;

import java.util.Scanner;

public class SmallestOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int smallest=0;
		int[] arr = new int[3];
		System.out.print("Enter the first number: ");
		arr[0] = input.nextInt();
		System.out.print("Enter the second number: ");
		arr[1] = input.nextInt();
		System.out.print("Enter the third number: ");
		arr[2] = input.nextInt();
		for(int i=1;i<3;i++) {
			smallest=(arr[i]<=arr[0])?arr[i]:smallest;
				
			}
		System.out.println("The smallest number is: "+ smallest);
		}
		
	}

