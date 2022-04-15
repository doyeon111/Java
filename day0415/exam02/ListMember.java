package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//��������� ���̵�, �̸�, ���̸� �Է¹޾Ƽ� �����ͺ��̽� ���̺� member�� �߰��ϴ� �ڹ����α׷��� �ۼ�
public class ListMember {

	public static void main(String[] args) {
		
		// �Է¹��� ���̵�, �̸�, ���̸� ���� �����ͺ��̽� ��ɾ� �����
		String sql = "select * from member";

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
			//executeUpdate() �����ͺ��̽��� ������ �ִ� ����� ������ ��
			//executeQuery() �����ͺ��̽��κ��� �о���� ����� ������ ��
			ResultSet rs = stmt.executeQuery(sql);
			
			
			//5. �о�� �����͸�ŭ �ݺ�����
			while(rs.next()) { //�����Ͱ� �ִ� ��ŭ �ϳ��� ��
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println("���̵�: " + id);
				System.out.println("�̸�: " + name);
				System.out.println("����: " + age);
				System.out.println("------------------------------");
				
			}
			
			// 6. ����� ���� �ڿ��� �ݾ��ش�.
			rs.close();
			stmt.close();
			conn.close();
			
			System.out.println("ȸ���� ������ ����Ͽ����ϴ�.");

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
