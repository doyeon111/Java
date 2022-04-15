package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class UpperClient {

	public static void main(String[] args) {
		
		System.out.println("Ŭ���̾�Ʈ ���α׷��Դϴ�.");
		try {
			
			//Ű����κ��� �Է��ϱ� ���� ��ĳ�� ����
			Scanner sc = new Scanner(System.in);

			//�Է¹��� ���� ����
			String str;
			
			//������ �빮�ڷ� ��ȯ�Ͽ� �����ִ� ���ڿ��� �����ϱ� ���� ������ ����
			String upperStr;
			
			//������ �������� �����͸� �������� �迭�� ����
			byte []data = new byte[200];
			
			//3. �������� ����� ��û
			Socket socket = new Socket("192.168.35.171", 9006);
			
			//7. �����͸� �ְ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			
			//8. ��� ����
			while(true) {
				//9. ��������� ����ܾ �Է�
				System.out.print("������� �Է��ϼ���: ");
				str = sc.nextLine();
				
				System.out.println("������ ������ �ؽ�Ʈ: " + str);
				
				
				//10. �Է¹��� ������ �����κ���
				os.write(str.getBytes());
				
				//11. ������ �빮�ڷ� ��ȯ�Ͽ� �����ִ� �����͸� �޴´�.
				is.read(data);
				
				//12. �޾ƿ� �����͸� ���ڿ��� �����.
				upperStr = new String(data);
				
				//13. ȭ�鿡 ���
				System.out.println("�������� ���۵� �ؽ�Ʈ: " + upperStr);
				
				//���� ������ ������ ���Ͽ� �迭�� �����
				Arrays.fill(data, (byte)0);
			}
			
			
			
			
		} catch(Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
