package com.tj.java1112;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {
		
		
		try {
			//자신의 컴퓨터 IP 정보
			InetAddress localhost;
			localhost = InetAddress.getLocalHost();
			System.out.print(localhost);
			
			//naver의 IP정보
			InetAddress [] naver = InetAddress.getAllByName("www.naver.com");
			for(InetAddress n : naver) {
				System.out.println("naver:" + n.toString());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	

	}

}
