package exam01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//������ ȸ���� ���̵�, �̸�, ���̸� �Է¹޾� ȸ���� ������ �����ϴ� ���α׷��� �ۼ�
//���̵�� �������� �ʰ� ���ǽĿ� ����ϰ� �� ���ǿ� �´� id�� �ش��ϴ� ȸ���� �̸��� ���̸� ����
public class DeleteMember {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;

		System.out.print("������ ȸ���� ���̵� �Է��ϼ���: ");
		id = sc.next();

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
			// executeUpdate
			// executeQuery

			int re = stmt.executeUpdate(sql);

			if (re == 1) {
				System.out.println(id + "ȸ���� ������ �����Ͽ����ϴ�.");
			} else {
				System.out.println(id + "ȸ�� ������ ������ �����Ͽ����ϴ�.");
			}

			// ����ߴ� �ڿ��� �ݾ��ش�.
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
