package comtj.java1105;

public class StringMethod2 {

	public static void main(String[] args) {
		String str = "Hello String";
		
		//문자열의 길이를 출력
		int len = str.length();
		System.out.println("str의 길이:" + len);
		
		//str의 첫글자가 대문자인지 판별 
		char ch = str.charAt(0);
		if(ch >= 'A' && ch <='Z') {
		System.out.println("첫글자는 대문자");
		}else {
			System.out.println("첫글자는 대문자가 아님");
		}
		
		//str의 첫글자가 영문자인지 판별 
		if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <='z') {
			System.out.println("첫글자는 영문자");
		}else {
			System.out.println("첫글자는 영문자가 아님");
		}
	}

}
