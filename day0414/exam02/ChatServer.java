package exam02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

//�� ���� Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �����带 �����.
class ServerThread extends Thread {

	// ������ Ŭ���̾�Ʈ�� ����� ������ ��������� ������.
	Socket socket;

	// �����͸� �ְ���� ��Ʈ���� ��������� ������.
	InputStream is;
	OutputStream os;

	// ���ŵ� �����͸� �ޱ� ���� �迭�� �����.
	byte[] data = new byte[100];

	// ���� �ÿ� ������ ���޹޾Ƽ� ��Ʈ���� ����
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

	// �����尡 �ؾ� �ϴ� ���� run�� �������̵� �Ͽ� �ۼ��Ѵ�.
	public void run() {
		// �Լ� �͸� ���� Ŭ���̾�Ʈ�� �������� �����͸� �޴´�.
		while (true) {
			try {
				// ���� ����� Ŭ���̾�Ʈ�� �������� �����͸� �޴´�.
				is.read(data);

				// ����� ��� Ŭ���̾�Ʈ�鿡�� ����ϴ� �޼ҵ带 ȣ��
				sendAll(data);

				// ���� ������ ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte) 0);

			} catch (Exception e) {
				System.out.println("���ܹ߻�: " + e.getMessage());
			}
		}
	}

	// ��� ����� Ŭ���̾�Ʈ������ ����ϱ� ���� �޼ҵ带 ����
	public void sendAll(byte[] data) throws Exception {
		// ����Ʈ�� ��� ��ü�� �ϳ��� �̾ƿ��� ������ Ŭ���̾�Ʈ�� 1��1�� ����ϴ� ������ ��ü
		// ����Ʈ�� ��� �� ��ŭ �ݺ������Ͽ� �޽����� �ݺ�����
		for (ServerThread st : ChatServer.list) {

			// ������ ��ü�� ��½�Ʈ���� ���Ͽ� �����͸� ��������.
			st.os.write(data);
		}
	}
}

public class ChatServer {
	// ����� Ŭ���̾�Ʈ�� ����� ��������� ��Ƴ��� ����Ʈ�� �����.
	// ��ü�� �����ϰ� ����ϵ��� static���� �����.
	public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println(" ** ������ �����Ǿ����ϴ�. **");

			while (true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				System.out.println("-----------------------------------------------------");

				// ������ Ŭ���̾�Ʈ�� ����� �����带 ����
				ServerThread thread = new ServerThread(socket);

				// Ŭ���̾�Ʈ�� ����Ͽ� ����� �����ϴ� ������ ��ü�� ����Ʈ�� ��´�.
				list.add(thread);

				// Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �̾���� �����带 ������Ų��.
				thread.start();
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
