package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.sist.vo.SurveyVO;

public class SurveyDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.35.55:1521:XE";
	private String user ="c##sist";
	private String pwd = "sist";
	
	public int insertSurvey(SurveyVO s) {
		int re = -1;
		String sql = "insert into survey values((select nvl(max(no), 0) + 1 from survey),?,?,?,?,?)";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s.getGrade());
			pstmt.setString(2, s.getGender());
			pstmt.setString(3, s.getInterests());
			pstmt.setString(4, s.getCourse());
			pstmt.setString(5, s.getLeave());
			
			re = pstmt.executeUpdate();
			
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			System.out.println("¿¹¿Ü¹ß»ý: " + e.getMessage());
		}
		
		
		return re;
	}
} 
