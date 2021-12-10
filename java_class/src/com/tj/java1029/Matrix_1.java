package com.tj.java1029;

public class Matrix_1 {

	public static void main(String[] args) {
		//각 열은 3개이고 행은 2개인 행렬 생성
		int [][] scores = {{10, 20, 30}, {40, 50, 60}};
		
		//모든 데이터를 접근
		//행의 개수 가져오기 
		int rows = scores.length;
		//0번 행의 열의 개수 가져오기 
		int cols = scores[0].length;
		
		//행을 순회
		for(int i = 0; i<rows; i=i+1) {
			//각 행의 열을 순회
			for(int j=0; j<cols; j=j+1) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println("");
			}
		
		//열을 먼저 순회
		for(int i = 0; i<cols; i=i+1) {
			//각 행의 열을 순회
			for(int j=0; j<rows; j=j+1) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println("");
			}
		
		}

	}


