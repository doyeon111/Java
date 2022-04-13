package exam03;


//InetAddress에서 list[]  배열을 사용하여 여러 개의 주소를 불러오기 

import java.net.InetAddress;

public class InetAddressTest02 {

	public static void main(String[] args) {

		try {
			InetAddress[] list = InetAddress.getAllByName("www.naver.com"); //getAllByName을 통해서 www.naver.com에 설정된 모든 아이피를 출력
			for (InetAddress addr : list) {
				System.out.println(addr);
			}

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
