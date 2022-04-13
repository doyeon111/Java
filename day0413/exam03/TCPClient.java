package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 3. �������� ����� ��û�Ѵ�.
			Socket socket = new Socket("192.168.0.2", 9000); // ip�ּҿ� ��Ʈ��ȣ 9000�� (server���� ��������) //cmd���� Ȯ���� �������ּҸ�
																// �����ش�.

			// 5. �����͸� �ְ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 6. �����͸� �ְ�޴´�.
			for(int i=1; i<=10; i++) {
				int n = is.read(); //���ŵ� �����͸� �о��.
				System.out.println("������ ���� ���ŵ� ������: " +n);
				
				Thread.sleep(200);
				
			}
			
			// 7. ����ߴ� �ڿ��� �ݾ��ش�.
			is.close();
			os.close();
			socket.close();	

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
