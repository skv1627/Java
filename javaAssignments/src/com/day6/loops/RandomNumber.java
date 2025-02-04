package com.day6.loops;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int randomNumber = random.nextInt(100000);
		System.out.println("Generating a Random Number:  "+randomNumber);
	}

}
