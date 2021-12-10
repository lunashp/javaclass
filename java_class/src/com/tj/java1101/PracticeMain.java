package com.tj.java1101;

public class PracticeMain {

	public static void main(String[] args) {
		//1.Practice 클래스의 staticMethod 호출
		//static이 있으면 클래스 이름으로 호출
		Practice.staticMethod();
		//2.Practice 클래스의 disp 호출
		//static이 없으면 인스턴스를 만들어서 호출
		Practice practice = new Practice();
		practice.disp();
		//3.Practice 클래스의 sum 메서드를 이용해서 1부터 100까지의 합계 출력
		//매개변수가 정수 1개이므로 정수 1개를 대입해서 호출
		practice.sum(100);
		
		
		//4.Practice 클래스의 prime 메소드를 호출해서 2부터 1000까지의 소수 개수 출력
		int result = practice.prime();
		System.out.println(result);
	}

}
