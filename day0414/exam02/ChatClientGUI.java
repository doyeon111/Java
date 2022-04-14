package exam02;

import java.awt.BorderLayout;
//채팅창
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements ActionListener {

	// 대화내용을 입력할 텍스트필드를 멤버변수로 선언ㅇ
	JTextField jtf;

	// 서버가 메아리 한 대화내용을 계속하여 누적하여 보여주기 위한 TextArea를 멤버변수로 선언
	JTextArea jta;

	// 소켓을 멤버변수로 만든다.
	Socket socket;

	// 데이터를 주고 받을 스트림을 멤버변수로 선언
	InputStream is;
	OutputStream os;

	public ChatClientGUI() {

		try {
			// 서버의 통신을 요청
			socket = new Socket("192.168.35.171", 9001);

			// 데이터를 주고받을 스트림을 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}

		// 멤버변수들을 생성
		jtf = new JTextField(40);

		jta = new JTextArea(80, 50);

		// 텍스트 에리어를 스크롤바를 위하여 스크롤팬으로 감싼다.
		JScrollPane jsp = new JScrollPane(jta);

		// "전송"을 위한 버튼을 만든다
		JButton btnSend = new JButton("전송");

		// 버튼의 이벤트를 등록
		btnSend.addActionListener(this);

		// 텍스트필드와 버튼을 담는 패널 만들기
		JPanel p = new JPanel();

		// 패널에 텍스트필드를 담는다.
		p.add(jtf);

		// 패널에 버튼을 담는다.
		p.add(btnSend);

		// 프레임의 가운데에 텍스트에리어를 감싸고 있는 스크롤팬을 담는다.
		add(jsp, BorderLayout.CENTER);

		// 프레임의 아래쪽에 텍스트필드와 버튼이 담긴 패널을 담는다.
		add(p, BorderLayout.SOUTH);

		// 프레임의 크기를 정해준다.
		setSize(600, 400);

		// 프레임을 화면에 보여주도록 설정
		setVisible(true);

		// 'X" 단추를 누르면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 서버로부터 수신되는 데이터를 계속하여 받기위한 클래스를 스레드로 구현
		class ClientThread extends Thread {
			// run을 오버라이딩
			public void run() {
				// 서버로부터 수신되는 데이터를 받기 위한 배열을 만든다.
				byte[] data = new byte[100];

				// 계속 실행
				while (true) {
					try {
						// inputstream을 통해 서버로부터 수신되는 데이터를 받는다.
						is.read(data);

						// 수신된 데이터를 문자열로 만든다.
						String reMsg = new String(data);

						// 수신된 문자열의 대화내용을 누적할 텍스트에리어에 추가
						jta.append(reMsg + "\n");

					} catch (Exception e) {
						System.out.println("예외발생: " + e.getMessage());
					}
				} // end while
			} // end run
		} // end Thread

		// 서버로부터 수신되는 데이터를 계속하여 받는 클라이언트 스레드 객체를 생성
		Thread t = new ClientThread();

		// 스레드 가동
		t.start();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 텍스트필드에 쓰여진 글자를 가져온다.
		String msg = jtf.getText();

		try {

			// 출력스트림을 통해 데이터를 서버로 보낸다.
			// 데이터를 보낼 때는 문자열을 바이트의 배열로 변환하여 보낸다.
			os.write(msg.getBytes());

			// 만약에 입력한 문자열이 q! 이면 프로그램을 종료
			if (msg.equals("q!")) {
				System.exit(0);
			}

			// 다음데이터 입력을 위하여 텍스트필드를 비워준다.
			jtf.setText("");

		} catch (Exception ex) {
			System.out.println("예외발생: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// 프레임을 생성
		new ChatClientGUI();

	}

}
