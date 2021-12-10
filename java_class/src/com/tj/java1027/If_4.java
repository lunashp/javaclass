package com.tj.java1027;

public class If_4 {

	public static void main(String[] args) {
		int score = 70;
		//점수는 0 ~ 100
		//90 ~ 100 : 수
		//80 ~ 89 : 우
		//70 ~ 79 : 미
		//60 ~ 69 : 양
		//0 ~ 59 : 가
		//라고 출력하도록 작성
		if(score >= 90 && score <= 100) {
			System.out.println("수");
		}else if  (score >= 80 && score < 90) {
			System.out.println("우");
		}else if  (score >= 70 && score < 80) {
			System.out.println("미");
		}else if  (score >= 60 && score < 70) {
			System.out.println("양");
		}else if  (score >= 0 && score <60) {
			System.out.println("가");
		}
		//else는 잘못된 상황에 대한 처리로 사용하는 것도 프로그램을
		//강건하게 만드는 방법 중 하나입니다.
		else {
			System.out.println("잘못 입력된 점수입니다");
		}

	}

}
