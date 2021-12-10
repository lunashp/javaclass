package com.tj.java1028;

public class For_2 {

	public static void main(String[] args) {
	//for에서 2개의 실행문을 ( ) 안에 작성 할 때는 ,로 구분
		int i, j;
		for(i=0, j=0; i<3; i=i+1, j=j+1) {
			System.out.println("Hi");
		}
		//( ) 안의 내용을 생략하면 무한 반복 되거나 한 번도 수행되지 않습니다.
		for(;;) {
			System.out.println("무한 반복");
		}
		
	}

}
