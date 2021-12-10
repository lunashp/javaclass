package com.tj.java1028;

public class Flag {

	public static void main(String[] args) {
		//2가지 상태 번갈아 가면서 10번 수행하기
		boolean flag = true;
		for(int i = 0; i<10; i=i+1) {
			if(flag == true) {
				System.out.println("up");
			}else {
				System.out.println("down");
			}
			flag = !flag; //true와 false를 번갈아가면서 flag에 저장
		}
		/////////////////////////////////////////////////////
		
		//인덱스 변수를 이용해서 반복문이 끝까지 수행되었는지 확인
		int j;
		for(j=0; j<5; j=j+1) {
			if(j % 4 == 1) {
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}
		if(j == 5) {
			System.out.println("반복문을 끝까지 수행");
		}else {
			System.out.println("반복문이 중간에 종료되었습니다.");
		}
		boolean f = true;
		for(j=0; j<5; j=j+1) {
			if(j % 4 == 1) {
				f = false;
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}
		if(f == true) {
			System.out.println("중간에 반복문을 멈추지 않았음");
		}else {
			System.out.println("중간에 반복문을 종료");
		}
		}
		}
