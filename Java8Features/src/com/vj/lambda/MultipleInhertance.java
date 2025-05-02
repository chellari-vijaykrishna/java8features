package com.vj.lambda;


interface B{
	default void A(){
		System.out.println("A");
	}
}


interface C{
default void A(){
	System.out.println("B");
	}
}


public class MultipleInhertance implements B,C{

	public void A() {
		B.super.A();
		System.out.println("B inte");
	}
	public void Z() {
		C.super.A();
		System.out.println("C inter");
	}
	
	public static void main(String[] args) {
		//System.out.println("Started..");
		MultipleInhertance b = new MultipleInhertance();
		b.A();
		b.Z();
	}
}
