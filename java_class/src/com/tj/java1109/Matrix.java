package com.tj.java1109;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//여자배구 선수 명단을 팀별로 저장
		//여러개의 팀이 존재하고 각 팀에는 여러명의 선수가 존재 
		
		//각 팀 선수 명단
		String [] ibk = {"김희진", "표승주", "김수지"};
		String [] hyundae = {"양효진", "야스민", "황민경"};
		String [] kgc = {"염혜선", "이소영", "한송이"};
		
		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리 
		String [][] volleyballs = {ibk, hyundae, kgc};
		
		//데이터 출력 - 팀 선수 명단을 줄단위로 출력
		//배열은 인덱스로 데이터를 찾아갑니다.
		for(int i = 0; i<volleyballs.length; i=i+1) {
			String [] players = volleyballs[i];
			
			if (i==0) {
				System.out.print("기업은행:" + "\t");
			}else if (i==1){
				System.out.print("현대건설:" + "\t");
			}else {
				System.out.print("인삼공사:" + "\t");
			}
				
			
			for(String player : players) {
				System.out.print(player + "\t");
			}
			System.out.println();
		}
		System.out.println("=======");
		//변할 가능성이 있는 데이터를 2차원 배열로 만드는 것은 바람직하지 못함
		//1차원 배열과 재열의 특징을 나타내는 속성을 Map으로 묶고 
		//이 Map을 배열로 묶어주는 것을 권장합니다. 
		Map<String, Object>map1 = new HashMap<>();
		//팀이름을 나타내는 속성
		map1.put("name", "기업은행");
		//실제 데이터를 나타내는 속성
		map1.put("data",ibk);
		
		Map<String, Object>map2 = new HashMap<>();
		map2.put("name", "현대건설");
		map2.put("data", hyundae);
		
		Map<String, Object>map3 = new HashMap<>();
		map3.put("name", "인삼공사");
		map3.put("data", kgc);
		
		//일차원 배열을 Map에 저장한 후 다시 배열을 만들기
		//Map안에 데이터의 특징으 저장할 수 있기 때문에 
		//배열의 데이터가 변경이 되더라도 출력 부분을 수정할 필요가 없습니다. 
		Map[] maps = {map1, map2, map3};
		
		for(Map map : maps) { 
			System.out.print(map.get("name") + "\t");
			//배열 꺼내기
			String [] ar = (String [])map.get("data");
			for(String player : ar)
					System.out.print(player + "\t");
		}
		System.out.println();
		
	}

}
