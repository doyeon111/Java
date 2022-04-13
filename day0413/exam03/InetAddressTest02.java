package exam03;


//InetAddress���� list[]  �迭�� ����Ͽ� ���� ���� �ּҸ� �ҷ����� 

import java.net.InetAddress;

public class InetAddressTest02 {

	public static void main(String[] args) {

		try {
			InetAddress[] list = InetAddress.getAllByName("www.naver.com"); //getAllByName�� ���ؼ� www.naver.com�� ������ ��� �����Ǹ� ���
			for (InetAddress addr : list) {
				System.out.println(addr);
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
