package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class EchoServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println(" ** 서버가 가동되었습니다. **");
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결하였습니다.");
				System.out.println("-----------------------------------------------------");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				byte []data= new byte[100];
				
				while(true) {
					is.read(data); //데이터를 받은 것
					String msg = new String(data);
					
					if(msg.trim().equals("q!")) {
						break;
					}
					os.write(data); //데이터를 받은 것을 그대로 내보내는 것 ==> 메아리
					System.out.println("클라이언트로 수신한 데이터: " +msg + "다시 메아리 하였습니다.");
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
