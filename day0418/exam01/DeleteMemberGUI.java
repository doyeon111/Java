package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteMemberGUI extends JFrame implements ActionListener {

	JTextField jtf;

	public DeleteMemberGUI() {
		// â ���� ����
		setTitle("ȸ������");

		// ȭ���� ���̾ƿ��� ������� ��ġ�ϴ� ����� ����
		setLayout(new FlowLayout());

		// �ؽ�Ʈ �ʵ带 ����
		jtf = new JTextField(10);

		// ���� ����
		JLabel label = new JLabel("������ ȸ���� ���̵�: ");

		// ��ư�� ����
		JButton btn = new JButton("����");
		
		//��ư�� �̺�Ʈ�� ���
		btn.addActionListener(this);

		// ���� �����ӿ� ��´�.
		add(label);

		// �ؽ�Ʈ�ʵ带 �����ӿ� ��´�.
		add(jtf);

		// ��ư�� �����ӿ� ��´�.
		add(btn);

		// �������� ũ�⸦ ����
		setSize(450, 300);

		// �������� ���̵��� ����
		setVisible(true);

		// �ݱ��ư�� ������ ���α׷��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ȸ���� ���̵� ������ ����
		String id = jtf.getText();

		// ������ �����ͺ��̽� ��ɾ �����.
		String sql = "delete member where id = '" + id + "'";

		try {
			// jdbc ����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB������ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// �����ͺ��̽� ��ɾ ����
			int re = stmt.executeUpdate(sql);

			if (re == 1) {
				JOptionPane.showMessageDialog(this, "ȸ���� ������ �����Ͽ����ϴ�.");
			} else {
				JOptionPane.showMessageDialog(this, "ȸ���� ���������� �����Ͽ����ϴ�.");

			}

			// ����ߴ� �ڿ��� �ݾ��ش�.
			stmt.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("���ܹ߻�: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		// ������ ����
		new DeleteMemberGUI();

	}

}
