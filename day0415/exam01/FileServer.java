package exam01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//0414 ���� 8��
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer extends JFrame {

	// �� ���� �迭�� �Ű������� ���޹޾� �ϳ��� ���ļ� ���ο� �迭�� ��ȯ�ϴ� �޼ҵ带 ����
	public static byte[] addArray(byte[] a, byte[] b) {
		byte[] r = new byte[a.length + b.length];

		// a�迭�� ��Ҹ� r�� �־��ش�.
		// a�迭�� �ε����� ������ĥ �迭�� �ε����� �޶���Ѵ�.
		// ���� ��ĥ �迭�� �ε����� ����
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			r[k++] = a[i];
		}
		// b�迭�� ��� ��Ҹ� r�� ����ش�.
		for (int i = 0; i < b.length; i++) {
			r[k++] = b[i];
		}

		return r;
	}

	// ����� ���Ͽ� ���������� ��������� ����
	ServerSocket server;

	// �̹����� ǥ���ϱ� ���� ���� ��������� ����
	JLabel label;

	// ���� �̹����� ǥ���ϱ� ���Ͽ� �̹��� �������� �ʿ��ϴ�
	ImageIcon icon;

	public FileServer() {
		// �̹��� ������ ��ü�� ����
		icon = new ImageIcon("flower.png");

		// �̹��� ������ ��ü�� ���� ���� ����
		label = new JLabel(icon);

		// ���� �����ӿ� ��´�.
		add(label);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			// ���� ������ ����
			server = new ServerSocket(9005);

			// Ŭ���̾�Ʈ�� ������ ���Ѵ����·� ��ٸ���.
			while (true) {
				// Ŭ���̾�Ʈ�� ��û�� ����
				Socket socket = server.accept();

				// Ŭ���̾�Ʈ�� �������� �����͸� �ޱ� ���� ��Ʈ���� ����
				InputStream is = socket.getInputStream();

				// �����͸� �ѹ��� �ޱ� ���� �迭�� ����
				byte[] data = new byte[200];

				// ��ü �����͸� �����ϱ� ���� �迭�� ����
				byte[] all_data = null;

				// Ŭ���̾�Ʈ�� �������� �����͸� ��� �޵��� �Ѵ�.
				// ������ ���� �ƴ� �� ���� �о���δ�.
				while (true) {

					// Ŭ���̾�Ʈ�κ��� �����͸� ����, n���� ������ ����Ʈ ���� ����
					int n = is.read(data);

					// �޽��� ���
					System.out.println(n + "byte�� �о�鿴���ϴ�.");

					// ������ ���� �����ϸ� ����
					if (n == -1) {
						System.out.println("������ ���� �����Ͽ����ϴ�.");
						break;
					}

					// �� ù ��° �о�鿴�ٸ� all_data�� ��´�.
					if (all_data == null) {
						all_data = data;
					} else { // �� ��° ���Ŀ� �о���� �� ���ʹ� ����
						all_data = addArray(all_data, data);
					}

					System.out.println("������ �迭�� ����: " + all_data.length);

				
					
					
				} //end while_2
				// ������ �� �о����� �󺧿� �׸��� ǥ�����ش�. �о���� ������ ������ all_data�� �ִ�.
				// icon = new ImageIcon(all_data);

				System.out.println("���ʿ� �ִ� while�� Ż���Ͽ����ϴ�.");
				
				// ��ü �о���� �����͸� ���Ϸ� ���
				FileOutputStream fos = new FileOutputStream("r.png");
				fos.write(all_data);
				fos.close();
				System.out.println("������ �����޾ҽ��ϴ�.");

				icon = new ImageIcon("r.png");

				// �󺧿� �������� �ٽ� ����
				label.setIcon(icon);

				

			} //end while_1

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		new FileServer();

	}

}
