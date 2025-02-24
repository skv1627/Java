package com.day16.collections;

import java.util.LinkedList;

public class JoiningLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list1 = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		list1.add("five");
		list1.add("six");
		list1.add("seven");
		list1.add("eight");
		System.out.println("First list: "+list);
		System.out.println("Second List: "+list1);
		list.addAll(list1);
		System.out.println("After Joining: "+list);
		
		
	}

}
