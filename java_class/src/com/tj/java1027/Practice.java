package com.tj.java1027;

public class Practice {

	public static void main(String[] args) {
		//113507 초가 몇 시간 몇 분 몇 초인지 계산
		int time = 113507;
		//시간 계산
		int hour = time / 3600; //정수 / 정수 -> 정수
		//시간이 가져간 것은 제외하고 분으로 나눔
		//int minute = (time - hour * 3600) / 60;
		int minute = (time % 3600) / 60;
		//시간과 분이 가져간 것을 제외
		//int second = time-(hour*3600)-(minute*60);
		int second = time % 60;
		System.out.println(hour + "시간" + minute + "분" + second + "초");
		
		
		int x = 30;
		int y = 70;
		//x와 y의 데이터를 교환하기 - swap
		//콜라가 가득 든 컵과 사이다가 가득 든 컵이 있을 때 
		//2개의 컵의 내용물을 어떻게 바꿀 수 있는 지가 힌트
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);

		int a = 10;
		int b = 20;
		
		int c = a;
		a = b;
		b = c;
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

}
