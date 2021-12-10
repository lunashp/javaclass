package com.tj.java1028;

public class Etc_1 {

	public static void main(String[] args) {
		//1부터 10까지 출력하는 반복문
		//int i=1;
		//while(i<11){
			//System.out.println(i);
			//i=i+1
		int i;
		for(i=1; i<11; i=i+1) {
			//3의 배수가 되면 반복문을 종료
			//3이 되면 반복문을 더이상 수행하지 않고 종료
			if(i % 3 == 0 ) {
				break;
			}
			System.out.println(i);
		}
System.out.println("=========");

for(i=1; i<11; i=i+1) {
	//3의 배수가 되면 더 이상 내용을 수행하지 않고 다음 반복으로 이동
	//3의 배수가 되면 아래 문장을 수행하지 않기 때문에 출력이 되지 않음
	if(i % 3 == 0 ) {
		continue;
	}
	System.out.println(i);
}
	}

}
