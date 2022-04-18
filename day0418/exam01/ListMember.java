package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListMember {

	public static void main(String[] args) {

		// select * from member;
		// �����ϰ��� �ϴ� �����ͺ��̽� ��ɾ ������ ����
		String sql = "select * from member";

		try {

			// jdbc����̹��� �޸𸮷� �α��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB������ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// �����ͺ��̽� ����� �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// �����ͺ��̽� ��ɾ ����
			// executeUpdate ==> �����ͺ��̽��� ������ �ִ� ����� ������ �� ���
			// executeQuery ==> �����ͺ��̽��� �ڷḦ ��ȸ�� �� ���
			ResultSet rs = stmt.executeQuery(sql);

			// �˻��� ����� �ڷᰡ �ִ� ��ŭ �ݺ�����
			// rs.next()�� �������ڵ�� Ŀ���� �Ű��ְ� true�� ��ȯ
			// �� �̻� �Ű��� ���ڵ尡 ������ false�� ��ȯ
			while (rs.next()) { // ���ڵ带 ��ȯ

				// ���� Ŀ���� ����Ű�� �ִ� ���� ���� �������
				// rs.getXXX(�ε���)
				// �÷��� �ε����� 1���� ����
				// XXX���� ���ڿ��̸� String �����̸� Int
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				System.out.println(id + ", " + name + ", " + age);

			}

			System.out.println("��� ����Ͽ����ϴ�.");
			System.out.println("--------------------------------------------------");

			// ����ߴ� �ڿ��� �ݾ��ش�.
			// ���� ���߿� ������� �ڿ����� �ݾ��ش�.
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
