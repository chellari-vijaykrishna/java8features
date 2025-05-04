package com.vj.queue;

import java.util.LinkedList;

public class LinkedListQueue {
	
	public static void main(String[] args) {
		System.out.println("LinkedListQueue");
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.offer(10);
		ll.offer(12);
		System.out.println(ll);
		
		System.out.println(ll.remove());
		//same as LinkedList as in the List
	}

}
