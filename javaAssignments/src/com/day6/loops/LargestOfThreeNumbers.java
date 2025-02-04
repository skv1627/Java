package com.day6.loops;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];
		int largest=0;
		System.out.print("Enter the first number: ");
		arr[0]=input.nextInt();
		System.out.print("Enter the second number: ");
		arr[1]=input.nextInt();
		System.out.print("Enter the third number: ");
		arr[2]=input.nextInt();
		for(int i=0;i<3;i++) {
			if(arr[i]>=arr[0]) {
				largest=arr[i];
			}
		}
		System.out.println("The largest number is: "+largest);
		
		}
	}
