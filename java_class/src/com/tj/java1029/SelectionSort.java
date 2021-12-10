package com.tj.java1029;

public class SelectionSort {

	public static void main(String[] args) {
		//1. 정수 5개를 저장하는 배열을 생성 - 초기값을 임의로 부여
		//이 부분을 키보드로부터 입력받는 코드로 변경
		
		int[] data = {72, 60, 88, 94, 80};
		
		//2. 모든 데이터를 순회하면서 출력하기
		//72, 60, 88, 94, 80 형태로 출력 - 줄 바꿈은 마지막에 하도록
		for(int num : data) {
			System.out.print(num + "\t");
		}
		System.out.println("");
		
		//3. 선택정렬
		//첫번째 자리부터 마지막 -1까지 데이터를
		//첫번째 자리부터 마지막 -1까지 데이터를 출력
		//72 60 88 94
		
		//전체가 필요하지 않거나 인덱스가 필요할 때는 빠른 열거를 사용하면 안됩니다.
		int len = data.length;
		//첫번째 자리부터 마지막 -1까지
		for(int i=0; i<len-1; i=i+1) {
			//뒤에 있는 모든 것
			for(int j=i+1; j<len; j=j+1 ) {
				//자신의 데이터와 뒤에 있는 데이터를 비교해서 자신이 더 크면
				if(data[i] > data[j]) {
					//데이터의 위치를 교환 - swap
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
			}
			}
		}
		//4. 정렬된 데이터를 출력
		//모든 데이터를 출력
		for(int imsi : data) {
			System.out.print(imsi + "\t");
		}
		System.out.println("");
		
	
	
		
			
		
		}
	}

	
	


