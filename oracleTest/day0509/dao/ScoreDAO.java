package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.ScoreVO;

public class ScoreDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.35.55:1521:XE";
	String user = "c##sist";
	String pwd = "sist";

	// select * from score
	// ���� ���� sql�� �����ϴ� �޼ҵ��� ������ �ۼ��غ���.

	// �޼ҵ带 ����
	public ArrayList<ScoreVO> listScore() {

		ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
		String sql = "select * from score";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new ScoreVO(rs.getString(1), rs.getInt(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

		return list;
	}
}
