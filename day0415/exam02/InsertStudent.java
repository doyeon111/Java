package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) {
		String name;
		int num, kor, eng, math;

		Scanner sc = new Scanner(System.in);

		System.out.print("새로 등록할 회원의 번호를 입력하세요: ");
		num = sc.nextInt();

		System.out.print("새로 등록할 회원의 이름을 입력하세요: ");
		name = sc.next();

		System.out.print("새로 등록할 회원의 국어점수를 입력하세요: ");
		kor = sc.nextInt();
		
		System.out.print("새로 등록할 회원의 영어점수를 입력하세요: ");
		eng = sc.nextInt();
		
		System.out.print("새로 등록할 회원의 수학점수를 입력하세요: ");
		math = sc.nextInt();

		// 입력받은 아이디, 이름, 나이를 갖고 데이터베이스 명령어 만들기
		String sql = "insert into student values('" + num + "', '" + name + "', '" + kor + "', '" + eng + "', " + math+ ")";
		
		//String sql = "insert into student values('" + num + "', '" + name + "', " + kor + "', " + eng + "', " + math + ")";

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
			stmt.executeUpdate(sql); 
			
			// 5. 사용이 끝난 자원을 닫아준다.
			stmt.close();
			conn.close();
			
			System.out.println("회원의 정보를 등록하였습니다.");

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

}
