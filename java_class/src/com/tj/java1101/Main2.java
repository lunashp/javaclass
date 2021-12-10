package com.tj.java1101;

public class Main2 {

	public static void main(String[] args) {
		//음식점 이름을 설정 - static
		//static 변수는 클래스 이름으로 사용 가능
		Menu.cafeName = "abel";

		//각각의 메뉴 생성
		Menu menu1 = new Menu();
		menu1.drinkName = "아메리카노";
		menu1.price = 5500;
		
		Menu menu2 = new Menu();
		menu2.drinkName = "라떼";
		menu2.price = 6000;
		
		//출력
		//카페 이름
		System.out.println(Menu.cafeName);
		
		System.out.println(menu1.drinkName + " " + menu1.price + "원");
		System.out.println(menu2.drinkName + " " +  menu2.price + "원");
		
		
	}

}
