package com.tj.java1112;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {

	public static void main(String[] args) {
		//UDP 전송에 사용할 데이터
		DatagramPacket packet = null;
		//Multicast 전송에 사용할 소켓
		MulticastSocket socket = null;
		try {
			//MulticastSocket 인스턴스 생성
			socket = new MulticastSocket(10000);
			//참여할 IP생성
			InetAddress address = InetAddress.getByName("224.128.1.5");
			//그룹에 참여
			socket.joinGroup(address);
			
			//무한 반복해서 읽기
			while(true) {
				byte [] b = new byte [256];
				packet = new DatagramPacket(b, b.length);
				socket.receive(packet);
				//데이터 해석
				String msg = new String(b, 0, packet.getLength());
				System.out.println(msg);
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			socket.close();
		}
		

	}

}
