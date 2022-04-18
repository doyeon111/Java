package exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	// ������ ȭ��� ���� ��, ���� �����Ǵ� ȭ���� ���Ͽ� JTable�� �����.
	JTable table;

	// JTable�� �� �÷��̸��� ��� ���� Vector�� ����
	Vector<String> colNames;

	// JTable�� �� �����͸� ��� ���� Vector�� ����
	Vector<Vector<String>> rowData;

	public JTableTest() {
		// �÷��̸��� ���� Vector�� ����
		colNames = new Vector<String>();

		// ���̺� ��� �����͸� ���� ���͸� ����
		rowData = new Vector<Vector<String>>();

		// �÷��̸��� ���� �����͸� �߰�
		colNames.add("���̵�");
		colNames.add("�̸�");
		colNames.add("����");

		// ���̺��� row�����Ϳ� �� ù ��° ���ڵ带 ���� ���͸� �����.
		Vector<String> row1 = new Vector<String>();

		// ù ��° ���� �����͸� �߰�
		row1.add("tiger");
		row1.add("ȫ�浿");
		row1.add("20");

		// ���̺��� row�����Ϳ� �� �� ��° ���ڵ带 ���� ���͸� �����.
		Vector<String> row2 = new Vector<String>();

		// �� ��° ���� �����͸� �߰�
		row2.add("lion");
		row2.add("�����");
		row2.add("24");

		// ���̺��� row�����Ϳ� �� �� ��° ���ڵ带 ���� ���͸� �����.
		Vector<String> row3 = new Vector<String>();

		// �� ��° ���� �����͸� �߰�
		row3.add("kim");
		row3.add("������");
		row3.add("30");

		// row�����Ϳ� �� ���� �����Ͱ� ��� ���͸� �߰�
		rowData.add(row1);
		rowData.add(row2);
		rowData.add(row3);
		
		// JTable�� ����
		table = new JTable(rowData, colNames);

		// �ؽ�Ʈ����� ��ũ�������� ���ε��� JTable�� ��ũ�������� ���ξ��Ѵ�.
		JScrollPane jsp = new JScrollPane(table);

		// ���̺��� ��� ��ũ������ �����ӿ� ��´�.
		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableTest();
		
	}

}
