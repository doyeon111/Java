package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//0414 ���� 8��
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer2 extends JFrame {
	// �̹����� ǥ���ϱ� ���� ���� ��������� ����
	JLabel label;

	// ���� �̹����� ǥ���ϱ� ���Ͽ� �̹��� �������� �ʿ��ϴ�
	ImageIcon icon;

	public FileServer2() {
		// �̹��� ������ ��ü�� ����
		icon = new ImageIcon("flower.png");

		// �̹��� ������ ��ü�� ���� ���� ����
		label = new JLabel(icon);

		// ���� �������� ����� ��´�.
		add(label, BorderLayout.CENTER);

		JButton btn = new JButton("�̹��� �ٲٱ�");
		add(btn, BorderLayout.SOUTH);

		// �̸����� InnerŬ����(�͸�Ŭ����)�� ���ؼ� �̺�Ʈ ó��
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �̹��� �������� �ٽø����.
				icon = new ImageIcon("enemy.png");

				// �ٽ� ������� �̹��� �������� �󺧿� ����
				label.setIcon(icon);
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FileServer2();

	}

}
