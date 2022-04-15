package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//사용자한테 아이디, 이름, 나이를 입력받아서 데이터베이스 테이블 member에 추가하는 자바프로그램을 작성
public class ListMember {

	public static void main(String[] args) {
		
		// 입력받은 아이디, 이름, 나이를 갖고 데이터베이스 명령어 만들기
		String sql = "select * from member";

		// 프로그램에서 자동으로 데이터베이스에 연결하여 위에서 만든 데이터베이스 명령어 sql을 동작하도록 하자.
		// 자바가 데이터베이스에 연결하여 데이터베이스 명령어를 실행하는 프로그램
		// JDBC 프로그래밍 Java DataBase Connection
		try {
			// 1. jdbc 드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db서버에 연결한다.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist"); // 첫번째 칸에는 내 아이피주소, 사용자 계정, 비밀번호

			// 3. 데이터베이스 명령을 실행하기 위한 객체를 생성
			Statement stmt = conn.createStatement();

			// 4. 데이터베이스 명령을 실행
			//executeUpdate() 데이터베이스에 변경이 있는 명령을 실행할 때
			//executeQuery() 데이터베이스로부터 읽어오는 명령을 실행할 때
			ResultSet rs = stmt.executeQuery(sql);
			
			
			//5. 읽어온 데이터만큼 반복실행
			while(rs.next()) { //데이터가 있는 만큼 하나씩 데
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println("아이디: " + id);
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				System.out.println("------------------------------");
				
			}
			
			// 6. 사용이 끝난 자원을 닫아준다.
			rs.close();
			stmt.close();
			conn.close();
			
			System.out.println("회원의 정보를 등록하였습니다.");

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
