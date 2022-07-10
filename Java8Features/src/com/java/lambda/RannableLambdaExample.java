package com.java.lambda;

/*Runnable is an functional interface*/
class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Started ...");		
	}
	
}

public class RannableLambdaExample {

	public static void main(String[] args) {
		
		/* Traditional Way */
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		/* Using Lambda Expression */
		Thread threadLambda = new Thread(() -> System.out.println("threadLambda started ..."));
		threadLambda.start();
	}
}
