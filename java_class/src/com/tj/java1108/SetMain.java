package com.tj.java1108;

import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//Set은 중복된 데이터를 저장하지 않음
		//TreeSet은 순차적으로 접근하면 데이터를 크기 순서대로 리턴 
		TreeSet<String> songs = new TreeSet<>();
		songs.add("아주 멀리");
		songs.add("아주 멀리");
		songs.add("그대가 있네요");
		songs.add("그대의 매일은");
		songs.add("봄날이라 믿어");
		for(String song : songs) {
			System.out.println(song);
		}
	}

}
