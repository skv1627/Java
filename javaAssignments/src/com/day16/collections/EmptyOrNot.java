package com.day16.collections;

import java.util.ArrayList;

public class EmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println(list);
		list.clear();
		if(list.size()==0) {
			System.out.println("EMpty lisyt");
		}else {
			System.out.println("not an empty list");
		}
	}

}
