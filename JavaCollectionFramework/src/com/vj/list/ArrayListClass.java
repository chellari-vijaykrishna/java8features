package com.vj.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();

		list.add(43);
		list.add(12);
		list.add("List");
		list.add("Hello");
		list.add(43);
		list.add(null);
		list.add(29);
		list.add(43);
		list.add(34);

		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.print(list.get(i) + " ");
		 * } System.out.println(); for (Object ls : list) { System.out.print(ls + " ");
		 * }
		 * 
		 * list.forEach(System.out::println);
		 * 
		 * List<Object> objects = list.stream().filter(x -> x !=
		 * null).collect(Collectors.toList());
		 * 
		 * System.out.println(objects);
		 * 
		 * List<Object> llst = List.of(1, 2, 10);
		 * 
		 * System.out.println(llst);
		 */
		
		
		Iterator<Object> lt = list.iterator();
		
		System.out.println(lt.hasNext());
		
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("++++++Methods Of Collection");
		
		System.out.println(list.getFirst());
		
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		System.out.println(list.remove(4));
		
		System.out.println(list);
		
		System.out.println(list.remove(null));
		
		System.out.println(list);

	}

	

}
