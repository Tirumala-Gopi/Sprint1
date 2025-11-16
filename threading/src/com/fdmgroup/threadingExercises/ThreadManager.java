package com.fdmgroup.threadingExercises;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {

	protected List<Thread> threads;

	public List<Thread> getThreads() {
		return threads;
	}

	public void setThreads(List<Thread> threads) {
		this.threads = threads;
	}

	public ThreadManager() {
		super();
		this.threads = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "ThreadManager [threads=" + threads + "]";
	}

	public void createThreads(int number) {

		MyRunnable myRunnable = new MyRunnable();

		for (int i = 1; i <= number; i++) {

			Thread thread = new Thread(myRunnable);
			thread.setName("thread" + i);
			threads.add(thread);

		}

	}

	public void runThreads() {

		for (Thread thread : threads) {
			thread.start();
		}

	}

}
