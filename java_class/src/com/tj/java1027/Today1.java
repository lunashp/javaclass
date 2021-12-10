package com.tj.java1027;

public class Today1 {

	public static void main(String[] args) {
	//20과 17을 저장하는 변수를 생성
		int data1 = 20; //00000000 00000000 00000000 00010100
		int data2 = 17; //00000000 00000000 00000000 00010001
		
		System.out.println("data1 & data2 :" + (data1 & data2));
		//00000000 00000000 00000000 00010000 => 16
		System.out.println("data1 | data2 :" + (data1 | data2));
		//00000000 00000000 00000000 00010101 => 21
		System.out.println("data1 ^ data2 :" + (data1 ^ data2));
		//00000000 00000000 00000000 00000101 => 5
		
		//20 00000000 00000000 00000000 00010100
		//15 00000000 00000000 00000000 00001111 
		
		int data3 = 20;
		int data4 = 15;
		
		System.out.println("data3 & data4 :" + (data3 & data4));
		//00000000 00000000 00000000 00000100 => 4
		System.out.println("data3 | data4 :" + (data3 | data4));
		//00000000 00000000 00000000 00011111 => 31
		System.out.println("data3 ^ data4 :" + (data3 ^ data4));
		//00000000 00000000 00000000 00011011 => 27
		
	}

}
