package com.tj.java1108;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {

	public static void main(String[] args) {
		String [] music = {"muse", "californialove", "be", "zero"};
		//문자열 내림차순 - Arrays.sort 메소드 이용 
		//Comparator를 구현한 클래스 만들기 
		class Temp implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
				//return o1.compareTo(o2) *-1;
				
			}
			
		}
		Arrays.sort(music, new Temp());
		System.out.println(Arrays.toString(music));
		
		
		Integer [] num = {10, 15, 4, 6, 21, 11};
		//정수 내림차순 정렬 - Anonymous 이용
		Arrays.sort(num, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2- o1;
			}
			
		});
		
		System.out.println(Arrays.toString(num));

	}

}
