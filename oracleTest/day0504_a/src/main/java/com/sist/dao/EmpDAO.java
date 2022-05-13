package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.CustomerVO;
import com.sist.vo.EmpVO;
import com.sist.vo.RoomVO;

public class EmpDAO {
	
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.35.87:1521:XE";
	String user ="c##scott";
	String pwd = "tiger";
	
	public ArrayList<EmpVO> EmpList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		

		try {
			Class.forName(driver);
			
			String sql = "select * from emp";
					

			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//검색한 결과만큼 반복실행하여 객실의 정보를 RoomVO로 만들어서 list에 담는다.
			while(rs.next()) {
				list.add(new EmpVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
		
		return list;
	}
} 
