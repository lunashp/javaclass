package com.tj.java1028;

public class Practice_1 {

	public static void main(String[] args) {
		//Prime(소수): 1과 자기 자신으로만 나누어 떨어지는 수
		//소수 판별하는 방법: 2부터 자신의 절반이 되는 숫자까지 나누어서 
		//한 번도 나누어 떨어지지 않으면 소수 -> 나머지가 0이 아님
		
		int su = 11; 
		//su가 소수인지 확인하기 
		boolean flag = true;
		//2부터 자신의 절반이 되는 숫자까지 하나씩 증가
		for(int i = 2; i < su / 2 + 1; i = i+1) {
			//su를 i로 나누었을 때 나누어 떨어지는지(나머지가 0) 확인
			if(su % i == 0) {
				flag = false;
				break;
			}
		}
if(flag == true) {
	System.out.println("소수");
}else {
	System.out.println("소수가 아님");
}
	}

}
