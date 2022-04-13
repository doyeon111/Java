package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 3. 서버에게 통신을 요청한다.
			Socket socket = new Socket("192.168.0.2", 9000); // ip주소와 포트번호 9000번 (server에서 설정해줌) //cmd에서 확인한 아이피주소를
																// 적어준다.

			// 5. 데이터를 주고받을 스트림을 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 6. 데이터를 주고받는다.
			for(int i=1; i<=10; i++) {
				int n = is.read(); //수신된 데이터를 읽어옴.
				System.out.println("서버로 부터 수신된 데이터: " +n);
				
				Thread.sleep(200);
				
			}
			
			// 7. 사용했던 자원을 닫아준다.
			is.close();
			os.close();
			socket.close();	

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
