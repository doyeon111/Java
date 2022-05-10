package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sist.vo.MemberVO;

public class MemberDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@192.168.35.55:1521:XE";
	String user="c##sist";
	String password="sist";
	
	
	public int insertMember(MemberVO m) {
		int re = -1;
		String sql = "insert into member values(?,?,?,?)";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getSelf());
			re = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
		
		return re;
	}
	
	
	
	public boolean isMember(String id, String pwd) {
		boolean re = false;
		
		
		try {
			String sql = "select * from member where id=? and pwd=?";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				re = true;
			} else {
				re = false;
			}
		
			if(rs != null) {
				rs.close(); //rs가 null이 아니면 close
			}
		
			if(pstmt != null) {
				pstmt.close();
			}

			if(conn != null) {
				conn.close();
			}

		
		}catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

		
		return re;
	}
	
}
