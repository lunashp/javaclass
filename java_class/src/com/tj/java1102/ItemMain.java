package com.tj.java1102;

public class ItemMain {

	public static void main(String[] args) {
		//Item 클래스의 인스턴스 만드는 방법을 확인해보고
		//각각의 방법으로 인스턴스를 생성해보기
		Item item1 = new Item();
		Item item2 = new Item(1, "Apple", "비타민 c 풍부", 3000, "apple.png");
		
		
		//생성된 인스턴스의 값을 출력해보세요
		System.out.println(item1);
		System.out.println(item2);
		
	}

}
