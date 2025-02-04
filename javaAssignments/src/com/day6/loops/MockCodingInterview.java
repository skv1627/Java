package com.day6.loops;

import java.util.Scanner;

public class MockCodingInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int temp=num;
		for(int i=temp-1;i>=1;i--) {
			num=num*i;
		}
		System.out.println(num);
		
	}

}
