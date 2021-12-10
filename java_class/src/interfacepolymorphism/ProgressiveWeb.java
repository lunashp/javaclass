package interfacepolymorphism;

//MobileWebBrowser와 PCBrowser 클래스의 인스턴스를 모두 대입받기 위한 인터페이스
//인터페이스 - 인스턴스를 생성할 수 없습니다. 추상 메소드와 상수만을 가져야 합니다.
public interface ProgressiveWeb {
	//인스턴스가 접근할 수 있는 메소드를 만들어주기 위해서 만든 메소드
	//추상 메소드: 하위 클래스에서는 반드시 이 메소드를 만들어야 합니다.
	//인터페이스에서는 abstract가 없어도 추상 메소드가 됩니다. 
	public void nextPage();
}
