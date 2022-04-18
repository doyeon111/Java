package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SelectMemberTextArea extends JFrame implements ActionListener {

	JTextArea jta;

	public SelectMemberTextArea() {

		jta = new JTextArea(10, 80);
		JScrollPane jsp = new JScrollPane(jta);
		JButton btn = new JButton("ȸ�� ��� ���");
		add(jsp, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// ������ �����ͺ��̽� ��ɾ �����.
		String sql = "select * from member";

		try {
			// jdbc ����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB������ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// �����ͺ��̽� ��ɾ ����
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) { // ���ڵ带 ��ȯ

				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				// ���ڿ��� �����.
				String row = id + "\t" + name + "\t" + age;

				// �ؽ�Ʈ ����� �߰�
				jta.append(row + "\n");

			}

			// ����ߴ� �ڿ��� �ݾ��ش�.
			// ���� ���߿� ������� �ڿ����� �ݾ��ش�.
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("���ܹ߻�: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		new SelectMemberTextArea();

	}
	
	

}
