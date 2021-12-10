package com.tj.java1028;

public class Toggle_1 {

	public static void main(String[] args) {
		//3초마다 2가지 동작을 번갈아 가면서 10번 하기
		for(int i = 0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			if(i % 2 == 0) {
				System.out.println("On");
			}else {
				System.out.println("Off");
			}
			
			for( i = 0; i<10; i=i+1) {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				//0 1 2 3 4 0 1 2 3 4 0
				if(i % 5 == 0) {
					System.out.println("오미크론");
				}else if (i % 5 == 1){
					System.out.println("라투");
				}else if (i % 5 == 2){
					System.out.println("다크스펙터");
				}else if (i % 5 == 3){
					System.out.println("오미크론");
				}else if (i % 5 == 4){
					System.out.println("다크스펙터");
		}
			}
		}
	}
}


