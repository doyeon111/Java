package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.EmpVO;

public class EmpDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@192.168.35.55:1521:XE";
	String user="c##sist";
	String pwd="sist";
	
	public ArrayList<EmpVO> listEmp() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "select * from emp";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new EmpVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDate(6), 
								rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12)
						));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
		
		return list;
	}
}
