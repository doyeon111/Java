package practice01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

//0414 ���� 2��
public class DictionaryServer {

	public static void main(String[] args) {
		// ����ܾ Ű���ϰ�, �ѱ�� ������ �ϴ� map�� ����
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");

		try {
			// TCP����� ����� ���Ͽ� ���������� ����
			ServerSocket server = new ServerSocket(9003);

			System.out.println("**������ �����Ǿ����ϴ�.**");

			// Ŭ���̾�Ʈ�� �������� �����͸� �ޱ� ���� �迭�� �����.
			byte[] data = new byte[100];

			// Ŭ���̾�Ʈ�� ������ ����
			Socket socket = server.accept();

			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			System.out.println("--------------------------------------------------");

			// �����͸� �ְ�ޱ� ���� ��Ʈ���� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// Ŭ���̾�Ʈ �����µ����͸� �ޱ� ���Ͽ� ���ѷ����� ǥ��
			while (true) {
				// Ŭ���̾�Ʈ�� �������� �����͸� �迭�� �޴´�.
				is.read(data);

				// �޾ƿ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �����.
				String eng = new String(data).trim();

				// ���ŵ� ���ڿ��� q!�̸� ����
				if (eng.equals("q!")) {
					break;
				}

				// ��������� ��� �����κ��� ����ܾ Ű���Ͽ� �ѱ�� �̾ƿ´�.
				String kor = map.get(eng);
				
				//���࿡ ������ ��ϵǾ� ���� ������ "����"�� ����
				if(kor == null) {
					kor = "����";
				}

				// �̾ƿ� �ѱ�� Ŭ���̾�Ʈ�� ��������.
				os.write(kor.getBytes());

				System.out.println(eng + "�� ���� ���� " + kor + "�� �����Ͽ����ϴ�.");

				// ���������� ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte) 0);
			}

			System.out.println("***Ŭ���̾�Ʈ�� ������ ���������ϴ�. ***");
			System.out.println("-----------------------------------------");

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
