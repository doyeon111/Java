package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

//�����ͺ��̽� �����Ͽ� ��� ���� ������ �������̺� ���, �Է¹޾� ���, ����, ����, ��ȸ�ϱ�
public class MemberTest extends JFrame implements ActionListener, MouseListener {

	// ������ ȭ��� ���� ��, ���� �����Ǵ� ȭ���� ���Ͽ� JTable�� �����.
	JTable table;

	// JTable�� �� �÷��̸��� ��� ���� Vector�� ����
	Vector<String> colNames;

	// JTable�� �� �����͸� ��� ���� Vector�� ����
	Vector<Vector<String>> rowData;

	// ���̵�, �̸�, ���� �Է��� ���� �ؽ�Ʈ�ʵ带 ��������� ����
	JTextField jtf_id;
	JTextField jtf_name;
	JTextField jtf_age;

	public MemberTest() {

		// �ؽ�Ʈ�ʵ���� ����
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_age = new JTextField(10);

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

//		JButton btn = new JButton("ȸ����� �о����");
//		add(btn, BorderLayout.SOUTH);
//
//		btn.addActionListener(this);

		// �ؽ�Ʈ�ʵ�� ���� ���� �г��� ����
		JPanel p_input = new JPanel();

		// �г��� ���̾ƿ��� 3��2���� �׸��� ���̾ƿ����� ����
		p_input.setLayout(new GridLayout(3, 2));

		// �г��� �󺧰� �ؽ�Ʈ�ʵ带 ���ʷ� ��´�.
		p_input.add(new JLabel("���̵�: "));
		p_input.add(jtf_id);

		p_input.add(new JLabel("�̸�: "));
		p_input.add(jtf_name);

		p_input.add(new JLabel("����: "));
		p_input.add(jtf_age);

		// ��ư 4���� ����
		JButton btnAdd = new JButton("���");
		JButton btnUpdate = new JButton("����");
		JButton btnDelete = new JButton("����");
		JButton btnList = new JButton("���");

		// 4���� ��ư�� ���� �г��� �����.
		JPanel p_button = new JPanel();

		// ������� ��ư�� ��ġ�ϱ� ���Ͽ� �÷ο췹�̾ƿ����� ����
		p_button.setLayout(new FlowLayout());

		// ��ư 4���� ���ʷ� �гο� ��´�.
		p_button.add(btnAdd);
		p_button.add(btnUpdate);
		p_button.add(btnDelete);
		p_button.add(btnList);

		// �Է�â�� ��� �гΰ� ��ư�� ��� �г��� ���� �г��� �����.
		JPanel p_south;
		p_south = new JPanel();

		// �г��� ���̾ƿ��� �������̾ƿ����� ����
		p_south.setLayout(new BorderLayout());

		// �г��� ����� �Է�â�� ��� �г��� ��´�.
		p_south.add(p_input, BorderLayout.CENTER);

		// �г��� �Ʒ��ʿ� ��ư�� ��� �г��� ��´�.
		p_south.add(p_button, BorderLayout.SOUTH);

		// �Է�â�� ��ư�� ��� �г��� �������� �Ʒ��ʿ� ��´�.
		add(p_south, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ ��ư�� �̺�Ʈ�� ���
		btnAdd.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnList.addActionListener(this);

		// �������̺� ���콺�̺�Ʈ�� ���
		table.addMouseListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// ������ ��ư�� ���ڸ� �о�´�.
		String cmd = e.getActionCommand();

		// ������ ��ư�� ���ڿ� ���� �ش� ��ó���� ���� �޼ҵ带 ȣ��
		switch (cmd) {
		case "���":
			insertMember();
			break;
		case "����":
			updateMember();
			break;
		case "����":
			deleteMember();
			break;
		case "���":
			listMember();
			break;

		}

	}

	private void listMember() {
		// ������ �����͸� ���� rowData�� ����ش�.
		rowData.clear();

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

				// ���� ���̺��� �ٽ� �׷��� ���� ��û
				table.updateUI();

			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception ex) {
			System.out.println("���ܹ߻�: " + ex.getMessage());
		}

	}

	private void deleteMember() {
		try {
			String id = jtf_id.getText();
			String name = jtf_name.getText();
			int age = Integer.parseInt(jtf_age.getText());

			String sql = "delete member where id = '" + id + "'";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			Statement stmt = conn.createStatement();

			int re = stmt.executeUpdate(sql);

			if (re == 1) { // �� ��Ͽ� �����ϸ�
				// �ٽ� �� ����� ���
				listMember();
			} else {
				JOptionPane.showMessageDialog(this, "�������� �����Ͽ����ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

	private void updateMember() {
		try {
			String id = jtf_id.getText();
			String name = jtf_name.getText();
			int age = Integer.parseInt(jtf_age.getText());

			String sql = "update member set name = '" + name + "', age =" + age + "  where id = '" + id + "'";

			// jdbc ����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB������ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// executeUpdate ==> �����ͺ��̽��� ������ �ִ� ����� ������ �� ���
			int re = stmt.executeUpdate(sql);

			if (re == 1) { // �� ��Ͽ� �����ϸ�
				// �ٽ� �� ����� ���
				listMember();
			} else {
				JOptionPane.showMessageDialog(this, "�������� �����Ͽ����ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

	private void insertMember() {
		try {
			String id = jtf_id.getText();
			String name = jtf_name.getText();
			int age = Integer.parseInt(jtf_age.getText());

			String sql = "insert into member values('" + id + "', '" + name + "', " + age + ")";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			Statement stmt = conn.createStatement();

			int re = stmt.executeUpdate(sql);

			if (re == 1) { // �� ��Ͽ� �����ϸ�
				// �ٽ� �� ����� ���
				listMember();
			} else {
				JOptionPane.showMessageDialog(this, "����Ͽ� �����Ͽ����ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		new MemberTest();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// JTable���� ������ �� ��ȣ�� �о�´�.
		int row = table.getSelectedRow();
		System.out.println(row);
		
		//rowData�κ��� ���� �����͸� ������ ���´�.
		Vector<String> v = rowData.get(row);
		
		//���̵�, �̸�, ���̸� �̾ƿ´�.
		String id = v.get(0);
		String name = v.get(1);
		String age = v.get(2);
		
		//������ �̾ƿ� ���̵�, �̸�, ���̸� �ؽ�Ʈ�ʵ忡 ���
		jtf_id.setText(id);
		jtf_name.setText(name);
		jtf_age.setText(age);
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
