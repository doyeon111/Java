package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLTestGUI extends JFrame implements ActionListener {
	
	private JFileChooser jfc; //파일의 다이얼로그를 위한 변수
	private JTextField jtf; // 멤버로 갖는다
	private JTextArea jta;

	public URLTestGUI() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(50);
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta); // jta를 가지고 스크롤을 만든다.

		JButton btnRead = new JButton("읽어오기");
		JButton btnSave = new JButton("파일저장");
 
		// 이벤트 등록
		btnRead.addActionListener(this);
		btnSave.addActionListener(this);

		JPanel p = new JPanel();
		p.add(jtf);
		p.add(btnRead);
		p.add(btnSave);

		add(p, BorderLayout.NORTH); // 패널에
		add(jsp, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new URLTestGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals("읽어오기")) {
			// 텍스트필드에 입력한 URL의 내용을 모두 읽어와서 텍스트 에리어에 출력하도록 프로그램을 완성
			try {

				// 텍스트 필드에 입력한 내용으로 URL객체를 생성
				URL url = new URL(jtf.getText());

				// 그 문서의 내용을 읽어들이기 위한 스트림을 생성
				InputStream is = url.openStream(); // url 의 오픈스트림을 통해서 input스트림을 생성할 수 있다.

				// 한 번에 읽어들일 byte형의 배열을 만들기
				byte[] data = new byte[100]; // 한 번에 100바이트씩 읽어옴

				String str = "";

				while (is.read(data) != -1) {
					str = str + new String(data, "utf-8");
					Arrays.fill(data, (byte) 0);
				}

				// 전부 읽어들인 문자열을 텍스트에리어에 설정한다.
				jta.setText(str);

			} catch (Exception ex) {
				System.out.println("예외발생: " + ex.getMessage());
			}

		} else if (cmd.equals("파일저장")) {
			try {
				int re = jfc.showSaveDialog(this);
				if(re == JFileChooser.APPROVE_OPTION) { //re==0 인가?와 같은말이다. // 긍정대답을 하였으면
					File file = jfc.getSelectedFile();
					
					//문자단위의 출력
					FileWriter fw = new FileWriter(file);
					fw.write(jta.getText());
					fw.close();
					JOptionPane.showMessageDialog(this, "파일로 저장하였습니다.");
				}

			} catch (Exception ex) {
				System.out.println("예외발생: " + ex.getMessage());
			}

		}

	}

}
