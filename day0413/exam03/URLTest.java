package exam03;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {

	public static void main(String[] args) {
		try {

			// 인터넷 상의 문서객체를 생성
			URL url = new URL("http://hanbit.co.kr/store/books/new_book_list.html"); // 한빛출판사의 새로나온책 페이지의 경로

			// 그 문서의 내용을 읽어들이기 위한 스트림을 생성
			InputStream is = url.openStream(); // url 의 오픈스트림을 통해서 input스트림을 생성할 수 있다.

			// 한 번에 읽어들일 byte형의 배열을 만들기
			byte[] data = new byte[100]; // 한 번에 100바이트씩 읽어옴

			// 스트림을 통해 읽어온 문자열을 다 모아놓을 변수를 만든다.
			String str = ""; // 초기화

			// 계속 반복실행한다.
			while (true) {

				// 스트림을 통해 데이터를 읽어들인다.
				int re = is.read(data);

				// 더 이상 읽어들일 것이 없으면 반복문을 탈출
				if (re == -1) {
					break;
				}

				// 읽어들인 data를 문자열로 만들어 누적한다.
				str = str + new String(data, "utf-8"); //인코딩 방식을 utf-8으로 해준다.
				
				
				//다시 읽어들이기 위하여 배열을 비워준다. (맨 뒤에 쓰레기값이 출력되기 때문에 배열을 비워줘야함)
				//배열을 비워주기 위하여 0으로 모두 채운다.
				Arrays.fill(data, (byte)0); //byte형으로 캐스팅하여 담아준다.
			}

			// 누적된 전체문자열을 출력
			System.out.println(str);

			// 사용이 끝난 스트림을 닫아준다.
			is.close();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
