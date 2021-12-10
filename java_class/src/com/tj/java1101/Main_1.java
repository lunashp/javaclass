package com.tj.java1101;

//클래스와 인스턴스
public class Main_1 {

	public static void main(String[] args) {
		//인스턴스 만들기
		Student student1 = new Student();
		System.out.println(student1);
		
		//새로운 인스턴스 생성
		Student student2 = new Student();
		System.out.println(student2);
		
		//기존 인스턴스를 다른 이름으로 사용할 수 있도록 하기
		Student student3 = student2;
		System.out.println(student3);
		
		//static이 붙은 것과 그렇지 않은 멤버의 차이
		//static이 붙지 않으면 인스턴스만 사용 가능
		//static이 붙지 않은 멤버 변수는 인스턴스가 별도로 메모리 할당을 받아서 사용
		student1. num = 1;
		student2. num = 2;
		System.out.println(student1.num);
		System.out.println(student2.num);
		//아래 문장은 에러 - static이 없으면 클래스로는 접근 못함
		//System.out.println(student.num);
		
		//Static은 자바에서는 클래스 이름과 인스턴스 이름으로 접근 가능
		//Static은 하나만 만들어서 모든 인스턴스가 공유합니다.
		//Static 변수의 목적은 공유 입니다.
		//공유라는 말 대신에 통신이라고 하기도 합니다.
		Student.school = "덕소고";
		student1.school = "와부고";
		System.out.println(student1.school);
		System.out.println(student2.school);
		System.out.println(Student.school);
		
		//pivate은 접근 할 수 없음
		//student1.name = "루나";
		}

}
