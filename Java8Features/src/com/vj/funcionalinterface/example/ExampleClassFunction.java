package com.vj.funcionalinterface.example;

import java.util.function.Function;
import java.util.function.Predicate;

/*| `Function<T, R>` | `T → R` | Takes an input of type `T` and returns a result of type `R`. |*/

class Employee {
	int id;
	String name;
	int marks;

	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}

	public Employee(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

}

public class ExampleClassFunction {
	public static void main(String[] args) {

		Function<Integer, Integer> f = s -> s * s;
		System.out.println(f.apply(10));

		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("ANSWER"));

		Employee[] e = { new Employee(1, "Vijay", 80), new Employee(2, "Krishna", 60), new Employee(3, "Ajay", 70),
				new Employee(4, "Ram", 90) };

		Function<Employee, String> f2 = s -> {

			int marks = s.marks;
			String grade = null;
			if (marks >= 90)
				grade = "A";
			else if (marks >= 80)
				grade = "B";
			else if (marks >= 60)
				grade = "C";
			return grade;

		};
		
		for (Employee ee : e) {
			Predicate<Employee> em = eee->eee.id==2;
			if(em.test(ee))
			    System.out.println(f2.apply(ee));
		}
		
		
		Function<Integer, Integer> fun = s->s*s*s*2;
		
		Function<Integer, Integer> fun1 = s->s*1;
		
		System.out.println(fun.andThen(fun1).apply(2));
		System.out.println(fun.compose(fun1).apply(2));
	}
}
