package com.tj.java1101;

public class Main5 {

	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 20;
		
		//n1과 n2는 기본형 데이터라서 메소드를 호출해도 결과가 반영되지 않습니다.
		ParameterType.valueSwap(n1, n2);
		System.out.println("n1:" + n1);
		System.out.println("n2:"+ n2);
		
		int [] xr = {100, 200, 300};
		//기본형이 아닌 데이터를 메소드에 대입하는 원본 데이터가 변경될 수도 있음
		ParameterType.refSwap(xr);
		System.out.println("xr[0]" + xr[0]);
		System.out.println("xr[1]" + xr[1]);
		
	}

}
