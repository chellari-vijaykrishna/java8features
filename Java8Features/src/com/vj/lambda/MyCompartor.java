package com.vj.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*int compare(Object obj1, Object obj2)
Behavior of compare(obj1, obj2):
	Returns negative (< 0) → if obj1 should come before obj2
	Returns positive (> 0) → if obj1 should come after obj2
	Returns 0 → if obj1 and obj2 are equal (in ordering)*/

class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return i1<i2?-1
        		:i1>i2?+1:0;
	}
	
}

public class MyCompartor {
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(80);
        list.add(40);
        list.add(20);
        list.add(90);
        list.add(70);
        list.stream().forEach(li->System.out.println(li));
        Collections.sort(list);
        //System.out.println(list);
        
        
        Collections.sort(list, (i1,i2)->i1<i2?-1:i1>i2?+1:0);
        System.out.println(list);
        
        Comparator<Integer> c = (i1,i2)->i1<i2?-1:i1>i2?+1:0;
        
        Collections.sort(list, c);
        System.out.println(list);
	}
   
}
