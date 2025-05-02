package com.vj.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class MyComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getId() < o2.getId() ? -1 : o1.getId() > o2.getId() ? +1 : 0;
	}

}

class MyCompp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.name.compareTo(o2.name);
	}

}


public class MyComparator2 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(124, "Faja"));
		list.add(new Employee(104, "Asd"));

		//list.stream().forEach(x -> System.out.println(x));

		Comparator<Employee> co = new MyComp();

		Collections.sort(list, co);

		//System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.getId() < o2.getId() ? -1 : o1.getId() > o2.getId() ? +1 : 0);

		//System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		
		Comparator<Employee> coo = new MyCompp();
		Collections.sort(list, coo);
		System.out.println(list);

	}
}
