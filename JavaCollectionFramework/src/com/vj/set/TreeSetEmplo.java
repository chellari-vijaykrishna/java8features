package com.vj.set;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetEmplo {
	
	
	
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(new Employee(1, "Vijay", "vjau"));
		ts.add(new Employee(2, "Vijay", "vjau"));
		ts.add(new Employee(3, "Vijay", "vjau"));
		ts.add(new Employee(4, "Vijay", "vjau"));
		
		
	List<Employee> e  =  ts.stream()
				.sorted(
						(j1,j2)->j1.getEmpId()>j2.getEmpId()?1:j1.getEmpId()<j2.getEmpId()?-1:0)
				.collect(Collectors.toList());
	
	System.out.println(e);
	}

	
	
}
