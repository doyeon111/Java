package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

//TCP방식
public class DictionaryClient {

	public static void main(String[] args) {
		try {
			// 서버에게 통신을 요청
			Socket socket = new Socket("192.168.35.171", 9003);

			// 데이터를 주고받기 위한 스트림을 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			Scanner sc = new Scanner(System.in);

			// 영어단어를 입력받기 위한 변수를 선언
			String eng;
			
			//한국어로 번역한 단어를 저장하기 위한 변수를 선언
			String kor;
			
			//서버가 번역하여 보내오는 데이터를 받기 위한 배열을 만든다.
			byte []data = new byte[100];

			// 계속 실행 
			while (true) {
				// 사용자한테 영어단어를 입력받음
				System.out.print("영어단어를 입력하세요");
				eng = sc.next();

				// 입력받은 영어단어를 서버로 보낸다,
				os.write(eng.getBytes());

				// 만약, 입력받은 영어단어가 q!이면 종료
				if (eng.equals("q!")) {
					break;
				}
				//서버가 보내오는 한국어로 번역한 데이터를 받아온다.
				is.read(data);
				
				//받아온 데이터가 있는 배열을 가지고 문자열을 만든다.
				kor = new String(data);
				
				//화면에 출력
				System.out.println("서버로부터 수신된 번역결과: " + kor);
				
				//다음 데이터 수신을 위하여 배열을 비워둔다.
				Arrays.fill(data, (byte)0);
				
				
			}
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
