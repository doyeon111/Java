package practice768;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class DateClient {

	public static void main(String[] args) {
		try {
			// 3. 서버에게 통신을 요청한다.
			Socket socket = new Socket("192.168.35.171", 9000); // ip주소와 포트번호 9000번 (server에서 설정해줌) //cmd에서 확인한 아이피주소를
																// 적어준다.

			// 5. 데이터를 주고받을 스트림을 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			Date today = new Date(); //date을 이용하기 위함
			
			int year = today.getYear() + 1900;
			int month = today.getMonth() + 1; //0~11이기 때문에 + 1을 더해준다.
			int date = today.getDate();
			int hour = today.getHours();
			int minute = today.getMinutes();
			int second = today.getSeconds();
			
			System.out.println(today);
			
			int n = is.read(); //수신된 데이터를 읽어옴.
			
			// 7. 사용했던 자원을 닫아준다. 
			is.close();
			os.close();
			socket.close();	

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
