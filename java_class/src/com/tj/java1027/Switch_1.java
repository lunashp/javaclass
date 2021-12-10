package com.tj.java1027;

public class Switch_1 {

	public static void main(String[] args) {
	
		int menu =0;
		
		//final을 앞에 붙이면 읽기 전용 변수가 됩니다
		//읽기전용은 변수 이름을 모두 대문자로 작성하는 것이 관례
		final int KOREA = 0;
		final int CHINA = 1;
		final int SNACK = 2;
		final int JAPAN = 3;
		//menu가 0이면 한식
		//1이면 중식
		//2이면 분식
		//3이면 일식
		//나머지는 아무거나
		switch(menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case SNACK:
			System.out.println("분식");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		default:
			System.out.println("아무거나");
			break;
			
			
		}
	}

}
