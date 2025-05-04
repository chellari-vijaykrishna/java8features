package com.vj.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add(10);
		ll.add("LinkedList");
		ll.add(null);
		ll.add(40);
		ll.add(1);
		ll.add(0);
		ll.add(610);
		ll.add(16);
		ll.add(14);
		
		
		System.out.println(ll);
		
	ListIterator<Object> llim =ll.listIterator();
	
	while(llim.hasNext()) {
		System.out.print(llim.next()+" ");
	}
	System.out.println();
	while(llim.hasPrevious()) {
		System.out.print(llim.previous()+" ");
	}
	
		
	}
	
	
}
