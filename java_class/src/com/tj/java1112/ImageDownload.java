package com.tj.java1112;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.allkpop.com/upload/2021/10/content/062007/1633565229-d2-1.jpg");
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//이미지 파일이므로 BufferedInputStream 생성
			BufferedInputStream bis = 
					new BufferedInputStream(con.getInputStream());
			//파일에 기록할 스트림을 생성
			PrintStream ps = new PrintStream("./d and e.jpg");
			while(true) {
				byte [] b = new byte[512];
				//버퍼 크기 만큼 읽기
				int len = bis.read(b);
				//읽은 데이터가 없으면 종료
				if(len <=0) {
					break;
				}
				//읽은 데이터를 기록 - 읽은 만큼만 기록
				ps.write(b,0,len);
			}
			ps.flush();
			ps.close();
			bis.close();
			con.disconnect();
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		

	}

}
