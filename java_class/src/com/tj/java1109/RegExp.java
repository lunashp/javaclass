package com.tj.java1109;

public class RegExp {

	public static void main(String[] args) {
		//영문 소문자로 시작하는 3글자를 확인 
		
		//확인하기 위한 문자열
		String [] ar = {"add", "ant", "1on", "Be"};

		//조회할 패턴 생성
		//소문자로 시작하는 3글자
		//a-z 소문자
		//A-Z 대문자
		//가-힣 한글
		//0-9 숫자
		String pattern = "^[a-z]..";
		
		for(String str : ar) {
			System.out.println(str.matches(pattern));
		}
	}

}
