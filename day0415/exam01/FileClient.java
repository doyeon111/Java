package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FileClient extends JFrame implements ActionListener {

	JTextField jtf;
	JFileChooser jfc;

	// 선택한 파일을 담기위한 변수
	File file;

	// 데이터를 전송하기 위한 스트림을 멤버변수로 선언
	OutputStream os;

	public FileClient() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(30);
		JButton btnFile = new JButton("파일선택");
		JButton btnSend = new JButton("파일전송");

		btnFile.addActionListener(this);
		btnSend.addActionListener(this);

		setLayout(new FlowLayout());
		add(jtf);
		add(btnFile);
		add(btnSend);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			// 서버에게 통신을 요청
			Socket socket = new Socket("192.168.35.171", 9005);

			// 데이터 전송을 위한 스트림을 생성
			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals("파일선택")) {

			int re = jfc.showOpenDialog(this);

			if (re == JFileChooser.APPROVE_OPTION) {

				// 전송하기 위하여 선택한 파일을 멤버변수 file에 담아둔다.
				file = jfc.getSelectedFile();

				// 선택한 파일이름을 텍스트필드에 출력
				jtf.setText(file.getName());
			}

		} else if (cmd.equals("파일전송")) {
			try {
				// 선택한 파일을 메모리로 읽어들이기 위한 FileInputStream 객체를 생성
				FileInputStream fis = new FileInputStream(file);

				// 파일의 내용을 읽어들이기 위한 배열을 만든다.
				byte[] data = new byte[200];

				// 파일의 끝이 아닐 때 까지 읽어들인다
				while (fis.read(data) != -1) {
					// 읽어들인 내용을 스트림을 통해 서버로 보낸다.
					os.write(data);

					// 다음 데이터를 위하여 배열을 비워준다.
					Arrays.fill(data, (byte) 0);
				}
				// 내보내기 끝난 파일을 닫아준다.
				fis.close();
				
				JOptionPane.showMessageDialog(this, "파일을 전송하였습니다.");

			} catch (Exception ex) {
				System.out.println("예외발생: " + ex.getMessage());
			}
		}

	}

	public static void main(String[] args) {
		new FileClient();

	}

}
