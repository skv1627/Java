package com.day16.collections;

import java.util.LinkedList;

public class AppendingAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Python");
		list.add("Java");
		list.add("C#");
		list.add("C++");
		System.out.println("Before Appending "+list);
		list.add("New Programming Language Go");
		System.out.println("after Appnding "+list);
	}

}
