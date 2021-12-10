package com.tj.java1029;

public class Fibonacci {

	public static void main(String[] args) {
		int fibo=1; // 12번째 피보나치 수열의 값을 저장할 변수
		
		//이전 2개 항의 값을 저장할 변수 - 초기값
		int n_1 = 1;
		int n_2 = 1;
		
		for(int n=3; n<=12; n=n+1) {
			//이전 2개 항의 합을 가지고 세번째 항의 값을 결정
			fibo = n_1 + n_2;
			//바로 이전 항의 값을 그 이전 항에 대입
			n_2 = n_1;
			//계산된 결과를 이전항에 대입
			n_1 = fibo;
		}	
		
		
			System.out.println(fibo);
	}

}
