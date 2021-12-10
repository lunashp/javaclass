package com.tj.java1101;

public class Main_test {

	public static void main(String[] args) {
		//한 사람의 시험점수만 저장
		Test p1 = new Test();
		p1.setNum(1);
		p1.setName("짱구");
		p1.setClass_1("a");
		p1.setScore(50);
		
		//각 속성을 출력
		System.out.println(p1.getNum());
		System.out.println(p1.getName());
		System.out.println(p1.getClass_1());
		System.out.println(p1.getScore());
		
		//모든 속성 출력 - toString 호출
		System.out.println(p1);
		
		//동일한 모양의 데이터를 여러개 사용하고자 할 때는 
		//배열(크기가 고정)이나 List(크기를 변경시킬 수 있음)를 생각
		Test [] contacts = new Test [3];
		
		//각각의 공간을 생성
		for(int i = 0; i<contacts.length; i=i+1) {
			contacts[i] = new Test();
		}
		
		contacts[0].setNum(1);
		contacts[0].setName("짱구");
		contacts[0].setClass_1("a");
		contacts[0].setScore(50);
			
		contacts[1].setNum(2);
		contacts[1].setName("철수");
		contacts[1].setClass_1("b");
		contacts[1].setScore(90);
		
		contacts[2].setNum(3);
		contacts[2].setName("맹구");
		contacts[2].setClass_1("c");
		contacts[2].setScore(70);
		
		//배열의 모든 데이터 출력
		for(Test result : contacts) {
			System.out.println(result);
			}
	
	}

}
