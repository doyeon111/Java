package com.sist.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.BookVO;
import com.sist.vo.OrdersVO;

//고객번호를 입력받아 그 고객이 주문한 주문번호, 고객번호, 도서번호, 구매금액, 구매일을 출력하는 프로그램을 작성

//데이터베이스에 접근하여 Orders 테이블의 자료를 추가하거나 수정하거나 검색하거나 삭제를 위한 메소드를 갖고있는 클래스를 만든다.
public class BookDAO {
	// 고객 아이디를 매개변수로 전달받아 해당 고객의 주문내역을 검색하여 ArrayList로 반환하는 메소드를 정의
	public ArrayList<BookVO> listBook(String publicsher) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();

		String sql = "select * from book where publicsher like  '" + publicsher + "'";


		// 데이터베이스 명령어를 실행하는데 까지 코드를 완성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			// 검색한 결과만큼 반복 실행
			while (rs.next()) {
				// 현재 커서가 바라보고 있는 곳에 데이터를 뽑아온다.
				int bookid = rs.getInt(1);
				String bookname= rs.getString(2);
				String ps = rs.getString(3);
				int price = rs.getInt(4);

				// 현재 커서가 바라보고있는 곳에 데이터를 갖고 VO를 생성
				BookVO vo = new BookVO(bookid, bookname, publicsher, price);

				// 생성한 VO를 리스트에 담는다.
				list.add(vo);
			}

			// 사용했던 자원들을 닫아준다.
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

		return list;
	}
}
