package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//��������� ���̵�, �̸�, ���̸� �Է¹޾Ƽ� �����ͺ��̽� ���̺� member�� �߰��ϴ� �ڹ����α׷��� �ۼ�
public class InsertMember {

	public static void main(String[] args) {
		String id, name;
		int age;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����� ȸ���� ���̵� �Է��ϼ���: ");
		id = sc.next();

		System.out.print("���� ����� ȸ���� �̸��� �Է��ϼ���: ");
		name = sc.next();

		System.out.print("���� ����� ȸ���� ���̸� �Է��ϼ���: ");
		age = sc.nextInt();

		// �Է¹��� ���̵�, �̸�, ���̸� ���� �����ͺ��̽� ��ɾ� �����
		String sql = "insert into member values('" + id + "', '" + name + "', " + age + ")";

		// ���α׷����� �ڵ����� �����ͺ��̽��� �����Ͽ� ������ ���� �����ͺ��̽� ��ɾ� sql�� �����ϵ��� ����.
		// �ڹٰ� �����ͺ��̽��� �����Ͽ� �����ͺ��̽� ��ɾ �����ϴ� ���α׷�
		// JDBC ���α׷��� Java DataBase Connection
		try {
			// 1. jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db������ �����Ѵ�.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist"); // ù��° ĭ���� �� �������ּ�, ����� ����, ��й�ȣ

			// 3. �����ͺ��̽� ����� �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// 4. �����ͺ��̽� ����� ����
			stmt.executeUpdate(sql);
			
			// 5. ����� ���� �ڿ��� �ݾ��ش�.
			stmt.close();
			conn.close();
			
			System.out.println("ȸ���� ������ ����Ͽ����ϴ�.");

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
