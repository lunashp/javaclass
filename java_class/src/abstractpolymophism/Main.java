package abstractpolymophism;

public class Main {

	public static void main(String[] args) {
		//2개의 클래스에 있는 메소드를 호출
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		

	}

}
