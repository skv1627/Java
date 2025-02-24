package com.day16.collections;

import java.util.LinkedList;

public class IterationAtSpecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(57);
		list.add(65);
		list.add(90);
		list.add(100);
		for(int i = 1;i<=3;i++) {
			System.out.println(list.get(i));
		}
	}

}
