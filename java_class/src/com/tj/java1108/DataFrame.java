package com.tj.java1108;

import java.util.ArrayList;
import java.util.Comparator;

public class DataFrame {

	public static void main(String[] args) {
		//1.DataFrame 만들기
		//boolean, byte, short, char, int, long, float, double, String - 가로의 각 항목
		
		//DTO Class - 가로

		//배열, ArrayList, LinkedList - 세로
		
		ArrayList<DTO> ar = new ArrayList();

		//2. 데이터 추가
		DTO dto= new DTO();
		dto.setName("박정수");
		dto.setAge(39);
		//마지막에 데이터 추가
		ar.add(dto);
		
		//새로운 데이터를 만들어서 dto에 대입
		dto= new DTO();
		dto.setName("이동해");
		dto.setAge(36);
		//마지막에 데이터 추가
		ar.add(dto);
		
		dto= new DTO();
		dto.setName("조규현");
		dto.setAge(35);
		//마지막에 데이터 추가
		ar.add(dto);
		
		dto= new DTO();
		dto.setName("김종운");
		dto.setAge(38);
		//1번에 데이터 끼워 넣기
		ar.add(1, dto);
		
		
		//3. 모든 데이터 확인하기 
		//List의 toString은 재정의 되어 있어서 모든 데이터의 toString을 하나의 문자열로 합쳐서 리턴함
		//->데이터 확인만 하고자 할 때 사용
		System.out.println(ar);
		
		//모든 데이터 순회 - 빠른 열거 이용
		for(DTO temp:ar) {
			System.out.println(temp);
		}
		System.out.println("=================");
		
		//데이터 개수 - size()
		//데이터 1개 가져오기 - get (int index)
		int len = ar.size();
		for(int i=0; i<len; i=i+1) {
			System.out.println(ar.get(i));
		}
		
		//4. 데이터 수정 
		//set(int index, Data data)
		//규현의 나이를 34로 수정
		dto = new DTO();
		dto.setName("조규현");
		dto.setAge(34);
		
		ar.set(3, dto);
		
		System.out.println("============");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		//5. 데이터 삭제
		//remove(int, index)
		ar.remove(1);
		System.out.println("============");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		//6. 데이터 정렬
		//sort(Comparator comparator)
		
		ar.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO arg0, DTO arg1) {
				//return arg0.getName(). compareTo(arg1.getName());
				return arg0.getAge() - arg1.getAge();
			}
			
		});
		
		
		System.out.println("============");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
	}
}


