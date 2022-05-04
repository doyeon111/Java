package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.RoomVO;
import com.sist.vo.CustomerVO;

public class CustomerDAO {
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.35.87:1521:XE";
	String user ="c##scott";
	String pwd = "tiger";
	
	//��� �� ����� ��ȯ�ϴ� �޼ҵ带 ����
	public ArrayList<CustomerVO> customerList() {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		try {
			Class.forName(driver);
			
			String sql = "select * from customer";
					
			
		
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//�˻��� �����ŭ �ݺ������Ͽ� ������ ������ RoomVO�� ���� list�� ��´�.
			while(rs.next()) {
				list.add(new CustomerVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
				
				
//				int c_no = rs.getInt(1);
//				String c_name = rs.getString(2);
//				String c_jumin = rs.getString(3);
//				String c_addr = rs.getString(4);
//				String c_type = rs.getString(5);
//				String c_phone = rs.getString(6);
//				String c_email = rs.getString(7);
//				customerVO c = new customerVO();
//				c.setC_no(c_no);
//				c.setC_name(c_name);
//				c.setC_jumin(c_jumin);
//				c.setC_addr(c_addr);
//				c.setC_type(c_type);
//				c.setC_phone(c_phone);
//				c.setC_email(c_email);
//				//����Ʈ�� ��´�.
//				list.add(c);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			System.out.println("������ ��:"+list.size());
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
		
		return list;
	}
}
