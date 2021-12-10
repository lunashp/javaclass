package com.tj.java1028;

public class For_1 {

	public static void main(String[] args) {
		//Hello World를 3번 출력
		int i = 0;
		while(i<3) {
			System.out.println("Hello World");
			i = i + 1;
		}
		System.out.println("===========");
		//for를 이용해서 동일한 내용을 작성
		for(int j=0; j<3; j=j+1) {
			System.out.println("Hello World");
		}
		//image1.png, image2.png, image3.png를 for를 이용해서 출력
		for(int a=0; a<3; a=a+1) {
			System.out.println("image" + (a+1) + ".png");
		}
		//제어문 안에서 만든 변수는 제어문 바깥에서 사용할 수 없음
		//System.out.println(a);
		
		//for에서 첫번째 문장에서는 변수를 반드시 생성할 필요가 없음
		for( i=0; i<3; i=i+1) {
			System.out.println("image" + (i+1) + ".png");
		}
	}
}

