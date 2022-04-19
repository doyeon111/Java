package exam01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//수정할 회원의 아이디, 이름, 나이를 입력받아 회원의 정보를 삭제하는 프로그램을 작성
//아이디는 변경하지 않고 조건식에 사용하고 그 조건에 맞는 id에 해당하는 회원의 이름과 나이를 삭제
public class DeleteMember {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;

		System.out.print("삭제할 회원의 아이디를 입력하세요: ");
		id = sc.next();

		String sql = "delete member where id = '" + id + "'";

		try {

			// jdbc 드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB서버에 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// 데이터베이스 명령어를 실행하기 위한 객체를 생성
			Statement stmt = conn.createStatement();
 
			// 데이터베이스 명령어를 실행
			// executeUpdate
			// executeQuery

			int re = stmt.executeUpdate(sql);

			if (re == 1) {
				System.out.println(id + "회원의 정보를 삭제하였습니다.");
			} else {
				System.out.println(id + "회원 정보의 삭제를 실패하였습니다.");
			}

			// 사용했던 자원을 닫아준다.
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
