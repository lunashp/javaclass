package singleton;

public class Main {

	public static void main(String[] args) {
		//인스턴스 생성
		//Businesslogic obj1 = new Businesslogic();
		//Businesslogic obj2 = new Businesslogic();
		
		//싱글톤 패턴으로 디자인 된 클래스라서
		//생성자로 인스턴스 생성을 못하고 static 메소드를 호출해서 인스턴스를 생성
		Businesslogic obj1 = Businesslogic.sharedInstance();
		Businesslogic obj2 = Businesslogic.sharedInstance();
	

		//기존 인스턴스를 가리키도록 하기
		Businesslogic obj3 = obj1;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
	}

}
