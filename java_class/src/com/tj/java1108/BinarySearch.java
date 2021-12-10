package com.tj.java1108;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] ar = { 11, 6, 86, 10, 15, 4};
		//정렬을 하지 않은 상태에서의 이분 검색 
		System.out.println(Arrays.binarySearch(ar,10));
		//정렬을 한 후 검색
		Arrays.sort(ar);
		//ar = {4, 6, 10, 11, 15, 86} 
		System.out.println(Arrays.binarySearch(ar, 10));
		
	}

}
