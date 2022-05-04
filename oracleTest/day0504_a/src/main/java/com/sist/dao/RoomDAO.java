package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.vo.RoomVO;

public class RoomDAO {
	//üũ��, üũ�ƿ����ڸ� �Ű������� ���޹޾� ���డ���� �� ����� ��ȯ�ϴ� �޼ҵ带 ����
	// avaliableRoomList
	//�޼ҵ� ������ ������.
	
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@192.168.35.87:1521:XE";
	String user ="c##scott";
	String pwd = "tiger";
	
	public ArrayList<RoomVO> avaliableRoomList(String checkin, String checkout) {
		ArrayList<RoomVO> list = new ArrayList<RoomVO>();
		
		try {
			Class.forName(driver);
			
			String sql = "select r_no, r_type, fee "+
					"from room "+
					"where r_no in (select r_no "+
									"from room "+
									"minus "+
									"select r_no "+
									"from reservation "+
									"where to_date(?, 'yyyy/mm/dd') between checkin and checkout or "+ 
									"to_date(?, 'yyyy/mm/dd') between checkin and checkout)";
			
		
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, checkin);
			pstmt.setString(2, checkout);
			
			ResultSet rs = pstmt.executeQuery();
			
			//�˻��� �����ŭ �ݺ������Ͽ� ������ ������ RoomVO�� ���� list�� ��´�.
			while(rs.next()) {
				int r_no = rs.getInt(1);
				String r_type = rs.getString(2);
				int fee = rs.getInt(3);
				RoomVO room = new RoomVO();
				room.setR_no(r_no);
				room.setR_type(r_type);
				room.setFee(fee);
				//����Ʈ�� ��´�.
				list.add(room);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
		
		return list;
	}
	
}
