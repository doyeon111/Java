package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread {

	// Ŭ���̾�Ʈ�� ����� ������ ����� ���´�.
	Socket socket;

	// ������� ���� ��Ʈ���� ����� ���´�
	InputStream is;
	OutputStream os;

	// ���� �ÿ� ��û�� Ŭ���̾�Ʈ�� ����� ������ ���޹޴´�.
	public ServerThread(Socket socket) {
		this.socket = socket;

		try {
			//7. �����͸� �ְ���� ��Ʈ���� ����
			is = this.socket.getInputStream();
			os = this.socket.getOutputStream();
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}
	
	//����Ͽ� ����� �� �޼ҵ�� run�� �������̵��Ͽ� �� �ȿ� ������ ���ش�.
	public void run() {
		
		//Ŭ���̾�Ʈ�� �������� ������ �ޱ����� �迭�� �����.
		byte []data = new byte[200];
		
		//Ŭ���̾�Ʈ�� ������ ������ �����ϱ� ���� ���ڿ� ������ ����
		String str;
		
		//�빮�ڷ� ��ȯ�ؼ� ���� ������ ����
		String upperStr;
		
		//��� ����
		while(true) {
			try {
			
			//Ŭ���̾�Ʈ�� �������� ������� �޴´�.
			is.read(data);
			
			//�޾ƿ� �����͸� ���ڿ��� �����.
			str = new String(data);
			
			System.out.println("Ŭ���̾�Ʈ�� ������ �ؽ�Ʈ: "+ str);
			
			//�޾ƿ� ���ڿ��� �빮�ڷ� ����
			upperStr = str.toUpperCase();
			
			//�빮�ڷ� ����� �����͸� Ŭ���̾�Ʈ�� ��������.
			os.write(upperStr.getBytes());
			System.out.println("Ŭ���̾�Ʈ�� ���� �ؽ�Ʈ: " + upperStr);
			
			//���� ������ ������ ���Ͽ� �迭�� �����
			Arrays.fill(data, (byte)0);
			
			} catch(Exception e) {
				System.out.println("���ܹ߻�: " + e.getMessage());
			}
			
		}
	}
}

public class UpperServer {

	public static void main(String[] args) {

		
		System.out.println("���� ���α׷��Դϴ�.");
		try {
			// 1. TCP����� ����� ���Ͽ� ���������� ����
			ServerSocket server = new ServerSocket(9006);

			// 2. Ŭ���̾�Ʈ�� ������ ���Ͽ� ���Ѵ����¿� �ִ�.
			while (true) {
				// 4. Ŭ���̾�Ʈ�� ������ ����
				// accept �޼ҵ�� ��û�� Ŭ���̾�Ʈ�� ����� ���� ������ ��ȯ
				Socket socket = server.accept();

				System.out.println("����Ǿ����ϴ�.");
				
				// 5. ��û�� Ŭ���̾�Ʈ�� ����� �����带 ����
				Thread t = new ServerThread(socket);
				
				//6. �����带 �����Ѵ�.
				t.start();
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
