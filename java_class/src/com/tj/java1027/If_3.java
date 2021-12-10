package com.tj.java1027;

public class If_3 {

	public static void main(String[] args) {
		int score  = 89;
		//score가 80이상이면 장학금
		//60이상이고 80미만이면 보통
		//60미만이면 경고라고 출력
		if(score >= 80) {
			System.out.println("장학금");
		}else if (score >=60 && score < 80) {
		//&& score < 80은 적지 않아도 됨, 위에서 맞는지 부터 확인하기 때문에
		
			System.out.println("보통");
		}else if (score < 60) {
		//}else{ }
			System.out.println("경고");
		}
		
	}

}
