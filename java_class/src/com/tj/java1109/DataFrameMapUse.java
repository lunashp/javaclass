package com.tj.java1109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataFrameMapUse {

	public static void main(String[] args) {
		//Map을 이용해서 하나의 행을 표현하면 DTO 클래스가 필요없음 
		//여기서 주의할 점은 key를 문자열로 작성하기 때문에 key 이름을 정확하게 기억해야 합니다. 
		//get을 이용해서 가져온 후 사용할 때 강제 형변환을 해주어야 합니다. 
		List<Map<String, Object>> list = 
				new ArrayList<>();
		
		//1개의 데이터를 생성해서 추가하기 
		Map<String, Object> map = new HashMap<>();
		map.put("name", "SUPERJUNIOR");
		map.put("agency", "SM");
		map.put("debut", 20051106);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "BTOB");
		map.put("agency", "CUBE");
		map.put("debut", 20120321);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "HIGHLIGHT");
		map.put("agency", "AROUND US");
		map.put("debut", 20091016);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "2PM");
		map.put("agency", "JYP");
		map.put("debut", 20080904);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "BIGBANG");
		map.put("agency", "YG");
		map.put("debut", 20060819);
		list.add(map);
		
		
		//전체 데이터 출력하기
		for(Map<String, Object> temp : list) {
			//Map에 저장된 데이터를 출력할 때는 get으로 꺼내 그대로 사용하면 됩니다.
			System.out.println(temp.get("name") + ":" + 
			temp.get("agency"));
		}
		//일부분의 데이터 출력하기
		//현재 출력중인 데이터 번호를 저장할 인덱스 변수 생성
		int i=0;
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//무한 반복문 생성
		while(true) {
			//페이지당 2개씩 출력할 것이라서 +2
			int size = i + 2;
			for(; i<size; i=i+1) {
				//데이터의 인덱스가 list의 데이터 개수와 같아지면 더 이상 읽을 필요 없음
				if(i == list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			//무한 반복문 종료
			if(i==list.size()) {
				break;
			}
			//다음 데이터 입력 받기
			System.out.println("다음 페이지 데이터는 ENTER를 누르면 보여집니다.");
			sc.nextLine();
		}
		//무한반복문 종료
		System.out.println("==============");
		System.out.println("데이터 1개 가져오기");
		System.out.println(list.get(0));
		
		System.out.println("==============");
		System.out.println("데이터 정렬하기");
		
		//map 안에 있는 name의 오름차순 정렬
	
		list.sort(new Comparator<Map<String,Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String front = (String)o1.get("name");
				String back = (String)o2.get("name");
				return front.compareTo(back);
			}
		});
		for(Map<String, Object>temp :list) {
			System.out.println(temp.get("name"));
			
		
	
			
			

		}
	}

}
