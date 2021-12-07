package com.spiderscrawl.deadlock;

public class DeadLock1 extends Thread{
	
	A a = new A();
	B b = new B();
	
	public void m1() {
		a.d1(b);
	}
	
	@Override
	public void run() {
		
		b.d2(a);
	}

}
