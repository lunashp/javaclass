package comtj.java1105;

public class StringMethod4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 200;
		
		//그냥 출력해서 왼쪽부터 맞추어서 출력
		System.out.println(x);
		System.out.println(y);
		
		//3자리 확보해서 오른쪽 맞춤
		System.out.printf("%3d\n",x);
		System.out.printf("%3d\n",y);
		
		//빈자리에 0을 삽입
		System.out.printf("%03d\n",x);
		System.out.printf("%03d\n",y);
		
		double d = 12.574846;
		//소수 둘째자리까지 출력
		//세번째 자리에서 반올림 - 12.57
		System.out.printf("%.2f\n", d);
		
		//문자열로 생성
		String message = String.format("%.2f\n",d);
		//출력
		System.out.printf(message);
	}

}
