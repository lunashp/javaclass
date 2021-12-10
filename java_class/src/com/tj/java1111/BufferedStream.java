package com.tj.java1111;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BufferedStream {

	public static void main(String[] args) {
		//파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		try {
			//상대경로를 이용해서 기록할 파일 스트림 생성
			//상대경로에는 \가 없음
			//현재 작업 디렉토리에 burn the floor.txt파일을 생성해서 기록
			ps = new PrintStream("./burn the floor.txt");
			//기록할 내용 만들기 
			String str = "피운 꽃 하나";
			//기록 - 문자열을 기록하는 메소드가 존재 
			ps.println(str);
			
			
		}catch(Exception e) {
			System.out.println("파일 경로를 확인하세요");
		}finally {
			//스트림 닫기
			ps.close();
		}

		
		//파일에서 바이트 단위로 버퍼를 사용해 읽기 - BufferedInputStream
		BufferedInputStream bis = null;
	
		try {
			//절대 경로를 이용해서 생성하기
			//MS-Windows는 드라이브 이름부터 시작하고 디렉토리 구분기호는 \
			//다른시스템은 /부터 시작하고 디렉토리 구분 기호는 /
			//컴퓨터마다 다르게 지정
			
			FileInputStream fis = 
					new FileInputStream(
							"C:\\Users\\TJ_704\\eclipse-workspace\\com.tj.java1111\\burn the floor.txt");
			bis = new BufferedInputStream(fis);
			//한번에 읽기
			byte [] b = new byte[fis.available()];
			//읽어서 저장하기
			//read에 매개변수가 있으면 읽은 개수를 리턴
			int len = bis.read(b);
			
			//읽어낸 바이트 배열을 문자열로 만들기
			String result = new String(b,0,len);
			
			//읽은 내용을 출력
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("파일 경로를 확인해주세요");
			
		}finally {
		
			
		}
		
	}

}
