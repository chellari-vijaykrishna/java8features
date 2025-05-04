package com.vj.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) {
		Vector<Object> vList = new Vector<Object>();
		
		vList.add(43);
		vList.add(12);
		vList.add("vList");
		vList.add("Hello");
		vList.add(43);
		vList.add(null);
		vList.add(29);
		vList.add(43);
		vList.add(34);
		
		System.out.println(vList);
		
		//System.out.println(vList.stream().map(x->x+"A").collect(Collectors.toList()));
		
		/* Enumeration */
		
		
		System.out.println();
		Enumeration<Object> e = vList.elements();
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		
		System.out.println();
		
		for(Object ee : vList) {
			System.out.print(ee+" ");
		}
		
		System.out.println();
		
		Iterator<Object> ie = vList.iterator();
		
		
		
		while(ie.hasNext()) {
			System.out.print(ie.next()+" ");
		}
		
		
		
		
		System.out.println("========Methods of Vector Collection");
		
		System.out.println(vList.size());
		
		System.out.println(vList.isEmpty());
		
		
	}

}
