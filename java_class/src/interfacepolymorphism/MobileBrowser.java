package interfacepolymorphism;

//ProgressiveWeb으로부터 상속받는 MobileBrowser
public class MobileBrowser implements ProgressiveWeb {
	public void nextPage() {
		System.out.println("아래로 스크롤");
	}
	
}
