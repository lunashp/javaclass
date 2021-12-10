package com.tj.java1109;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMate {

	public static void main(String[] args) {
		//오늘부터 1986년 10월 15일까지 지나온 날짜 계산 
		
		//1986년 10월 15일을 Calendar 객체로 생성
		Calendar meetday = new GregorianCalendar(1986, 9, 15);
		//오늘 날짜 만들기
		Calendar today = Calendar.getInstance();
		
		//epoch time으로 변환해서 빼기
		long cha = today.getTimeInMillis() - meetday.getTimeInMillis();
		
		//초 단위
		long second = cha / 1000;
		
		//분 단위
		long minute = second / 60;

		//시간 단위
		long hour = minute / 60;
		
		//날짜
		long day = hour / 24;
		System.out.println("동해가 태어난 지" + day + "일이 지났습니다.");
		
		//Calendar를 Date로 변환
		Date date = new Date(today.getTimeInMillis());
		System.out.println(date);
		
		//Date 객체를 가지고 Calendar로 변환
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal);
	}

}
