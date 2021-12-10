package com.tj.java1108;

import java.util.Arrays;
import java.util.Comparator;

public class DTOMain {

	public static void main(String[] args) {
		//DTO 클래스의 인스턴스 4개를 저장할 수 있는 배열을 생성
		DTO [] ar = new DTO[4];
		
		ar [0] = new DTO();
		ar [0].setName("yumi");
		ar [0].setAge(30);

		ar [1] = new DTO();
		ar [1].setName("luna");
		ar [1].setAge(24);
		
		ar [2] = new DTO();
		ar [2].setName("solar");
		ar [2].setAge(26);
		
		ar [3] = new DTO();
		ar [3].setName("ruby");
		ar [3].setAge(20);
		
		//배열의 데이터 출력
		//System.out.println(Arrays.toString(ar));
		for(DTO dto : ar)
			System.out.println(dto);

	
	//배열의 데이터 정렬은 Arrays.sort 메소드에
	//배열을 대입하고 Comparator 인터페이스를 이용해서 원하는 비교 메소드를 
	//구현하면 배열의 데이터가 정렬이 됩니다. 
	Arrays.sort(ar, new Comparator<DTO>() {

		@Override
		public int compare(DTO o1, DTO o2) {
			return o2.getAge() - o1.getAge();
			//return o1.getName().compareTo(o2.getName());
		}
		
	});
	System.out.println("=========================");
	for(DTO dto : ar)
		System.out.println(dto);
	}
}


