package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

//TCP���
public class DictionaryClient {

	public static void main(String[] args) {
		try {
			// �������� ����� ��û
			Socket socket = new Socket("192.168.35.171", 9003);

			// �����͸� �ְ�ޱ� ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			Scanner sc = new Scanner(System.in);

			// ����ܾ �Է¹ޱ� ���� ������ ����
			String eng;
			
			//�ѱ���� ������ �ܾ �����ϱ� ���� ������ ����
			String kor;
			
			//������ �����Ͽ� �������� �����͸� �ޱ� ���� �迭�� �����.
			byte []data = new byte[100];

			// ��� ����
			while (true) {
				// ��������� ����ܾ �Է¹���
				System.out.print("����ܾ �Է��ϼ���");
				eng = sc.next();

				// �Է¹��� ����ܾ ������ ������,
				os.write(eng.getBytes());

				// ����, �Է¹��� ����ܾ q!�̸� ����
				if (eng.equals("q!")) {
					break;
				}
				//������ �������� �ѱ���� ������ �����͸� �޾ƿ´�.
				is.read(data);
				
				//�޾ƿ� �����Ͱ� �ִ� �迭�� ������ ���ڿ��� �����.
				kor = new String(data);
				
				//ȭ�鿡 ���
				System.out.println("�����κ��� ���ŵ� �������: " + kor);
				
				//���� ������ ������ ���Ͽ� �迭�� ����д�.
				Arrays.fill(data, (byte)0);
				
				
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
