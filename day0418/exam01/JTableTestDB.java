package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//�����ͺ��̽� �����Ͽ� ��� ���� ������ �������̺� ���
public class JTableTestDB extends JFrame implements ActionListener {

	// ������ ȭ��� ���� ��, ���� �����Ǵ� ȭ���� ���Ͽ� JTable�� �����.
	JTable table;

	// JTable�� �� �÷��̸��� ��� ���� Vector�� ����
	Vector<String> colNames;

	// JTable�� �� �����͸� ��� ���� Vector�� ����
	Vector<Vector<String>> rowData;

	public JTableTestDB() {
		// �÷��̸��� ���� Vector�� ����
		colNames = new Vector<String>();

		// ���̺� ��� �����͸� ���� ���͸� ����
		rowData = new Vector<Vector<String>>();

		// �÷��̸��� ���� �����͸� �߰�
		colNames.add("���̵�");
		colNames.add("�̸�");
		colNames.add("����");

		rowData = new Vector<Vector<String>>();

		// �� �̸��� �ִ� ���Ϳ� ��ü�����Ͱ� ��� ���͸� ���� �������̺��� �����.

		table = new JTable(rowData, colNames);

		// �������̺��� ��ũ�������� ���Ѵ�.
		JScrollPane jsp = new JScrollPane(table);

		// �������̺��� ���ΰ��ִ� ��ũ������ �����ӿ� ��´�.
		add(jsp, BorderLayout.CENTER);

		JButton btn = new JButton("ȸ����� �о����");
		add(btn, BorderLayout.SOUTH);

		btn.addActionListener(this);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
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

			// �˻��� �����ŭ �ݺ�����
			while (rs.next()) { // ���ڵ带 ��ȯ

				// ���̵�, �̸�, ���̸� �̾ƿ´�.
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				// �ϳ��� ���� ǥ���ϱ� ���� ���͸� ����
				Vector<String> row = new Vector<String>();

				// ������ ���̵�, �̸�, ���̸� ��´�
				row.add(id);
				row.add(name);
				row.add(age + "");

				// �ϳ��� ���� ��� ���͸� ��ü�����͸� ��� ���� ���Ϳ� ��´�.
				rowData.add(row);
				
				//���� ���̺��� �ٽ� �׷��� ���� ��û
				table.updateUI();

			}

			rs.close(); 
			stmt.close();
			conn.close();

		} catch (Exception ex) {
			System.out.println("���ܹ߻�: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		new JTableTestDB();

	}

}
