package practice768;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

public class Practice06Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("서버프로그램입니다.");
			while(true) {
				Socket socket = server.accept();
				System.out.println("연결되었습니다.");
				System.out.println("-----------------------------------------------------");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				byte []data= new byte[100];
				
				while(true) {
					is.read(data); //데이터를 받은 것
					String msg = new String(data);
					System.out.println("클라이언트가 전송한 텍스트: " +msg);
					
					String msg_U = msg.toUpperCase(); //입력받은 문자를 모두 대문자로 바꿈 toUpperCase
					
					if(msg.trim().equals("q!")) {
						break;
					}
					os.write(data); //데이터를 받은 것을 그대로 내보내는 것 ==> 메아리
					System.out.println("클라이언트가 보낸 텍스트: " +msg_U);
					Arrays.fill(data, (byte)0); //데이터를 비워줌.
				}
				
				System.out.println("클라이언트와 연결을 종료하였습니다.");
				System.out.println("-------------------------------------------------------");
				
				is.close();
				os.close();
				socket.close();
			}
			
			
			
		} catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
