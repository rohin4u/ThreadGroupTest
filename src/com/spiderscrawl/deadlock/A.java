package com.spiderscrawl.deadlock;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("Thread 1 start execution of d1() method");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println("Thread 1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last() {
		System.out.println("inside A, this is last  method");
	}
	

}
