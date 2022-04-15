package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FileClient extends JFrame implements ActionListener {

	JTextField jtf;
	JFileChooser jfc;

	// ������ ������ ������� ����
	File file;

	// �����͸� �����ϱ� ���� ��Ʈ���� ��������� ����
	OutputStream os;

	public FileClient() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(30);
		JButton btnFile = new JButton("���ϼ���");
		JButton btnSend = new JButton("��������");

		btnFile.addActionListener(this);
		btnSend.addActionListener(this);

		setLayout(new FlowLayout());
		add(jtf);
		add(btnFile);
		add(btnSend);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			// �������� ����� ��û
			Socket socket = new Socket("192.168.35.171", 9005);

			// ������ ������ ���� ��Ʈ���� ����
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals("���ϼ���")) {

			int re = jfc.showOpenDialog(this);

			if (re == JFileChooser.APPROVE_OPTION) {

				// �����ϱ� ���Ͽ� ������ ������ ������� file�� ��Ƶд�.
				file = jfc.getSelectedFile();

				// ������ �����̸��� �ؽ�Ʈ�ʵ忡 ���
				jtf.setText(file.getName());
			}

		} else if (cmd.equals("��������")) {
			try {
				// ������ ������ �޸𸮷� �о���̱� ���� FileInputStream ��ü�� ����
				FileInputStream fis = new FileInputStream(file);

				// ������ ������ �о���̱� ���� �迭�� �����.
				byte[] data = new byte[200];

				// ������ ���� �ƴ� �� ���� �о���δ�
				while (fis.read(data) != -1) {
					// �о���� ������ ��Ʈ���� ���� ������ ������.
					os.write(data);

					// ���� �����͸� ���Ͽ� �迭�� ����ش�.
					Arrays.fill(data, (byte) 0);
				}
				// �������� ���� ������ �ݾ��ش�.
				fis.close();
				
				JOptionPane.showMessageDialog(this, "������ �����Ͽ����ϴ�.");

			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}
		}

	}

	public static void main(String[] args) {
		new FileClient();

	}

}
