package com.vj.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.stream.Collectors;
import java.util.TreeSet;

public class TreeSetClass {
	
	public static void main(String[] args) {
		TreeSet<Object> hs = new TreeSet<Object>();
		hs.add(12);
		//hs.add("Set");
		//hs.add(null);
		hs.add(12);
		hs.add(13);
		hs.add(67);
		hs.add(89);
		//dups are not allowed
		System.out.println(hs);
		
		//System.out.println(hs.stream().sorted().collect(Collectors.toList()));
		
		Iterator<Object> ob = hs.iterator();
		
		while(ob.hasNext()) {
			System.out.print(ob.next()+" ");
		}
		
		ArrayList<Object> al = new ArrayList<Object>(hs);
		
		ListIterator<Object> ltt = al.listIterator();
		
		while(ltt.hasNext()) {
			System.out.println(ltt.next());
		}
		
		while(ltt.hasPrevious()) {
			System.out.println(ltt.previous());
		}
		
		hs.forEach(x->{
			x=x+"hh";
			System.out.println(x);
		});
		System.out.println();
		
		
		
		
	}
	

}
