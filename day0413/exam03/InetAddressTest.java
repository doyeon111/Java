package exam03;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			
			InetAddress addr = InetAddress.getByName("www.naver.com"); //���̹� ������ ipadress ������ Ȯ���� �� �ִ�.
			System.out.println(addr);
			
		} catch (Exception e) {
			
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

}
