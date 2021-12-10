package overriding;

public class K extends C {
	//메소드 오버라이딩 
	//상위 클래스에 있는 메소드를 하위 클래스에서 다시 만드는 것
	@Override
	public void method() {
		//상위 클래스의 메소드를 호출
		super.method();
		
		System.out.println("추가하고자 하는 기능");
	}

}
