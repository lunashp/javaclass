package singleton;
//Singleton 패턴으로 디자인
public class Businesslogic {
	//1. 생성자를 private으로 생성 - 외부에서는 instance 생성 못함
	private Businesslogic() {}
	
	//2. 자신의 클래스 타입으로 static 변수를 생성
	private static Businesslogic obj;
	
	//3. static 변수가 null 일때 인스턴스를 생성하는 static 메소드를 생성
	public static Businesslogic sharedInstance() {
		if(obj == null) {
			obj = new Businesslogic();
		}
		return obj;
	}
}

		
	
	


