package com.tj.java1111;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStream {

	public static void main(String[] args) {
		//문자 단위로 기록 = 버퍼를 사용: PrintWriter
		//파일의 경로를 설정 - 현재 디렉토리에 blue moon.txt
		PrintWriter pr = null;
		try {
			//스트림을 생성 
			pr = new PrintWriter("./blue moon.txt");
			String msg="태양계 어딘가에 떠돌고 있는\n우리 둘 만의 paradise";
			//기록
			pr.write(msg);
			//내용이 많을 때는 마지막 내용이 기록이 안 될 수 있으므로 버퍼를 비워줍니다.
			pr.flush();
			
		}catch(Exception e) {
			//현재 시간을 문자열로 만들기 
			Date date = new Date();
			SimpleDateFormat sdf =
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String time = sdf.format(date);
			System.out.println(time + "파일의 경로를 확인하세요");
			//서버에서는 메시지를 파일이나 데이터베이스에 기록 - 시간과 함께
		}finally {
			pr.close();
			
		}
		/*
		//줄 단위로 읽어서 바로 출력하지 않고 변수에 저장
		String data = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line ==null) {
				break;
			}
			//문자열에 문자열을 +로 결합하면 메모리 낭비가 발생할 수 있습니다.
			//data = data + line + "\n";
			
			//StringBuilder를 이용해서 추가
			sb.append(line);
			sb.append("\n");
		}
		//문자열로 변환
		data = sb.toString();
		System.out.println(data);
			}
		}
	*/

	}
}


	
