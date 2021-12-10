package com.tj.java1110;

public class ThreadPorcessDifference {

	public static void main(String[] args) {
		//1초마다 Hello Process를 10번 출력하는 문장

		//10번 반복
		//1초 대기 - Thread.sleep 이용
		for(int i=0; i<10;i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.println("Hello Process");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for 종료

		//1초마다 Hello Thread를 10번 출력하는 모양
		int i=0;
		while(i<10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello Thread");
			i=i+1;
		}//while 종료
		
		//앞의 2개의 블럭은 프로세스 형태로 실행
		//앞쪽의 블럭이 끝나야만 뒤의 블럭이 실행됩니다. 
		
		//스레드를 생성해서 시작 - anonymous 클래스
		new Thread () {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메소드 
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드1");
				}
			}
		}.start();
		
		new Thread () {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메소드 
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드2");
				}
			}
		}.start();
		//스레드는 sleep을 만나서 쉬는 시간이 생기면 다른 스레드의 작업을
		//수행할 수 있습니다. 
	}

}
