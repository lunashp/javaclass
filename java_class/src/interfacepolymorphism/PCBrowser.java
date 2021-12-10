package interfacepolymorphism;

//ProgressiveWeb으로부터 상속받는 PCBrowser
public class PCBrowser implements ProgressiveWeb{
	public void nextPage() {
		System.out.println("다음 페이지 번호 클릭");
		}

}
