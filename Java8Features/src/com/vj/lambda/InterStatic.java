package com.vj.lambda;

public interface InterStatic {
	public static void m1() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		InterStatic.m1();
	}
}
