package com.spiderscrawl.trylock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	
	MyThread(String name){
		super(name);
	}
	
	public void run() {
		
		if(l.tryLock())
		{
		System.out.println("Thread : "+Thread.currentThread().getName()+" is performing");
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		l.unlock();
		}else {
			System.out.println("Thread :"+Thread.currentThread().getName()
					+" didn't get the lock and performing this area");
		}
	}
	}
