package com.vj.funcionalinterface.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/*`Predicate<T>` | `T → boolean` | Tests a condition on an input and returns `true` or `false`. 
 * Commonly used for filtering. |
*/
public class ExampleClassPredicate {

	public void mehod(Integer a) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(a));
	}
	
	public void method(List<Integer> ls) {
		ls.forEach(l->{
			//System.out.print(l+" ");
			Predicate<Integer> p = i -> i <= 30;
			System.out.println(p.test(l));
		});
		
		//System.out.println(p.test(a));
	}

	public static void main(String[] args) {
		ExampleClassPredicate c = new ExampleClassPredicate();
		c.mehod(1);
		
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(30);
		ls.add(50);
		ls.add(60);
		ls.add(630);
		c.method(ls);

	}
}
