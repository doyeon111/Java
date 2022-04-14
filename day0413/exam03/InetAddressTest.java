package exam03;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			
			InetAddress addr = InetAddress.getByName("www.naver.com"); //네이버 닷컴의 ipadress 정보를 확인할 수 있다.
			System.out.println(addr);
			
		} catch (Exception e) {
			
			System.out.println("예외발생: " + e.getMessage());
		}
	}

}
 
