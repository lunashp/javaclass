package com.tj.java1027;

public class While_1 {

	public static void main(String[] args) {
		//Hello Java를 3번 출력
		//속도는 이 방법이 더 빠릅니다.
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
			
		//반복문을 이용한 Hello Java 3번 출력
		int i=0;
		while(i < 3) {
			System.out.println("Hello Java");
			i= i + 1; //i++;로 작성해도 됨
			//책들은 Java만 하므로 ++를 사용하지만
			//우리는 여러가지 언어를 하므로 공통된 방법을 사용하기 위해서
			//i=i+1을 사용
		}
		}

	}

