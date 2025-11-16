package com.fdmgroup.threadingExercises;

public class Runner {

	public static void main(String[] args) {

//		ThreadManager threadmanager = new ThreadManager();
//		threadmanager.createThreads(3);
//		System.out.println(threadmanager.getThreads());
//		threadmanager.runThreads();
		
		ThreadManagerChild tm=new ThreadManagerChild();
		tm.createThreads(10);
		System.out.println(tm.getThreads());
		tm.runThreads();
		
		
		
		

	}

}
