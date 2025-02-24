package com.day16.collections;

import java.util.ArrayList;

public class Updating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ink");
		list.add("Pot");
		list.add("Pen");
		list.add("Pencil");
		System.out.println(list);
		System.out.println("After Updating");
		for (String string : list) {
			if(list.get(2)=="Pen") {
				list.remove(2);
				list.add(2, "REPLACED");
				break;
			}
		}
		System.out.println(list);
	}

}
