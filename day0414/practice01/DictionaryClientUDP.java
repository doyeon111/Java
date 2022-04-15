package practice01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryClientUDP {

	public static void main(String[] args) {
		try {
			// UDP방식의 데이터를 주고 받을 데이터그램소켓 객체를 생성
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("*** 클라이언트가 준비되었습니다. ***");

			// 키보드 입력을 위한 스캐너 객체를 생성
			Scanner sc = new Scanner(System.in);

			// 사용자로부터 영어단어 입력을 위한 변수를 선언
			String eng;

			// 서버로부터 번역되어 수신된 한국어를 저장하기 위한 변수를 선언
			String kor;

			// UDP방식의 데이터 전송단위인 데이터그램패킷 변수를 선언
			DatagramPacket packet = null;
			
			 
			//수신된 데이터를 저장하기 위한 배열을 선언
			byte []data = new byte[100];
			
			//서버로부터 번역된 한국어를 수신하기 위한 데이터를 받을 패킷을 생성
			DatagramPacket rePacket = new DatagramPacket(data, data.length);

			// 패킷을 생성할 때에 필요한 InetAddress 객체를 생성
			InetAddress addr = InetAddress.getByName("192.168.35.171");

			// 패킷을 생성할 때에 필요한 포트번호를 변수에 저장
			int port = 9004;

			// 계속반복하여 실행
			while (true) {
				// 사용자한테 번역할 영어단어를 입력받는다.
				System.out.print("번역할 영어단어를 입력하세요: ");
				eng = sc.next();

				// 입력받은 영어단어와, 목적지 주소, 포트번호를 갖고 UDP방식의 데이터 전송단위인 패킷을 생성
				packet = new DatagramPacket(eng.getBytes(), eng.getBytes().length, addr, port);

				// 생성된 패킷을 서버로 보낸다.
				socket.send(packet);

				// 만약, 입력한 영어단어가 "q!"이면 종료
				if (eng.equals("q!")) {
					break;
				}
				
				//서버로부터 번역한 한국어를 수신한다.
				socket.receive(rePacket);
				
				//수신된 데이터가 담긴 배열을 갖고 문자열을 생성
				kor = new String(data);
				
				//번역한 한국어를 출력한다.
				System.out.println("서버로부터 번역하여 수신한 데이터: " + kor);
				
				//다음 데이터 수신을 위하여 배열을 비워준다.
				Arrays.fill(data, (byte)0);
			}
			socket.close();
			System.out.println("***종료하였습니다.***");

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
