package exam01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//0414 과제 8번
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer extends JFrame {

	// 두 개의 배열을 매개변수로 전달받아 하나로 합쳐서 새로운 배열을 반환하는 메소드를 정의
	public static byte[] addArray(byte[] a, byte[] b) {
		byte[] r = new byte[a.length + b.length];

		// a배열의 요소를 r에 넣어준다.
		// a배열의 인덱스와 새로합칠 배열의 인덱스는 달라야한다.
		// 새로 합칠 배열의 인덱스를 선언
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			r[k++] = a[i];
		}
		// b배열의 모든 요소를 r에 담아준다.
		for (int i = 0; i < b.length; i++) {
			r[k++] = b[i];
		}

		return r;
	}

	// 통신을 위하여 서버소켓을 멤버변수로 선언
	ServerSocket server;

	// 이미지를 표현하기 위한 라벨을 멤버변수로 선언
	JLabel label;

	// 라벨의 이미지를 표현하기 위하여 이미지 아이콘이 필요하다
	ImageIcon icon;

	public FileServer() {
		// 이미지 아이콘 객체를 생성
		icon = new ImageIcon("flower.png");

		// 이미지 아이콘 객체를 갖고 라벨을 생성
		label = new JLabel(icon);

		// 라벨을 프레임에 담는다.
		add(label);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			// 서버 소켓을 생성
			server = new ServerSocket(9005);

			// 클라이언트의 접속을 무한대기상태로 기다린다.
			while (true) {
				// 클라이언트의 요청을 수락
				Socket socket = server.accept();

				// 클라이언트가 보내오는 데이터를 받기 위한 스트림을 생성
				InputStream is = socket.getInputStream();

				// 데이터를 한번에 받기 위한 배열을 선언
				byte[] data = new byte[200];

				// 전체 데이터를 누적하기 위한 배열을 선언
				byte[] all_data = null;

				// 클라이언트가 보내오는 데이터를 계속 받도록 한다.
				// 파일의 끝이 아닐 때 까지 읽어들인다.
				while (true) {

					// 클라이언트로부터 데이터를 수신, n에는 수신한 바이트 수가 저장
					int n = is.read(data);

					// 메시지 출력
					System.out.println(n + "byte를 읽어들였습니다.");

					// 파일의 끝을 도달하면 종료
					if (n == -1) {
						System.out.println("파일의 끝에 도달하였습니다.");
						break;
					}

					// 맨 첫 번째 읽어들였다면 all_data에 담는다.
					if (all_data == null) {
						all_data = data;
					} else { // 두 번째 이후에 읽어들일 때 부터는 누적
						all_data = addArray(all_data, data);
					}

					System.out.println("합쳐진 배열의 길이: " + all_data.length);

				
					
					
				} //end while_2
				// 파일을 다 읽었으면 라벨에 그림을 표시해준다. 읽어들인 파일의 내용은 all_data에 있다.
				// icon = new ImageIcon(all_data);

				System.out.println("안쪽에 있는 while을 탈출하였습니다.");
				
				// 전체 읽어들인 데이터를 파일로 출력
				FileOutputStream fos = new FileOutputStream("r.png");
				fos.write(all_data);
				fos.close();
				System.out.println("파일을 내려받았습니다.");

				icon = new ImageIcon("r.png");

				// 라벨에 아이콘을 다시 설정
				label.setIcon(icon);

				

			} //end while_1

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		new FileServer();

	}

}
