package com.tj.java1108;

import java.util.LinkedHashMap;
import java.util.Set;

public class DTOAndMap {

	public static void main(String[] args) {
		//DTO를 이용해서 데이터를 생성
		DTO dto = new DTO();
		dto.setName("donghae");
		dto.setAge(36);

		//데이터 출력 - DTO는 반복문을 사용할 수 없음 
		System.out.println("이름:" + dto.getName());
		System.out.println("나이:" + dto.getAge());
		
	
		LinkedHashMap<String, Object>  map =
				new LinkedHashMap<String, Object>();
		map.put("name", "donghae");
		map.put("age", 36);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
