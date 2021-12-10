package com.tj.java1102;

public class ThisMain {

	public static void main(String[] args) {
		//ThisClass에 있는 method()를 호출
		//1. static이 붙은 메소드인지 확인
		
		//2 static이 붙지 않은 메소드라면 인스턴스를 생성
		//생성자를 확인하고 생성자가 없으면 static으로 자기자신을 리턴하는 메소드 확인
		This obj = new This();
		//3. 필요한 메소드 호출
		obj.method();
		obj = new This();
	
				

	}

}
