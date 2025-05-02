package com.vj.funcionalinterface.example;

import java.util.function.Supplier;

public class ExampleClassSupplier {
	public static void main(String[] args) {
           //generate Automated Otp by Using Supplier Interface
		
		Supplier<String> supplier = ()->{
			String otp = "";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		for(int i=0;i<100;i++)
		    System.out.println(supplier.get());
		
	}
}


/*
 * Predicate can take any input but given boolean   test()
 * Function can take any input given any output    apply()
 * Consumer can take any input but given void      accept()
 * Supplier can not take input but given any output  get()
 */



