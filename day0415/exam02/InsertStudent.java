package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) {
		String name;
		int num, kor, eng, math;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����� ȸ���� ��ȣ�� �Է��ϼ���: ");
		num = sc.nextInt();

		System.out.print("���� ����� ȸ���� �̸��� �Է��ϼ���: ");
		name = sc.next();

		System.out.print("���� ����� ȸ���� ���������� �Է��ϼ���: ");
		kor = sc.nextInt();
		
		System.out.print("���� ����� ȸ���� ���������� �Է��ϼ���: ");
		eng = sc.nextInt();
		
		System.out.print("���� ����� ȸ���� ���������� �Է��ϼ���: ");
		math = sc.nextInt();

		// �Է¹��� ���̵�, �̸�, ���̸� ���� �����ͺ��̽� ��ɾ� �����
		String sql = "insert into student values('" + num + "', '" + name + "', '" + kor + "', '" + eng + "', " + math+ ")";
		
		//String sql = "insert into student values('" + num + "', '" + name + "', " + kor + "', " + eng + "', " + math + ")";

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
