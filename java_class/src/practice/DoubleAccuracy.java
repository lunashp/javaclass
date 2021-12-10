package practice;

import java.math.BigDecimal;

public class DoubleAccuracy {

	public static void main(String[] args) {
		double d1 = 1.600000000000;
		double d2 = 0.100000000000;
		//결과 - 1.7000000000000002
		//이런 결과가 나온 이유는 소수의 정밀도 문제 때문
		System.out.println(d1 + d2);
		
		BigDecimal bd1 = new BigDecimal("1.600000000000");
		BigDecimal bd2 = new BigDecimal("0.100000000000");
		System.out.println(bd1.add(bd2));
	}

}
