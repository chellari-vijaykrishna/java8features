package com.vj.streamsapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Stream API Method Cheat Sheet

Method	 				Description													Type

stream()				Converts a collection to a stream.							Entry point
filter(Predicate)		Filters elements based on a condition.						Intermediate
map(Function)			Transforms each element.									Intermediate
collect(Collector)		Converts the stream into a collection (List, Set, etc.).	Terminal
count()					Returns the number of elements.								Terminal
sorted()				Sorts the elements in natural order.						Intermediate
sorted(Comparator)		Sorts using a custom comparator.							Intermediate
min(Comparator)			Finds the minimum element.									Terminal
max(Comparator)			Finds the maximum element.									Terminal
forEach(Consumer)		Performs an action on each element.							Terminal*/

public class ClassA {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(30);
		ls.add(80);
		ls.add(40);
		ls.add(100);
		ls.add(50);
		ls.add(90);
		System.out.println(ls);

		/*
		 * List<Integer> list =ls.stream().filter(c->c>30).collect(Collectors.toList());
		 * System.out.println(list);
		 */

		/*
		 * Long list = ls.stream().filter(c -> c > 30).count();
		 * System.out.println(list);
		 * 
		 * Long lisst = ls.stream().map(c -> c > 30).count(); System.out.println(lisst);
		 */

		/*
		 * ls.forEach(x -> { x = x + 10; System.out.println(x); });
		 */

		/*
		 * List<Integer> lis = ls.stream().map(x->x+10).collect(Collectors.toList());
		 * System.out.println(lis);
		 */

		/* ls.forEach(System.out::println); */

		/*
		 * List<Integer> lst = ls.stream().sorted().collect(Collectors.toList());
		 * 
		 * System.out.println(lst);
		 */

		/*
		 * List<Integer> lst1 = ls.stream().sorted((j1, j2) ->
		 * j1.compareTo(j2)).collect(Collectors.toList());
		 * 
		 * System.out.println(lst1);
		 * 
		 * List<Integer> lst11 = ls.stream().sorted((j1, j2) ->
		 * j2.compareTo(j1)).collect(Collectors.toList());
		 * 
		 * System.out.println(lst11);
		 * 
		 * 
		 */

		// (j1,j2)->j1>j2?1:j1<j2?-1:0;

		// List<Integer> lst1 = ls.stream().sorted((j1, j2) ->
		// j1.compareTo(j2)).collect(Collectors.toList());

		/*
		 * List<Integer> lst1 =
		 * ls.stream().sorted((j1,j2)->j1>j2?1:j1<j2?-1:0).collect(Collectors.toList());
		 * 
		 * System.out.println(lst1);
		 */

		/*
		 * List<Integer> lst1 =
		 * ls.stream().sorted((j1,j2)->j1<j2?1:j1>j2?-1:0).collect(Collectors.toList());
		 * 
		 * System.out.println(lst1);
		 */

		/*
		 * Integer lst1 = ls.stream().min((j1,j2)->j1>j2?1:j1<j2?-1:0).get();
		 * System.out.println(lst1);
		 * 
		 * 
		 * Integer lst11 = ls.stream().max((j1,j2)->j1>j2?1:j1<j2?-1:0).get();
		 * System.out.println(lst11);
		 */

	}

}
