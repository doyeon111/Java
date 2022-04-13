package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LottoTCPClient {

	public static void main(String[] args) {
		try {
			// 3. �������� ����� ��û�Ѵ�.
			Socket socket = new Socket("192.168.0.2", 9000); // ip�ּҿ� ��Ʈ��ȣ 9000�� (server���� ��������) //cmd���� Ȯ���� �������ּҸ�
																// �����ش�.
			int []data = new int[6];
			
			// 5. �����͸� �ְ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			
			
			// 6. �����͸� �ְ�޴´�.
			for(int i=0; i<=data.length; i++) {
				int n = is.read(); //���ŵ� �����͸� �о��.
				
				int j;
				for(j=0; j<i; j++) { 
					if(n == data[j]) { //�տ� ���ڿ� �ߺ��� ���� �ִ��� �Ǻ� �� ���� ���� ������ Ż��
						break;
					}
				}
				
				if(j == i) {
					data[i] = n;
					i++;	
				}

				for(i=0; i<data.length; i++) {
				System.out.println("�ζ� ��÷��ȣ: " +n);
				}
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
