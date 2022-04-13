package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPReceiver {

	public static void main(String[] args) {
		try {
			// 데이터를 주고받기 위한 소켓객체를 생성
			DatagramSocket socket = new DatagramSocket(9001); // 포트번호 9001번

			// 실제 데이터가 담길 배열을 만든다.
			byte[] data = new byte[100];

			// 수신된 데이터를 받기위한 데이터그램 패킷을 만들어요
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			System.out.println("*** 데이터를 수신할 준비가 되었습니다. ***");
			System.out.println("-----------------------------------------------------");

			// 데이터를 계속하여 받기 위하여 무한 대기상태에 있다.
			while (true) {
				// 수신된 데이터를 받는다.
				socket.receive(packet);

				// 패킷을 만들 때 데이터를 담으려고 한 byte 배열인 data를 문자열로 만든다.
				String msg = new String(data);

				// 수신된 문자열을 화면에 출력
				System.out.println("수신된 데이터: " + msg.trim()); //공백을 제거하고 출력
				
				//다음데이터를 위하여 배열을 초기화함.(남아있는 쓰레기값 지워줌.)
				Arrays.fill(data, (byte)0);

			}

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
