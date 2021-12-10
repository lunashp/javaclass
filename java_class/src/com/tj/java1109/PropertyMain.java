package com.tj.java1109;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스를 생성
		Properties prop = new Properties();

		//값을 저장
		prop.setProperty("name","luna");
		prop.setProperty("age","24");
		
		//값 읽기 
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("job"));
		
		//파일에 저장
		try {
			//프로젝트가 저장된 디렉토리에 가서 파일을 확인
			FileOutputStream fos =
					new FileOutputStream("./data.txt");
			prop.store(fos,  "comment");
			
			//Properties의 내용을 xml로 저장하기
			fos = new FileOutputStream("./data.xml");
			prop.store(fos, "주석");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


