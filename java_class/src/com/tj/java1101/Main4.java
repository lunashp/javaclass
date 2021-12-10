package com.tj.java1101;

public class Main4 {

	public static void main(String[] args) {
		//Method의 인스턴스를 생성
		Method obj = new Method();
		//인스턴스를 이용해서 메소드 호출
		obj.method();
		//static이 없는 메소드는 반드시 인스턴스를 생성해서 호출해야 합니다.
		//MethodClass.method();

		//static 메소드 호출
		Method.noArgDisp();

		//매개변수가 정수 1개인 static 메소드 호출
		Method.argDisp(5); 

		//매개변수가 2개인 매소드 호출
		Method.twoArgDisp("losiento", 4);

		//static이 없는 메소드는 인스턴스를 이용해서 호출
		Method ins = new Method();
		//return이 없는 메소드라서 호출하고 끝
		ins .noReturnAdd(50, 70);

		//return이 있는 경우는 결과를 다른 변수에 저장해서 사용하는 것이 일반적
		int result = ins.returnAdd(50, 70);
		//결과를 출력
		System.out.println(result);
		//이전 결과를 가지고 다시 더하기
		result = ins.returnAdd(result, 100);
		System.out.println(result);

	}

}


