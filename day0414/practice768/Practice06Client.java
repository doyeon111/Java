package practice768;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Practice06Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.35.171", 9001);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			Scanner sc = new Scanner(System.in);
			String msg;
			byte []data = new byte[100];

			while (true) {
				System.out.print("������ ������ �ؽ�Ʈ: ");
				msg = sc.next();
				os.write(msg.getBytes());
				
				if (msg.equals("q!")) { // �޽����� q!�� �Է��ϸ� ����
					break;
				}
				is.read(data);
				String reMsg = new String(data);
				String msg_U = msg.toUpperCase(); //�Է¹��� ���ڸ� ��� �빮�ڷ� �ٲ� toUpperCase
				System.out.println("�����κ��� ���۵� �ؽ�Ʈ: " + msg_U);
				Arrays.fill(data, (byte)0); //�����͸� �����.
			}
			
			System.out.println("����� �����Ͽ����ϴ�.");
			is.close();
			os.close();
			socket.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}


	}

}
