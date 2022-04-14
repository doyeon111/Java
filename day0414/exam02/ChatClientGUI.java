package exam02;

import java.awt.BorderLayout;
//ä��â
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements ActionListener {

	// ��ȭ������ �Է��� �ؽ�Ʈ�ʵ带 ��������� ����
	JTextField jtf;

	// ������ �޾Ƹ� �� ��ȭ������ ����Ͽ� �����Ͽ� �����ֱ� ���� TextArea�� ��������� ����
	JTextArea jta;

	// ������ ��������� �����.
	Socket socket;

	// �����͸� �ְ� ���� ��Ʈ���� ��������� ����
	InputStream is;
	OutputStream os;

	public ChatClientGUI() {

		try {
			// ������ ����� ��û
			socket = new Socket("192.168.35.171", 9001);

			// �����͸� �ְ���� ��Ʈ���� ����
			is = socket.getInputStream();
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

		// ����������� ����
		jtf = new JTextField(40);

		jta = new JTextArea(80, 50);

		// �ؽ�Ʈ ����� ��ũ�ѹٸ� ���Ͽ� ��ũ�������� ���Ѵ�.
		JScrollPane jsp = new JScrollPane(jta);

		// "����"�� ���� ��ư�� �����
		JButton btnSend = new JButton("����");

		// ��ư�� �̺�Ʈ�� ���
		btnSend.addActionListener(this);

		// �ؽ�Ʈ�ʵ�� ��ư�� ��� �г� �����
		JPanel p = new JPanel();

		// �гο� �ؽ�Ʈ�ʵ带 ��´�.
		p.add(jtf);

		// �гο� ��ư�� ��´�.
		p.add(btnSend);

		// �������� ����� �ؽ�Ʈ����� ���ΰ� �ִ� ��ũ������ ��´�.
		add(jsp, BorderLayout.CENTER);

		// �������� �Ʒ��ʿ� �ؽ�Ʈ�ʵ�� ��ư�� ��� �г��� ��´�.
		add(p, BorderLayout.SOUTH);

		// �������� ũ�⸦ �����ش�.
		setSize(600, 400);

		// �������� ȭ�鿡 �����ֵ��� ����
		setVisible(true);

		// 'X" ���߸� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �����κ��� ���ŵǴ� �����͸� ����Ͽ� �ޱ����� Ŭ������ ������� ����
		class ClientThread extends Thread {
			// run�� �������̵�
			public void run() {
				// �����κ��� ���ŵǴ� �����͸� �ޱ� ���� �迭�� �����.
				byte[] data = new byte[100];

				// ��� ����
				while (true) {
					try {
						// inputstream�� ���� �����κ��� ���ŵǴ� �����͸� �޴´�.
						is.read(data);

						// ���ŵ� �����͸� ���ڿ��� �����.
						String reMsg = new String(data);

						// ���ŵ� ���ڿ��� ��ȭ������ ������ �ؽ�Ʈ����� �߰�
						jta.append(reMsg + "\n");

					} catch (Exception e) {
						System.out.println("���ܹ߻�: " + e.getMessage());
					}
				} // end while
			} // end run
		} // end Thread

		// �����κ��� ���ŵǴ� �����͸� ����Ͽ� �޴� Ŭ���̾�Ʈ ������ ��ü�� ����
		Thread t = new ClientThread();

		// ������ ����
		t.start();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// �ؽ�Ʈ�ʵ忡 ������ ���ڸ� �����´�.
		String msg = jtf.getText();

		try {

			// ��½�Ʈ���� ���� �����͸� ������ ������.
			// �����͸� ���� ���� ���ڿ��� ����Ʈ�� �迭�� ��ȯ�Ͽ� ������.
			os.write(msg.getBytes());

			// ���࿡ �Է��� ���ڿ��� q! �̸� ���α׷��� ����
			if (msg.equals("q!")) {
				System.exit(0);
			}

			// ���������� �Է��� ���Ͽ� �ؽ�Ʈ�ʵ带 ����ش�.
			jtf.setText("");

		} catch (Exception ex) {
			System.out.println("���ܹ߻�: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// �������� ����
		new ChatClientGUI();

	}

}
