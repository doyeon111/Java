package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteMemberGUI extends JFrame implements ActionListener {

	JTextField jtf;

	public DeleteMemberGUI() {
		// 창 제목 설정
		setTitle("회원삭제");

		// 화면의 레이아웃을 순서대로 배치하는 방식을 설정
		setLayout(new FlowLayout());

		// 텍스트 필드를 생성
		jtf = new JTextField(10);

		// 라벨을 생성
		JLabel label = new JLabel("삭제할 회원의 아이디: ");

		// 버튼을 생성
		JButton btn = new JButton("삭제");
		
		//버튼의 이벤트를 등록
		btn.addActionListener(this);

		// 라벨을 프레임에 담는다.
		add(label);

		// 텍스트필드를 프레임에 담는다.
		add(jtf);

		// 버튼을 프레임에 담는다.
		add(btn);

		// 프레임의 크기를 설정
		setSize(450, 300);

		// 프레임을 보이도록 설정
		setVisible(true);

		// 닫기버튼을 누르면 프로그램을 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 삭제할 회원의 아이디를 변수에 저장
		String id = jtf.getText();

		// 실행할 데이터베이스 명령어를 만든다.
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
			int re = stmt.executeUpdate(sql);

			if (re == 1) {
				JOptionPane.showMessageDialog(this, "회원의 정보를 삭제하였습니다.");
			} else {
				JOptionPane.showMessageDialog(this, "회원의 정보삭제에 실패하였습니다.");

			}

			// 사용했던 자원을 닫아준다.
			stmt.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("예외발생: " + ex.getMessage());
		}

	}

	public static void main(String[] args) {
		// 프레임 생성
		new DeleteMemberGUI();

	}

}
