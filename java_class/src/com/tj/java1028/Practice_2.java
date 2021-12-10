package com.tj.java1028;

public class Practice_2 {

	public static void main(String[] args) {
		/*
		for(int i=0; i<5; i=i+1) {
		System.out.print("*");
		}
		System.out.println("");
		*/
		
		/*
		for(int j=0; j<5; j=j+1) {
		for(int i=0; i<5; i=i+1) {
			System.out.print("*");
			}
			System.out.println("");
	*/
		/*
		for(int j=0; j<5; j=j+1) {
			for(int i=0; i<j+1; i=i+1) { //for(int i=0; i<=j; i=i+1)
				System.out.print("*");
				}
				System.out.println("");
	}
	*/
		/*
		for(int i = 0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.print("*");
			}
			System.out.println("");
			}
		*/
		/*
		for(int i = 0; i<5; i=i+1) {
			for(int j=0; j<2*i+1; j=j+1) {
				System.out.print("*");
			}
			System.out.println("");
			}}
			*/
		/*
		for(int i = 0; i<5; i=i+1) {
			for(int j=0; j<9-2*i; j=j+1) {
				System.out.print("*");
			}
			System.out.println("");
			}
			*/
		for(int i = 0; i<5; i=i+1) {
			if(i<3) {
				for(int j=0; j<i+1; j=j+1) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<5-i; j=j+1) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
		
	
