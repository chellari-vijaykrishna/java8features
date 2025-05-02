package com.vj.methodandConstructorReferences;

interface IB {
	public ConsReference meth();
	
}

interface IC {
	public ConsReference meth(int a, int b);
	
}



public class ConsReference {
	
	public ConsReference() {
		System.out.println("ConsReference.ConsReference()");
	}
	
	public ConsReference(int a, int b) {
		System.out.println("ConsReference.ConsReference()"+ a);
	}
	
	public static void main(String[] args) {
	
		IB b = ConsReference::new;
		b.meth();
		
		IC c = ConsReference::new;
		
		c.meth(1, 0);
		
	}

}
