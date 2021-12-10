package com.tj.java1108;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		//ArrayList와 LinkedList 속도 비교 
		
		//ArrayList와 LinkedList 생성
		ArrayList <Integer>al = new ArrayList<>();
		LinkedList <Integer>ll = new LinkedList<>();

		//샘플 데이터를 2개씩 삽입 
		al.add(1);
		al.add(3);
		
		ll.add(1);
		ll.add(3);
		
		long start = System.nanoTime();
		//100000개 데이터를 2번째에 삽입 - ArraysList
		for(int i=0; i<100000; i=i+1) {
			al.add(1, 2);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList 추가시간:" + (end-start));
		
		start = System.nanoTime();
		//100000개 데이터를 2번째에 삽입 - LinkedList
		for(int i=0; i<100000; i=i+1) {
			ll.add(1, 2);
		}
		end = System.nanoTime();
		System.out.println("LinkedList 추가시간:" + (end-start));
		
		
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			al.get(1);
		}
		end = System.nanoTime();
		System.out.println("ArrayList 읽기시간:" + (end-start));
		
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			ll.get(1);
		}
		end = System.nanoTime();
		System.out.println("LinkedList 읽기시간:" + (end-start));
	
	
	}

}
