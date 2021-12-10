package com.tj.java1102;

//Super 클래스를 상속받은 Sub 클래스
public class Sub extends Super {
	public void subMethod() {
		//상위 클래스의 private 멤버는 하위클래스에서는 접근이 안됩니다.
		//privateMethod();

		//상위 클래스의 package 멤버는 동일한 패키지면 접근이 가능합니다.
		packageMethod();
		
		//상위 클래스의 protected 멤버는 하위 클래스에서 접근이 가능
		protectedMethod();
		
		//상위클래스의 public 멤버는 하위 클래스에서 접근이 가능
		publicMethod();
	}
}


