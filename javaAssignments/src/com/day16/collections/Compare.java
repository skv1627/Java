package com.day16.collections;

import java.util.ArrayList;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("Swarna");
		list.add("Kumar");
		list.add("Human");
		list.add("Skin");
		list1.add("Swarna");
		list1.add("Kumar");
		list1.add("Human");
		list1.add("Skin");
		boolean isBoolean = true;
		if(list.size()==list1.size()) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==list.get(i)) {
				isBoolean= true;
			}else {
				isBoolean = false;
			}
		}
		}else {
			System.out.println("Cannot compare");
		}
		if(isBoolean) {
			System.out.println("Same elements in both");
		}else {
			System.out.println("not same");
		}
	}

}
