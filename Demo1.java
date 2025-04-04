package com.test.vt;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread.ofPlatform().start(() -> System.out.println(Thread.currentThread()));
		
		Thread.ofVirtual().start(() -> System.out.println(Thread.currentThread()));
		
		Thread.ofVirtual().unstarted(() -> System.out.println(Thread.currentThread())).start();
		
		Thread.sleep(1000);

		
	}

}
