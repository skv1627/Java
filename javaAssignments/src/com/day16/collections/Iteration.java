package com.day16.collections;

import java.util.ArrayList;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("Swarna");
		name.add("Kumar");
		name.add("Vusa");
		name.add("sandeep");
		name.add("likki");
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
	}

}
