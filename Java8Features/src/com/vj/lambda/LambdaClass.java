package com.vj.lambda;

/*class ClassA implements Interf{
	@Override
	public void add(int a, int b) {
	   System.out.println(a+b);
	}
}*/

public class LambdaClass {	
	
	public static void main(String[] args) {
		/* Interf interf = new ClassA(); */
		
		 Interf interf = (a,b) -> System.out.println(a+b); //Lambda Function
		 interf.add(12, 12);
		 
		 
		 MyFunction myFunction = ()-> System.out.println("Functional Interface");
		 myFunction.run();
	}
     
}
