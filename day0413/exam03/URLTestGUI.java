package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLTestGUI extends JFrame implements ActionListener {
	
	private JFileChooser jfc; //������ ���̾�α׸� ���� ����
	private JTextField jtf; // ����� ���´�
	private JTextArea jta;

	public URLTestGUI() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(50);
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta); // jta�� ������ ��ũ���� �����.

		JButton btnRead = new JButton("�о����");
		JButton btnSave = new JButton("��������");

		// �̺�Ʈ ���
		btnRead.addActionListener(this);
		btnSave.addActionListener(this);

		JPanel p = new JPanel();
		p.add(jtf);
		p.add(btnRead);
		p.add(btnSave);

		add(p, BorderLayout.NORTH); // �гο�
		add(jsp, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new URLTestGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals("�о����")) {
			// �ؽ�Ʈ�ʵ忡 �Է��� URL�� ������ ��� �о�ͼ� �ؽ�Ʈ ����� ����ϵ��� ���α׷��� �ϼ�
			try {

				// �ؽ�Ʈ �ʵ忡 �Է��� �������� URL��ü�� ����
				URL url = new URL(jtf.getText());

				// �� ������ ������ �о���̱� ���� ��Ʈ���� ����
				InputStream is = url.openStream(); // url �� ���½�Ʈ���� ���ؼ� input��Ʈ���� ������ �� �ִ�.

				// �� ���� �о���� byte���� �迭�� �����
				byte[] data = new byte[100]; // �� ���� 100����Ʈ�� �о��

				String str = "";

				while (is.read(data) != -1) {
					str = str + new String(data, "utf-8");
					Arrays.fill(data, (byte) 0);
				}

				// ���� �о���� ���ڿ��� �ؽ�Ʈ����� �����Ѵ�.
				jta.setText(str);

			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}

		} else if (cmd.equals("��������")) {
			try {
				int re = jfc.showSaveDialog(this);
				if(re == JFileChooser.APPROVE_OPTION) { //re==0 �ΰ�?�� �������̴�. // ��������� �Ͽ�����
					File file = jfc.getSelectedFile();
					
					//���ڴ����� ���
					FileWriter fw = new FileWriter(file);
					fw.write(jta.getText());
					fw.close();
					JOptionPane.showMessageDialog(this, "���Ϸ� �����Ͽ����ϴ�.");
				}

			} catch (Exception ex) {
				System.out.println("���ܹ߻�: " + ex.getMessage());
			}

		}

	}

}
