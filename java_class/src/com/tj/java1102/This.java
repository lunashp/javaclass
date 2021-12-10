package com.tj.java1102;

public class This {
	private int num;
	public void method () {
		int num = 100;
		//num이 2개라서 가까이서 만든 num을 찾음
		System.out.println("num:" + num); //100
		System.out.println("this num:" + this.num); //외부에서 찾기 때문에 0
		//this.을 붙이면 메소드 내부에서는 찾지 않고 메소드 외부에서부터 찾아서 사용
	}
	static {
		System.out.println("맨 처음 한 번");
	}
	{
	System.out.println("new를 호출할 때마다 불러지는");
	}
}
