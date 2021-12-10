package com.tj.java1028;

public class Consol_2 {

	public static void main(String[] args) {
		//랜덤 인스턴스 생성
		java.util.Random r = new java.util.Random();
		//1부터 45까지의 숫자를 랜덤하게 6번 가져오기
		for(int i=0; i<6; i=i+1) {
			int x = r.nextInt(45);
			System.out.println(x+1);
		}

	}

}
