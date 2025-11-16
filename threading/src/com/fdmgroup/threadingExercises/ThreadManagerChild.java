package com.fdmgroup.threadingExercises;

public class ThreadManagerChild extends ThreadManager {

	@Override
	public void createThreads(int number) {

		for (int i = 1; i <= number; i++) {

			Thread thread = new Thread(() -> {
			});
			thread.setName("thread" + i);
			threads.add(thread);

		}
	}

}
