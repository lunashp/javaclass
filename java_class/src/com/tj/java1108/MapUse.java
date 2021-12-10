package com.tj.java1108;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Key는 String으로 하고 Value는 Object로 하는 HashMap을 생성
		//Value를 Object로 하는 이유는 Object에는 모든 종류의 데이터를 대입할 수 있기 때문
		//대신에 Object로 된 데이터는 출력을 할 때를 제외하고는 강제 형변환을 통해서
		//원래의 자료형으로 되돌려서 사용해야 함 
		//1. HashMap을 생성
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		//2. 데이터 저장
		map.put("name", "ryeowook");
		map.put("age",36);
		map.put("age",35); //age에 데이터를 저장했는데 다시 저장하면 수정 
		
		//3. 데이터 꺼내기 
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		
		//4. 데이터 추가
		map.put("song","withoutyou");
		String [] albums = {"너에게", "취해"};
		map.put("album", albums);
		
		//5. toString 메소드: 각 요소의 toString 메소드를 호출한 결과
		System.out.println(map);
		
		//6. 없는 key를 사용하면 null 리턴
		System.out.println(map.get("family"));
		
		//7. 데이터 삭제
		//map.remove("album");
		map.put("album","취해");
		//get으로 꺼내면 null이기 때문에 지운것으로 간주
		System.out.println(map);
		
		//8. 전체 데이터 순회 - key의 이름을 기억하지 않아도 됩니다. 
		Set<String> keys = map.keySet(); //모든 키를 가져옵니다.
		for(String key : keys) {
			System.out.println(key + ":" + map.get(keys));
		}
	}
	

}
