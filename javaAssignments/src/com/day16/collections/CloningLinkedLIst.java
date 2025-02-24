package com.day16.collections;

import java.util.LinkedList;

public class CloningLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list1 = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		list.add("five");
		System.out.println("Before Cloning: "+ list1);
	    list1 = (LinkedList<String>) list.clone();
		System.out.println("After Cloning "+ list1);
		
	}

}
