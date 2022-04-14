package practice768;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class DateClient {

	public static void main(String[] args) {
		try {
			// 3. �������� ����� ��û�Ѵ�.
			Socket socket = new Socket("192.168.35.171", 9000); // ip�ּҿ� ��Ʈ��ȣ 9000�� (server���� ��������) //cmd���� Ȯ���� �������ּҸ�
																// �����ش�.

			// 5. �����͸� �ְ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			Date today = new Date(); //date�� �̿��ϱ� ����
			
			int year = today.getYear() + 1900;
			int month = today.getMonth() + 1; //0~11�̱� ������ + 1�� �����ش�.
			int date = today.getDate();
			int hour = today.getHours();
			int minute = today.getMinutes();
			int second = today.getSeconds();
			
			System.out.println(today);
			
			int n = is.read(); //���ŵ� �����͸� �о��.
			
			// 7. ����ߴ� �ڿ��� �ݾ��ش�.
			is.close();
			os.close();
			socket.close();	

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
