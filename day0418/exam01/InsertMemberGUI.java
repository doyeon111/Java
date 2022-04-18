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

public class InsertMemberGUI extends JFrame implements ActionListener {

	JTextField jtf_id, jtf_name, jtf_age;

	public InsertMemberGUI() {
		// â ���� ����
		setTitle("ȸ�����");

		// ȭ���� ���̾ƿ��� ������� ��ġ�ϴ� ����� ����
		setLayout(new FlowLayout());

		// �ؽ�Ʈ �ʵ带 ����
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_age = new JTextField(10);

		// ���� ����
		JLabel id_label = new JLabel("���̵�: ");
		JLabel name_label = new JLabel("�̸�: ");
		JLabel age_label = new JLabel("����: ");

		// ��ư�� ����
		JButton btn = new JButton("���");

		// ��ư�� �̺�Ʈ�� ���
		btn.addActionListener(this);

		// ���� �����ӿ� ��´�.
		add(id_label);
		add(jtf_id);

		add(name_label);
		add(jtf_name);

		add(age_label);
		add(jtf_age);

		// ��ư�� �����ӿ� ��´�.
		add(btn);

		// �������� ũ�⸦ ����
		setSize(800, 300);

		// �������� ���̵��� ����
		setVisible(true);

		// �ݱ��ư�� ������ ���α׷��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ȸ���� ���̵� ������ ����
		String id = jtf_id.getText();
		String name = jtf_name.getText();
		int age = Integer.parseInt(jtf_age.getText());

		// ������ �����ͺ��̽� ��ɾ �����.
		String sql = "insert into member values('" + id + "', '" + name + "', " + age + ")";

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
				JOptionPane.showMessageDialog(this, "ȸ���� ������ �߰��Ͽ����ϴ�.");
			} else {
				JOptionPane.showMessageDialog(this, "ȸ���� �����߰��� �����Ͽ����ϴ�.");

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
		new InsertMemberGUI();

	}

}
