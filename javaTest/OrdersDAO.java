package com.sist.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.OrdersVO;

//����ȣ�� �Է¹޾� �� ���� �ֹ��� �ֹ���ȣ, ����ȣ, ������ȣ, ���űݾ�, �������� ����ϴ� ���α׷��� �ۼ�

//�����ͺ��̽��� �����Ͽ� Orders ���̺��� �ڷḦ �߰��ϰų� �����ϰų� �˻��ϰų� ������ ���� �޼ҵ带 �����ִ� Ŭ������ �����.
public class OrdersDAO {
	// �� ���̵� �Ű������� ���޹޾� �ش� ���� �ֹ������� �˻��Ͽ� ArrayList�� ��ȯ�ϴ� �޼ҵ带 ����
	public ArrayList<OrdersVO> listOrder(int custid) {
		ArrayList<OrdersVO> list = new ArrayList<OrdersVO>();

		String sql = "select * from orders where custid = " + custid;

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
				int orderid = rs.getInt(1);
				int cid = rs.getInt(2);
				int bookid = rs.getInt(3);
				int saleprice = rs.getInt(4);
				Date orderdate = rs.getDate(5);

				// ���� Ŀ���� �ٶ󺸰��ִ� ���� �����͸� ���� VO�� ����
				OrdersVO vo = new OrdersVO(orderid, custid, bookid, saleprice, orderdate);

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
