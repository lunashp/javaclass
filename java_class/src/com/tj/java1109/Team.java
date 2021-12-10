package com.tj.java1109;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String teamname;
	private int count;
	private int win;
	private int lose;
	private int points;
	
	//데이터 목록
	private List<String> players;
	//생성자 - 초기화 작업
	//메모리 할당을 해야 하는 속성들의 메모리 할당을 생성자에서 
	//미리 해주면 외부에서 메모리 할당을 하지 않아서 발생하는 
	//NullPointerException을 줄일 수 있습니다.
	public Team() {
		//선수 명단을 저장할 List에 메모리 할당
		players = new ArrayList<>();
	}
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", count=" + count + ", win=" + win + ", lose=" + lose + ", points="
				+ points + ", players=" + players + "]";
	}
	
	}
	
