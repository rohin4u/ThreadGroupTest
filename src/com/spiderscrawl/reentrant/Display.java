package com.spiderscrawl.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) 
	{
		l.lock();
		
			for(int i=0; i<5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {}
			System.out.println(name);
		}
			l.unlock();
	}

}
