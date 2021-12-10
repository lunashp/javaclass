package practice;

import java.util.Random;

public class APIPractice {

	public static void main(String[] args) {
		//java.lang.Mathe 클래스의 random 메소드를 이용해서
		//0.0 ~ 1.0 사이의 랜덤한 실수를 만들어서 출력하기
		double d = java.lang.Math.random();

		System.out.println("d:" + d);
		
		//java.util.Random 클래스의 nextInt라는 메소드를 이용하면
		//랜덤한 정수를 생성할 수 있습니다.
		//랜덤한 정수를 생성해서 출력
		//메소드를 찾고
		//static이 붙어 있는지 확인하고
		//static이 있으면 클래스로 호출 가능하고 없으면 인스턴스를 생성 - 생성자 확인
		//메소드의 매개변수를 확인하고 리턴 타입을 확인
		Random r = new Random();
		int i = r.nextInt();
		System.out.println("i:" + i);
		
		//아래 문장은 에러
		
		//모든 멤버가 static 이라서 생성자를 외부에 노출 시키지 않음
		//java.lang.Math m = new java.lang.Math();
		
		//추상 클래스라서 인스턴스 생성 못함
		//java.util.Calendar cl = new java.util.Calendar();
		
		//인터페이스라서 인스턴스 생성 못함
		//java.util.List list = new java.util.List();
		
		//java.lang.Thread 클래스의 sleep 이라는 메소드를 이용하면
		//일정 시간동안 현재 스레드를 대기시킬 수 있습니다.
		//단위는 1/1000입니다.
		//3초간 현재 프로그램을 대기 시키기
		try {
		Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
		//java.lang.Runtime 클래스는 모든 멤버가 static이 아니므로
		//인스턴스를 생성해야합니다.
		//abstract class도 아니고 interface도 아님
		//그런데 아래 문장은 에러
		//이런 경우 인스턴스 생성?
		//메소드 중에서 자기 자신을 리턴하는 메소드가 있는지 확인
		Runtime runtime = Runtime.getRuntime();
	}
	

}
