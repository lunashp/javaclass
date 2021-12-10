package com.tj.java1027;

public class Etc {

	public static void main(String[] args) {
		//실수를 저장하는 변수 2개 생성
		double d1 = 20.7;
		double d2 = 19.3;
		//d1 > d2 이면 d1이 남고 d1 > d2가 아니면 d2가 남습니다.
		double max = d1 > d2 ? d1 : d2;
		System.out.println("큰 수:" + max);
		double min = d1 < d2 ? d1 : d2;
		System.out.println("작은 수:" + min);
		

		int x = 30;
		x -=20; //x = x - 20
		System.out.println("x:" + x);
		
		
	}

}
