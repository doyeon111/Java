package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class LottoTCPServer {

	public static void main(String[] args) {

		Random r = new Random(); // ���� ����

		try {
			// 1. ServerSocket�� �����Ѵ�.
			ServerSocket server = new ServerSocket(9000);

			int []data = new int[6];
			
			
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
				for (int i = 0; i <= data.length; i++) {

					// 0���� 100������ ������ ������.
					int n = r.nextInt(45) + 1;

					int j;
					for(j=0; j<i; j++) { 
						if(n == data[j]) { //�տ� ���ڿ� �ߺ��� ���� �ִ��� �Ǻ� �� ���� ���� ������ Ż��
							break;
						}
					}
					
					if(data[j] == data[i]) {
						data[i] = n;
						i++;	
					}
					
					for(i=0; i<data.length; i++) {
						System.out.println("��õ�� �ζǹ�ȣ: " +data[i]);
					}

					// ������� ������ Ŭ���̾�Ʈ���� ������.
					os.write(n); // ������ ������

					Thread.sleep(200); // 0.2�� ������ ���ð�

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
