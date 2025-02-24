package com.day16.collections;

import java.util.LinkedList;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Blue");
		list.add("Green");
		list.add("red");
		list.add("Green");
		list.add("Grey");
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="Green") {
				System.out.println("First Occurence: "+list.indexOf("Green"));
				System.out.println("Last Occurence: "+list.lastIndexOf("Green"));
				break;
			}
		}
	}

}
