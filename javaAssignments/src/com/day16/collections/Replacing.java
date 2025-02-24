package com.day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Replacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swarna");
		list.add("Nandha");
		list.add("Kumar");
		list.add("Nani");
		System.out.println("Before Replacing the list "+list);
		Collections.replaceAll(list, "Nandha", "Tiger");
		System.out.println("After Replacing the list "+list);
		
	}

}
