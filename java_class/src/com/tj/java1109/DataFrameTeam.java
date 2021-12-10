package com.tj.java1109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DataFrameTeam {

	public static void main(String[] args) {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setTeamname("IBK기업은행");
		team.setWin(0);
		team.setLose(5);
		team.setCount(5);
		team.setPoints(0);
		team.getPlayers().add("김희진");
		team.getPlayers().add("표승주");
		team.getPlayers().add("김수지");

		list.add(team);

		team = new Team();
		team.setTeamname("한국도로공사");
		team.setWin(3);
		team.setLose(3);
		team.setCount(6);
		team.setPoints(9);
		team.getPlayers().add("박정아");
		team.getPlayers().add("이고은");
		team.getPlayers().add("배유나");

		list.add(team);

		team = new Team();
		team.setTeamname("현대건설");
		team.setWin(6);
		team.setLose(0);
		team.setCount(6);
		team.setPoints(17);
		team.getPlayers().add("양효진");
		team.getPlayers().add("야스민");
		team.getPlayers().add("황민경");

		list.add(team);

		team = new Team();
		team.setTeamname("GS칼텍스");
		team.setWin(4);
		team.setLose(2);
		team.setCount(6);
		team.setPoints(12);
		team.getPlayers().add("강소휘");
		team.getPlayers().add("안혜진");
		team.getPlayers().add("오지영");

		list.add(team);


		//데이터 전체 읽어오기
		//빠른 열거 사용
		for(Team t : list) {
			System.out.print(t.getTeamname() + "\t");
			System.out.print(t.getWin() + "\t");
			//내부에 배열이나 List가 있으면 다시 순회
			for(String player : t.getPlayers()) {
				System.out.print(player + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
		//데이터 1개 가져오기
		System.out.print(list.get(0));
		//데이터 일부분 출력하기
		int i = 0;
		for(i=0; i<2; i=i+1) {
			System.out.println(list.get(i));
		}
		System.out.println("데이터 정렬하기");
		//배열은 Arrays.sort
		//List는 sort 메소드를 이용해서 정렬
		//Comparator 인터페이스를 구현해서 compare 메소드를 재정의해야 합니다. 
		//이 경우에는 누구를 가지고 정렬할 것인지 결정을 내려야 합니다. 
		//스캐너를 이용해서 문자열을 입력받아서 1을 누르면 팀이름의 오름차순으로 
		//2를 누르면 승점의 내림차순으로 정렬해서 팀 이름만 출력하기 

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1.이름 오름차순 2.승점 내림차순 3.종료");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				list.sort(new Comparator<Team>(){
					@Override
					public int compare(Team o1, Team o2) {
						return o1.getTeamname().compareTo(o2.getTeamname());
					}
				});


			}else if(menu.equals("2")) {
				list.sort(new Comparator<Team>() {
					@Override
					public int compare(Team o1, Team o2) {
						return o2.getPoints() - o1.getPoints();
						/*
						만일 point가 실수라면
						double cha = o2.getPoints() - o1.getPoints();
						if(cha>0) {
							return 1;
						}else if(cha<0) {
							return -1;
						}else {
							return 0;
						}
						 */


					}

				});


			}else if(menu.equals("3")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 메뉴 선택");

			}
			//전체 데이터를 출력
			for(Team t : list) {
				System.out.println(t.getTeamname());
			}

		}
	}
}





