package com.day16.collections;

import java.util.LinkedList;

public class Retrieving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		System.out.println(list.getFirst());
		System.out.println(list);
	}

}
