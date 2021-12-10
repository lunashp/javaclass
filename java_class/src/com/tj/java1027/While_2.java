package com.tj.java1027;

public class While_2 {

	public static void main(String[] args) {
		//image1, image2, image3를 순서대로 출력
		
		int i=1; 
		while(i<4) {
			System.out.println("image" + i);
			i = i + 1;
			//i=i+1을 사용
		}
		//image4, image3, image2, image1
		
		//image1, image3, image5, image7
		int a=1;
		while(a<8) {
			System.out.println("image" + a);
			a = a + 2;
		
			
		}
	}

}
