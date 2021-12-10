package com.tj.java1101;

public class Test {
	//한 명의 사람 정보를 나타내기 위한 속성 - private
	private int num;
	private String name;
	private String class_1;
	private int score;
	
	//접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_1() {
		return class_1;
	}
	public void setClass_1(String class_1) {
		this.class_1 = class_1;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//인스턴스를 문자열로 리턴해주는 메소드
	//출력하는 메소드에 인스턴스 이름을 대입하면 자동으로 호출
	@Override
	public String toString() {
		return "Test [num=" + num + ", name=" + name + ", class_1=" + class_1 + ", score=" + score + "]";
		
	}
	
	
}
