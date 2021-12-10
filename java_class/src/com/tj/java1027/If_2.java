package com.tj.java1027;

public class If_2 {

	public static void main(String[] args) {
		int score = 89;
		
		//score가 60이상이면 합격 그렇지 않으면 불합격 이라고 출력
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		if(score <60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		int su = 77;
		//su가 짝수이면 짝수 그렇지 않으면 홀수라고 출력
		if(su % 2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
			
		}
		
		int year = 2021;
		//year가 윤년이라면 윤년이라고 출력하고 그렇지 않으면 윤년이 아니라고 출력
				//윤년은 2가지 조건 중 하나만 만족하면 됩니다.
				//4의 배수이고 400의 배수는 아닌 경우
				//400의 배수인 경우
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					System.out.println("윤년");
				}else {
					System.out.println("윤년 아님");
		}
			
	}
	}


