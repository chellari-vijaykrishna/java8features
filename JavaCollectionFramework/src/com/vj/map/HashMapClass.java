package com.vj.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {

	// HashMap ==> HashSet
	public static void main(String[] args) {

		HashMap<Object, Object> mp = new HashMap<Object, Object>();
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		mp.put(4, "Four");
		mp.put(5, "Five");
		mp.put(6, "Six");
		mp.put(7, "Seven");
		mp.put(8, "Eight");
		mp.put(9, "Nine");
		mp.put(10, "Ten");
		System.out.println(mp);

		ArrayList<Object> al = new ArrayList<Object>(mp.keySet());

		// System.out.println(al);

		ArrayList<Object> all = new ArrayList<Object>(mp.entrySet());

		// System.out.println(all);

		//HashSet<Object> hss = new HashSet<Object>(mp.entrySet());

		Iterator<Object> lll = all.iterator();

		while (lll.hasNext()) {
			// System.out.println(lll.next());

			Entry<?, ?> ee = (Entry<?, ?>) lll.next();

			System.out.println(ee.getKey() + "   " + ee.getValue());
		}

	}

}
