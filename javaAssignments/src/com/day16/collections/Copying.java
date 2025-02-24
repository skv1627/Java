package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Copying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("1");
		list.add("one");
		list.add("2");
		list.add("Two");
		list.add("3");
		list.add("Three");
		list1.addAll(list);
		System.out.println(list1);
		
	}

}
