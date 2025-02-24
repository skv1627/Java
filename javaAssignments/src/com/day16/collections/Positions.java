package com.day16.collections;

import java.util.LinkedList;

public class Positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		for(int i=0;i<list.size();i++) {
			System.out.println("Index position is " + i+" "+"Value is "+list.get(i));
		}
	}

}
