package overriding;

public class Main {

	public static void main(String[] args) {
		//C Class의 method 사용
		//제공되는 메소드를 사용할 때 확인할 내용
		//1. static이 붙었는지 안 붙었는지 확인 - static이 있으면 2번 패스
		//2. static이 붙지 않았다면 인스턴스 생성은 어떻게 해야 하는지
		C obj = new C();
		//3. 매개변수는 어떤 자료형 몇 개인지 확인 - 없음
		//4. return type은 어떻게 되는지 - void
		obj.method();
		
		System.out.println("=============");
		
		//C클래스의 method의 기능이 부족하다고 판단되면
		//C클래스의 상속받는 클래스를 생성 - K
		//K클래스에 기능이 부족하다고 판단된 메소드를 재정의
		
		K ins = new K();
		ins.method();
		
		//C가 상위 클래스이고 K가 하위클래스
		C c = new C(); //클래스와 인스턴스 타입이 같으면 대입이 가능 
		c = new K(); //인스턴스의 타입이 변수의 클래스의 하위 클래스이면 가능
		
		K k = new K();
		//k = new C(); // 이 문장은 에러
		//K가 C 클래스의 하위 클래스이기 때문에 에러
		
		//k = (K)(new C()); //강제로 형변환을 하면 에러는 아니지만 예외가 발생
		
		k = (K)c; //예외 발생하지 않음 - C에는 K()가 대입되어 있어서 가능
	}

}
