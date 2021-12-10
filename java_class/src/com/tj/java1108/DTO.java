package com.tj.java1108;
//하나의 행을 표현하기 위한 클래스 - DTO 또는 VO라고도 합니다. 

public class DTO {

		//이름과 나이
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//디버깅을 위한 메소드 
		@Override
		public String toString() {
			return "DTO [name=" + name + ", age=" + age + "]";
		}

}


