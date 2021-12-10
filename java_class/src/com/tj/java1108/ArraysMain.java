package com.tj.java1108;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//배열 생성
		String[] colors = {"red", "orange", "yellow"};
		//데이터 확인 - 디버깅
		//배열은 바로 toString 호출하면 요소의 클래스 이름과 해시코드가 리턴 
		System.out.println(colors);
		//Arrays 클래스의 toString을 이용하면 배열 각 요소의 toString 호출
		System.out.println(Arrays.toString(colors));
		
		//colors 배열을 복사해서 새로운 배열을 생성
		//java.util.Arrays 클래스의 copyOf라는 메소드를 이용할 수 있음
		
		String [] copy = Arrays.copyOf(colors, colors.length);
		System.out.println(Arrays.toString(copy));
		
		copy[0] = "blue";
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(colors));
		
		//colors의 데이터 정렬 - 정렬 가능
		//colors는 String 클래스의 배열인데
		//String 클래스는 Comparable 인터페이스가 구현되어 있음
		Arrays.sort(colors);
		System.out.println(Arrays.toString(colors));

	}

}
