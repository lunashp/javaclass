package com.tj.java1027;

public class If_1 {

	public static void main(String[] args) {
		int score = 89;
		
		//score가 60이상이면 합격이라고 출력
		if(score >= 60) {
			System.out.println("합격");
			
		}
		int su = 88;
		//su가 짝수라면 짝수라고 출력하기
		//짝수는 2로 나눈 나머지가 0인 숫자
		if(su % 2 == 0) {
			System.out.println("짝수");
		}
	}

}
