package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//데이터베이스 연동하여 모든 고객의 정보를 제이테이블에 출력
public class JTableTestDB extends JFrame implements ActionListener {

	// 엑셀의 화면과 같이 행, 열로 구성되는 화면을 위하여 JTable을 만든다.
	JTable table;

	// JTable에 들어갈 컬럼이름을 담기 위한 Vector를 선언
	Vector<String> colNames;

	// JTable에 들어갈 데이터를 담기 위한 Vector를 선언
	Vector<Vector<String>> rowData;

	public JTableTestDB() {
		// 컬럼이름을 위한 Vector를 생성
		colNames = new Vector<String>();

		// 테이블에 담길 데이터를 위한 벡터를 생성
		rowData = new Vector<Vector<String>>();

		// 컬럼이름의 백터 데이터를 추가
		colNames.add("아이디");
		colNames.add("이름");
		colNames.add("나이");

		rowData = new Vector<Vector<String>>();

		// 행 이름이 있는 벡터와 전체데이터가 담긴 벡터를 갖고 제이테이블을 만든다.

		table = new JTable(rowData, colNames);

		// 제이테이블을 스크롤팬으로 감싼다.
		JScrollPane jsp = new JScrollPane(table);

		// 제이테이블을 감싸고있는 스크롤팬을 프레임에 담는다.
		add(jsp, BorderLayout.CENTER);

		JButton btn = new JButton("회원목록 읽어오기");
		add(btn, BorderLayout.SOUTH);

		btn.addActionListener(this);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String sql = "select * from member";

		try {
			// jdbc 드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB서버에 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.171:1521:XE", "c##sist",
					"sist");

			// 데이터베이스 명령어를 실행하기 위한 객체를 생성
			Statement stmt = conn.createStatement();

			// 데이터베이스 명령어를 실행
			ResultSet rs = stmt.executeQuery(sql);

			// 검색한 결과만큼 반복실행
			while (rs.next()) { // 레코드를 반환

				// 아이디, 이름, 나이를 뽑아온다.
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				// 하나의 행을 표현하기 위한 벡터를 생성
				Vector<String> row = new Vector<String>();

				// 벡터의 아이디, 이름, 나이를 담는다
				row.add(id);
				row.add(name);
				row.add(age + "");

				// 하나의 행이 담긴 벡터를 전체데이터를 담기 위한 벡터에 담는다.
				rowData.add(row);
				
				//제이 테이블을 다시 그려줄 것을 요청
				table.updateUI();

			}

			rs.close(); 
			stmt.close();
			conn.close();

		} catch (Exception ex) {
			System.out.println("예외발생: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		new JTableTestDB();

	}

}
