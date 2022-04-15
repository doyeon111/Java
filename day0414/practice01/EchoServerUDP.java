package practice01;
//0414숙제1번
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {

	public static void main(String[] args) {
		try {
			//UDP 방식에서 데이터를 주고받기 위해서는 데이터그램 소켓을 이용
			DatagramSocket socket = new DatagramSocket(9002);
			
			//데이터를 담을 배열을 만든다.
			byte []data = new byte[100];
			
			//UDP 방식에서 데이터를 주고받는 단위인 데이터그램패킷을 생성
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//계속 동작
			while(true) {
				
				//UDP 방식에서 데이터를 주고받는 기능을 갖고있는 데이터그램소켓 객체를 통하여 데이터를 받는다.
				socket.receive(packet);
				
				//받은 데이터를 그대로 메아리한다.
				socket.send(packet);
				
				//수신한 문자열이 q!이면 종료
				String msg = new String(data).trim();
				
				if(msg.equals("q!")) {
					break; 
				}
				
				System.out.println("클라이언트로부터 수신된 데이터: " + msg);
				
				//다음데이터 수신을 위하여 배열을 비워준다.
				Arrays.fill(data, (byte)0);
			}
			
			//사용했던 자원을 닫아준다.
			socket.close();
			
			
			
		}catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
