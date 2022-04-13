package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class LottoTCPServer {

	public static void main(String[] args) {

		Random r = new Random(); // 랜덤 생성

		try {
			// 1. ServerSocket을 생성한다.
			ServerSocket server = new ServerSocket(9000);

			int []data = new int[6];
			
			
			// 2. 클라이언트의 접속이 있을 때 까지 무한 대기상태
			while (true) {
				// 4. 클라이언트의 접속을 수락한다. (반환하는 메소드 Socket)
				Socket socket = server.accept(); // 소켓 객체를 반환한다.
				System.out.println("** 클라이언트가 연결하였습니다. **");

				// 5. 데이터를 주고받을 스트림을 생성
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				
				
				// 6. 데이터를 주고받는다.
				// 연결한 클라이언트한테 정수 난수 10개를 만들어 보내주도록 하자.
				for (int i = 0; i <= data.length; i++) {

					// 0에서 100사이의 난수를 만들자.
					int n = r.nextInt(45) + 1;

					int j;
					for(j=0; j<i; j++) { 
						if(n == data[j]) { //앞에 숫자와 중복된 값이 있는지 판별 후 같은 값이 있으면 탈출
							break;
						}
					}
					
					if(data[j] == data[i]) {
						data[i] = n;
						i++;	
					}
					
					for(i=0; i<data.length; i++) {
						System.out.println("추천할 로또번호: " +data[i]);
					}

					// 만들어진 난수를 클라이언트한테 보낸다.
					os.write(n); // 정수를 내보냄

					Thread.sleep(200); // 0.2초 정도의 대기시간

				}

				System.out.println("클라이언트에게 데이터를 모두 내보냈습니다.");

				// 7. 사용했던 자원을 닫아준다.
				is.close();
				os.close();
				socket.close();
			}

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
