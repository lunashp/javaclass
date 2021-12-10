package com.tj.java1110;

public class TreadTerminate {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("강제로 스레드 종료");
						return;
					}
					System.out.println(i);
				}
			}
		};
		th.start();
		
		//스레드 강제종료 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//th에게 InterruptedException을 발생시킴
		th.interrupt();
	
	}

}
