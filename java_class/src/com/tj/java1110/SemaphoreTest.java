package com.tj.java1110;

import java.util.concurrent.Semaphore;

class SemaphoreThread extends Thread{
	Semaphore semaphore;
	
	public SemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			//열쇠를 취득
			semaphore.acquire();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName());
		semaphore.release();
	}
}
public class SemaphoreTest {

	public static void main(String[] args) {
		//동시에 4개 까지 실행되도록 해줍니다 
		Semaphore semaphore = new Semaphore(Runtime.getRuntime().availableProcessors());
		
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		

	}

}
