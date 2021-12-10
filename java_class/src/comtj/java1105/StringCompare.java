package comtj.java1105;

public class StringCompare {

	public static void main(String[] args) {
		//String과 StringBuilder의 차이 
		
		//1.생성
		String str = "My name is";
		StringBuilder sb = new StringBuilder("My name is");
		
		//2.해시코드 출력 - 동일한 인스턴스인지 확인하기 위해서 출력 
		System.out.println("str:" + str.hashCode());
		System.out.println("sb:" + sb.hashCode());

		//3.문자열 추가 연산
		str = str + "luna";
		sb.append("luna");
		
		//4.추가 연산을 한 후 해시코드 확인
		System.out.println("추가 연산 후 다시 확인");
		//String은 새로운 공간에서 작업을 수행하고 그 공간의 참조를 리턴하기 때문에 
		//해시코드가 변경됨
		System.out.println("str:" + str.hashCode());
		//StirngBuilder는 현재 공간에서 작업을 수행하기 때문에 해시코드가 그대로 
		System.out.println("sb:" + sb.hashCode());

		
		
	}

}
