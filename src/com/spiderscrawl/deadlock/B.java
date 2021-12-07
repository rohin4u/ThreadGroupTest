package com.spiderscrawl.deadlock;

public class B {
	
	public synchronized void d2(A a) {
		System.out.println("Thread 2 start execution of d2()'s last() method)");
		try {
			Thread.sleep(6000);
		}catch(Exception e) {}
		a.last();
		
	}
	public synchronized void last() {
		System.out.println("inside B, this is last() method ");
	}

}
