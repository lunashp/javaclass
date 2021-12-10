package abstractpolymophism;

//MobileWebBrowser와 PCBrowser 클래스의 인스턴스를 모두 대입받기 위한 상위 클래스
public abstract class ProgressiveWeb {
	//인스턴스가 접근할 수 있는 메소드를 만들어주기 위해서 만든 메소드
	//추상 메소드: 하위 클래스에서는 반드시 이 메소드를 만들어야 합니다.
	public abstract void nextPage();
}
