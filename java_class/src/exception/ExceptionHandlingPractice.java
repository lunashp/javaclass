package exception;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		try {
			//예외가 발생할만한 코드를 작성
			int x = 10;
			//int n = 0;
			int n = 2;

			int result = x/n;
			System.out.println("result:" + result);

			//ar이 null이므로 NullPoinerException 발생
			//NullPointerException을 처리하는 구문이 없으면 프로그램 중단
			int [] ar = null;
			int size = ar.length;
			System.out.println("size:" + size);

		}catch(ArithmeticException e) {
			//ArithmeticException이 발생했을 때 처리할 내용
			System.out.println("산술예외:" + e.getLocalizedMessage());
		}catch(NullPointerException e) {
			//ArithmeticException이 발생했을 때 처리할 내용
			System.out.println("null 예외:" + e.getLocalizedMessage());
		}catch(Exception e) {
			System.out.println("모든 예외 처리 가능:" + e.getLocalizedMessage());
		}

		finally {
			//무조건 수행할 내용
			System.out.println("무조건 수행할 내용");
			System.out.println("주로 외부 자원 연결 해제 코드를 작성");

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




