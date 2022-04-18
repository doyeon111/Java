package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SelectMemberTextArea extends JFrame implements ActionListener {

	JTextArea jta;

	public SelectMemberTextArea() {

		jta = new JTextArea(10, 80);
		JScrollPane jsp = new JScrollPane(jta);
		JButton btn = new JButton("회원 목록 출력");
		add(jsp, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 실행할 데이터베이스 명령어를 만든다.
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

			while (rs.next()) { // 레코드를 반환

				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);

				// 문자열로 만든다.
				String row = id + "\t" + name + "\t" + age;

				// 텍스트 에리어에 추가
				jta.append(row + "\n");

			}

			// 사용했던 자원을 닫아준다.
			// 가장 나중에 만들었던 자원부터 닫아준다.
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("예외발생: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		new SelectMemberTextArea();

	}
	
	

}
