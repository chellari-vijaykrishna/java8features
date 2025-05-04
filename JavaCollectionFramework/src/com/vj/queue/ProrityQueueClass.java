package com.vj.queue;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class ProrityQueueClass {
	
	public static void main(String[] args) {
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(10);
		pq.add(20);
		pq.add(990);
		pq.add(60);
		pq.add(2320);
		pq.add(630);
		pq.add(30);
		pq.add(980);
		
		System.out.println(pq);
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		ListIterator<Object> ll = al.listIterator();
		
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		
		System.out.println(pq);
	}

}
