package com.vj.lambda;




interface InterA{
	
	public void A();
	public void B();
	public void C();
	
	default String methodA() {
		System.out.println("default");
		return "De";
	}
	
	default void methodB() {
		System.out.println("default");;
	}
	
	
	
}




public class DefaultAndStaticMethodsInInterface implements InterA{

	@Override
	public void A() {
		
		
	}

	@Override
	public void B() {
	
		
	}

	@Override
	public void C() {
		
	}
	
	public static void main(String[] args) {
		InterA de = new DefaultAndStaticMethodsInInterface();
		System.out.println(de.methodA());
		de.methodB();
	}
	
	
	
	
	

}

