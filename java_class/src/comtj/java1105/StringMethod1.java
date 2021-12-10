package comtj.java1105;

public class StringMethod1 {

	public static void main(String[] args) {
		//문자열의 일치 여부 확인
		String str1 = "luna";
		String str2 = "LUNA";
		String str3 = " Luna ";

		//문자열의 일치 여부를 비교할 때는 좌우 공백을 제거하고
		//대소문자를 하나로 통일하고 하는 것이 좋습니다.
		//비밀번호는 예외
		System.out.println(
				str1.trim().toUpperCase().equals(str2.trim().toUpperCase()));
		System.out.println(
				str1.trim().toUpperCase().equals(str3.trim().toUpperCase()));

		//대소문자 변환을 하지 않은 상태에서 크기 비교를 하면 소문자가 크다고 나옴
		System.out.println(str1.compareTo(str2));
		//크기 비교한 결과 앞의 것이 크면 앞의 것이 크다고 같으면 같다고 비교 대상이 크면 
		//뒤의 것이 크다고 출력하기 
		int result = str1.compareTo(str2);
		if(result>0) {
			System.out.println("str1이 더 큼");
		}else if(result==0) {
			System.out.println("str1과 str2는 같음");
		}else {
			System.out.println("str2가 더 큼");
		}

	}
}
