package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sist.vo.ReservationVO;

public class ReservationDAO {
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.35.87:1521:XE";
	String user ="c##scott";
	String pwd = "tiger";
	public int insertReservation(ReservationVO r) {
		
		//숙박요금을 계산하여 insert 시킨다.
		//숙박기간을 알아오는 sql
		String sql1 = "select to_date('"+r.getCheckout()+"', 'yyyy/mm/dd') - to_date('"+r.getCheckin()+"', 'yyyy/mm/dd') from dual";
		//룸 가격요금을 알아오는 sql
		String sql2 = "select fee from room where r_no=" +r.getR_no();
		
		int re = -1;
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			String sql = "insert into reservation(rv_no, checkin, checkout, cnt, rv_phone, c_no, r_no, total, e_no) "+
						"values((select nvl(max(rv_no),0) + 1  from reservation),"+ //자동으로 rv_no가 생성될 수 있게 설정
						"?,?,?,?,?,?,?,?)";
			
			//숙박기간
			int days = 0; 
			Statement stmt1 = conn.createStatement();
			ResultSet rs1 = stmt1.executeQuery(sql1);
			//rs1의 결과는 1개의 레코드입니다.
			if(rs1.next()) {
				days = rs1.getInt(1);
			}
			
			//룸가격 갖고오기
			int fee = 0;
			Statement stmt2 = conn.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql2);
			if(rs2.next()) {
				fee = rs2.getInt(1);
			}
			
			//숙박요금 계산하기
			int total= days * fee;
			
			r.setTotal(total);
			
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getCheckin());
			pstmt.setString(2, r.getCheckout());
			pstmt.setInt(3, r.getCnt());
			pstmt.setString(4, r.getRv_phone());
			pstmt.setInt(5, r.getC_no());
			pstmt.setInt(6, r.getR_no());
			pstmt.setInt(7, r.getTotal());
			pstmt.setInt(8, r.getE_no());
			
			re = pstmt.executeUpdate();
			
			rs1.close();
			rs2.close();
			stmt1.close();
			stmt2.close();
			
			pstmt.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
		
		return re;
	}
}
