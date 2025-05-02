package com.vj.lambda;


@FunctionalInterface
interface I1{
	public void add(int a,int b);
}

class C1 implements I1{

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
}


class demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi");
	}
	
}

public class AnnonomusInnerClassAndLambda {
	public static void main(String[] args) {
		
		//=================================================================================
		I1 i1 = new C1();
		i1.add(1, 5);
		
		I1 i2 = new
				I1() {
					
					@Override
					public void add(int a, int b) {
						System.out.println(a+b);
						
					}
				};
				i2.add(400, 440); //An Inn Class
		
		I1 i3 = (a,b)->System.out.println(a+b); 
		i3.add(458, 850);
		
		//===============================================================
		
		Runnable r = new demo();
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello");
				
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();
	}
	
	
	
	
	//An Inner Class is most powerful one because it can able to any no of methods unlike anonymous function
}
