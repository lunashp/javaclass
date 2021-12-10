package com.tj.java1102;

public class StudentMain {

	public static void main(String[] args) {
		//지역변수(메소드 안에서 만든 변수)는 자동으로 초기화 되지 않음
		//이 문장은 에러
		//int a;
		//System.out.println(a);
		
		//인스턴스 생성
		Student student1 = new Student();
		//멤버변수는 자동으로 초기화
		//숫자는 0, boolean은 false, 그 이외는 null로 초기화가 됩니다.
		System.out.println(student1.getNum());
		System.out.println(student1.getName());
		System.out.println(student1.getScores());

		//setter를 이용해서 데이터를 주입(Dependency Injection)
		//student1.setName("luna");
		
		//배열을 생성해서 대입
		//int [] ar = new int [3];
		//student1.setScores(ar);
		
		System.out.println(student1.getName().toUpperCase());
		System.out.println(student1.getScores()[0]);
		
		//매개변수가 3개인 생성자를 호출
		Student student2 = new Student(2, "solar", new int[3]);
		System.out.println(student2.getName().toUpperCase());
		System.out.println(student2.getScores()[1]);
		
	}

}
