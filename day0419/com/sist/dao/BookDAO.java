package com.sist.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.BookVO;
import com.sist.vo.OrdersVO;

//����ȣ�� �Է¹޾� �� ���� �ֹ��� �ֹ���ȣ, ����ȣ, ������ȣ, ���űݾ�, �������� ����ϴ� ���α׷��� �ۼ�

//�����ͺ��̽��� �����Ͽ� Orders ���̺��� �ڷḦ �߰��ϰų� �����ϰų� �˻��ϰų� ������ ���� �޼ҵ带 �����ִ� Ŭ������ �����.
public class BookDAO {
	// �� ���̵� �Ű������� ���޹޾� �ش� ���� �ֹ������� �˻��Ͽ� ArrayList�� ��ȯ�ϴ� �޼ҵ带 ����
	public ArrayList<BookVO> listBook(String publicsher) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();

		String sql = "select * from book where publicsher like  '" + publicsher + "'";


		// �����ͺ��̽� ��ɾ �����ϴµ� ���� �ڵ带 �ϼ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			// �˻��� �����ŭ �ݺ� ����
			while (rs.next()) {
				// ���� Ŀ���� �ٶ󺸰� �ִ� ���� �����͸� �̾ƿ´�.
				int bookid = rs.getInt(1);
				String bookname= rs.getString(2);
				String ps = rs.getString(3);
				int price = rs.getInt(4);

				// ���� Ŀ���� �ٶ󺸰��ִ� ���� �����͸� ���� VO�� ����
				BookVO vo = new BookVO(bookid, bookname, publicsher, price);

				// ������ VO�� ����Ʈ�� ��´�.
				list.add(vo);
			}

			// ����ߴ� �ڿ����� �ݾ��ش�.
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

		return list;
	}
}
