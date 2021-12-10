package comtj.java1105;

public class SystetmMethod {

	public static void main(String[] args) {
		//운영체제 이름 확인 
		System.out.println("OS:" + System.getProperty("os.name"));
		System.out.println("자바버전:" + System.getProperty("java.version"));

		//현재시간
		long start = System.nanoTime();
		//작업수행 - 10억번 (int는 21억까지 가능)
		for(int i=0; i<1000000000; i++) {}
		//21억이 넘거나 -21보다 작은 정수를 표현하고자 하면
		//long을 사용하면 되는데 숫자를 작성할 때는 뒤에 L을 붙여야 합니다.
		//for(long i=0; i<10000000000L; i++) {}	
		
		//현재시간
		long end = System.nanoTime();
		//뒤의 시간에서 앞의 시간을 빼면 작업을 수행하는데 걸린 시간
		System.out.println("i++ 걸린시간:" + (end-start));

		
		start = System.nanoTime();
		for(int i=0; i<1000000000; i=i+1) {}
		end = System.nanoTime();
		System.out.println("i=i+1 걸린시간:" + (end-start));

	}

}
