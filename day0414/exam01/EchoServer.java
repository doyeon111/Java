package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class EchoServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println(" ** ������ �����Ǿ����ϴ�. **");
			while(true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				System.out.println("-----------------------------------------------------");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				byte []data= new byte[100];
				
				while(true) {
					is.read(data); //�����͸� ���� ��
					String msg = new String(data);
					
					if(msg.trim().equals("q!")) {
						break;
					}
					os.write(data); //�����͸� ���� ���� �״�� �������� �� ==> �޾Ƹ�
					System.out.println("Ŭ���̾�Ʈ�� ������ ������: " +msg + "�ٽ� �޾Ƹ� �Ͽ����ϴ�.");
					Arrays.fill(data, (byte)0); //�����͸� �����.
				}
				
				System.out.println("Ŭ���̾�Ʈ�� ������ �����Ͽ����ϴ�.");
				System.out.println("-------------------------------------------------------");
				
				is.close();
				os.close();
				socket.close();
			}
			
			
			
		} catch(Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
