package com.tj.java1028;

public class Etc_2 {

	public static void main(String[] args) {
		//제어문 안의 실행문장이 1개일 때는 { } 생략 가능
		//비추천
		for(int i = 0; i<3; i=i+1)
			System.out.println("Hello World");
	
		for(int i=0; i<3; i=i+1) {
			System.out.println("자동 들여쓰기 단축키는 Control + I");
		}
		for(int i=0; i<3; i=i+1); {
			System.out.println("제어문의 ( )뒤에 ; 붙어서 없는 것과 동일");
			System.out.println("한 번만 수행");
		}
		//이런식의 코드는 에러
		/*
		for(;;) {}
		System.out.println("Dead Code");
		*/
	}
}

