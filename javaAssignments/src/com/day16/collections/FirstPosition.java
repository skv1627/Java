package com.day16.collections;

import java.util.ArrayList;

public class FirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("earth");
		list.add("mars");
		list.add("Uranus");
		list.add("Venus");
		System.out.println(list);
		System.out.println("After Insertion");
		list.add(0, "Pluto");
		System.out.println(list);
	}

}
