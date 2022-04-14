package practice768;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

public class Practice06Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("�������α׷��Դϴ�.");
			while(true) {
				Socket socket = server.accept();
				System.out.println("����Ǿ����ϴ�.");
				System.out.println("-----------------------------------------------------");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				byte []data= new byte[100];
				
				while(true) {
					is.read(data); //�����͸� ���� ��
					String msg = new String(data);
					System.out.println("Ŭ���̾�Ʈ�� ������ �ؽ�Ʈ: " +msg);
					
					String msg_U = msg.toUpperCase(); //�Է¹��� ���ڸ� ��� �빮�ڷ� �ٲ� toUpperCase
					
					if(msg.trim().equals("q!")) {
						break;
					}
					os.write(data); //�����͸� ���� ���� �״�� �������� �� ==> �޾Ƹ�
					System.out.println("Ŭ���̾�Ʈ�� ���� �ؽ�Ʈ: " +msg_U);
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
