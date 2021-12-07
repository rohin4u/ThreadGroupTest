package com.spiderscrawl.threadgroup;

public class Test {

	public static void main(String[] args) {
		
		ThreadGroup group = new ThreadGroup("First Thread");
		System.out.println(group.getName());
		System.out.println(group.getParent().getName());
		System.out.println(group.activeCount());
		System.out.println(group.activeGroupCount());
		System.out.println(group.getParent().isDaemon());
		
		
		System.out.println("..................................");
		Thread t1 =new Thread(group, "Thread1");
		Thread t2 = new Thread(group, "Thread2");
		t1.start();
		t2.start();
		System.out.println(group.getName());
		System.out.println(group.activeCount());
		
		ThreadGroup cg1 = new ThreadGroup(group, "ChildGroup1");
		ThreadGroup cg2 = new ThreadGroup(group, "ChildGroup2");
		System.out.println("Thread Group Count :"+group.activeGroupCount());
		
		
		Thread t3 = new Thread(cg1, "CG1-Thread1");
		Thread t4 = new Thread(cg2, "CG2-Thread2");
		
		t3.start();
		t4.start();
		System.out.println("Child Group -1 "+cg1.activeGroupCount());
		System.out.println("Child Group -2 "+cg2.activeGroupCount());
		System.out.println("Thread Name -1 "+t3.getName());
		System.out.println("Thread Name -2 "+t4.getName());
		
		
		
		
	
		

	}

}
