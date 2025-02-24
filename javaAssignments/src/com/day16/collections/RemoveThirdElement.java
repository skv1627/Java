package com.day16.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveThirdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		System.out.println("After removing");
		list.remove(2);
		System.out.println(list);
	}

}
