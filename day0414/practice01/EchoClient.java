package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.35.171", 9001);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			Scanner sc = new Scanner(System.in);
			String msg;
			byte []data = new byte[100];

			while (true) {
				System.out.print("서버로 보낼 문자열을 입력: ");
				msg = sc.next();
				os.write(msg.getBytes());
				
				if (msg.equals("q!")) { // 메시지가 q!를 입력하면 종료
					break;
				}
				is.read(data);
				String reMsg = new String(data);
				System.out.println("서버로부터 메아리 된 메세지: " + reMsg);
				Arrays.fill(data, (byte)0); //데이터를 비워줌.
			}
			
			System.out.println("통신을 종료하였습니다.");
			is.close();
			os.close();
			socket.close();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	} 

}
