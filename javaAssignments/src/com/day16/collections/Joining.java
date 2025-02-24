package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Joining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("Hi");
		list.add("there");
		list.add("How");
		list.add("are");
		list1.add("you");
		list1.add("hope");
		list1.add("you");
		list1.add("are doing good");
		System.out.println(list);
		System.out.println(list1);
		System.out.println("After Joining the lists");
		list.addAll(list1);
		System.out.println(list);
	}

}
