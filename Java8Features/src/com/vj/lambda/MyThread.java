package com.vj.lambda;

public class MyThread {

	/*
	 * @Override public void run() { for(int i=0;i<=10;i++) System.out.println(i); }
	 */

	public static void main(String[] args) {
		Runnable myThread = () -> {
			for (int i = 0; i <= 10; i++)
				System.out.println(i);
		};
		Thread thread = new Thread(myThread);
		thread.start();
	}
}
