package com.day6.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int num=input.nextInt();
		int temp=num;
		int b=0;
		int c=0;
		int val=0;
		int len=String.valueOf(num).length();
		for(int i=1;i<=len;i++) {
			b=temp%10;
			c=(int) Math.pow(b, len);
			val=val+c;
			temp=temp/10;
		}
		if(val==num) {
			System.out.println("Its a ArmstrongNumber");
		}else {
			System.out.println("Its not a ArmstrongNumber");
		}
	}

}
