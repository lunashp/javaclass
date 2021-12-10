package com.tj.java1029;

public class Array_1 {

	public static void main(String[] args) {
		//1. 처음부터 데이터를 가지고 생성하기 
		//점수(실수) 3개를 배열로 저장하기
		double [] scores = {90.5, 80, 86};
		//이름 3개를 배열로 저장하기
		String [] names = {"Luna", "Amy", "Jessica"};
		
		//2. 데이터 접급
		//scores의 데이터 개수를 확인
		System.out.println("scores의 개수:" + scores.length);
		
		//세부 데이터 접근
		//scores의 2번째 데이터를 확인
		System.out.println("scores[1]:" + scores[1]);
		
		//인덱스 오류 - java.lang.ArrayIndexOutOfBoundsException
		//System.out.println("scores[3]:" + scores[3]);
		
		//이름이 없어서 발생하는 오류
		//System.out.println(kors.length);
		
		//NullPointerExceptin - 세부 데이터가 없어서 발생하는 예외
		//int [] kors= null;
		//System.out.println(kors.length);

		//3. 전체 데이터 접근
		//1) 인덱스를 상수 형태로 직접 작성 - 데이터가 많아지면 사용하는 것이 불가능
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//2) 일반적인 반복문을 이용한 방법 - 상수를 이용하는 방법 
		for(int i = 0; i<3; i=i+1) {
			System.out.println(names[i]);
		}
	/*
	int i = 0;
	while(i<3) {
		System.out.println(names[i]);
	i=i+1;
	}
		*/
		
		//3) 일반적인 반복문을 이용한 방법 - 반복횟수를 데이터 개수로 이용하는 방법
		//이렇게 만들면 데이터의 개수가 변경되어도 그대로 사용 가능하기 때문에
		//앞의 방법보다 좋다고 합니다.
		for(int i=0; i<names.length; i=i+1) {
			System.out.println(names[i]);
		}
			/*
			int i = 0;
			while(i<names.length) {
				System.out.println(names[i]);
				i=i+1;
			}
			*/
			
			//4) 일반적인 반복문을 이용한 방법 - 데이터 개수를 변수에 저장해서 이용하는 방법
			//name.length에 비해서 메모리 접근 횟수가 줄어서 속도가 빠릅니다. 
			int len = names.length;
			for(int i=0; i<len; i=i+1) {
				System.out.println(names[i]);
			}
			//5) 빠른 열거를 이용하는 방법
			//빠른 열거는 이전에 접근했던 위치에서 접근
			//names의 데이터를 순서대로 name에 대입해서 사용
			for(String name : names) {
				System.out.println(name);
			}
					
		}
	}

	

