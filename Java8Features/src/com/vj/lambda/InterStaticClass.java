package com.vj.lambda;

interface InterStaticc {
	public static void m1() {
		System.out.println("A");
	}
	

}


public class InterStaticClass {
	public static void main(String[] args) {
		InterStaticc.m1();
	}
}
