package exam03;

import java.net.DatagramPacket;

//UDPSender 192.168.0.2 / 9001  / 안녕?  각각 배열의 0, 1, 2번째
//		    192.168.0.2 / 9001  / 재미있는 자바

import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		try {

			// 프로그램 실행 시에 전달받는 첫 번째는 보내고자 하는 데이터를 수신하는 컴퓨터의 ip주소 이다.
			String ip = args[0];

			// 프로그램 실행 시에 전달받는 두 번째는 약속한 포트번호이다.
			int port = Integer.parseInt(args[1]);

			// 프로그램 실행 시에 전달받는 세 번째는 전달한 내용이다.
			String msg = args[2];

			// 전달할 내용을 바이트로 변환한다.
			byte[] data = msg.getBytes();

			// ip주소를 갖고 InetAddress 객체를 생성
			InetAddress addr = InetAddress.getByName(ip);

			// UDP 방식의 데이터 전송단위인 패킷을 생성
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);

			// 데이터를 전송하기 위한 데이터그램 소켓 객체를 생성
			DatagramSocket socket = new DatagramSocket();

			// 데이터를 전송
			socket.send(packet);

			// 사용했던 자원을 닫아준다.
			socket.close();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
