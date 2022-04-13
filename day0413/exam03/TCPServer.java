package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {

	public static void main(String[] args) {
		
		Random r = new Random(); //���� ����
		

		try {
			// 1. ServerSocket�� �����Ѵ�.
			ServerSocket server = new ServerSocket(9000);

			// 2. Ŭ���̾�Ʈ�� ������ ���� �� ���� ���� ������
			while (true) {
				// 4. Ŭ���̾�Ʈ�� ������ �����Ѵ�. (��ȯ�ϴ� �޼ҵ� Socket)
				Socket socket = server.accept(); // ���� ��ü�� ��ȯ�Ѵ�.
				System.out.println("** Ŭ���̾�Ʈ�� �����Ͽ����ϴ�. **");

				// 5. �����͸� �ְ���� ��Ʈ���� ����
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// 6. �����͸� �ְ�޴´�.
				// ������ Ŭ���̾�Ʈ���� ���� ���� 10���� ����� �����ֵ��� ����.
				for(int i=1; i<=10; i++) {
					
					
					//0���� 100������ ������ ������.
					int n = r.nextInt(100);
					
					System.out.println("�������� ������ ��������ϴ�. " + n);
					
					
					//������� ������ Ŭ���̾�Ʈ���� ������.
					os.write(n); //������ ������
					
					Thread.sleep(200); //0.2�� ������ ���ð�
					
				}
				
				System.out.println("Ŭ���̾�Ʈ���� �����͸� ��� �����½��ϴ�.");
				
				// 7. ����ߴ� �ڿ��� �ݾ��ش�.
				is.close();
				os.close();
				socket.close();
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
