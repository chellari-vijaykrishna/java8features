package com.vj.methodandConstructorReferences;


interface IA {
	public void meth();
}


public class MethodReferences {
	
	public void add() {
		System.out.println("MethodReferences.add()");
	}
	
	public static void addd() {
		System.out.println("MethodReferences.addd()");
	}

	public static void main(String[] args) {
		MethodReferences methodReferences = new MethodReferences();
		IA s = methodReferences::add;
		s.meth();
		
		IA ss = MethodReferences::addd;
		ss.meth();

	}

}
