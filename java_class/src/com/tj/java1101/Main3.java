package com.tj.java1101;

public class Main3 {

	public static void main(String[] args) {
		//인스턴스 배열 만들기 - 3개 저장
		Menu [] menus = new Menu[3];

		//배열을 만들고 인스턴스를 대입할때는 빠른 열거를 사용하면 안됩니다.
		//i는 0부터 menu.lenght까지 1씩 증가하면서 수행
		for(int i=0; i<menus.length; i=i+1) {
			menus[i] = new Menu();
		
		}
		//데이터 저장하기
		menus[0].drinkName = "아벨 블랜딩";
		menus[0].price = 8000;
		
		menus[1].drinkName = "과테말라 산타모니카";
		menus[1].price = 8500;
		
		menus[2].drinkName = "브라질 세라도";
		menus[2].price = 9000;
		
		//전부 출력
		for(Menu menu : menus) {
			System.out.println(menu.drinkName + ":" + menu.price + "원");
		}
		
	}

}
