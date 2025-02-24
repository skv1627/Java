package com.day16.collections;

import java.util.LinkedList;

public class Existence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		if(list.contains("Three")) {
			System.out.println("There's the element is present");
		}else {
			System.out.println("No element found");
		}
	}

}
