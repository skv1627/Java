package com.day16.collections;

import java.util.ArrayList;

public class Emptying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		System.out.println("Before emptying the list "+list);
		list.clear();
		System.out.println("After emptying the list "+list);
		
	}

}
