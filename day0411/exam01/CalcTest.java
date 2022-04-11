package exam01;

import java.awt.BorderLayout;
//계산기 만들기
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame implements ActionListener {

	// 계산결과를 출력할 JTextField를 멤버변수로 선언
	JTextField jtf;

	// 연산을 할 두 개의 수를 저장하기 위한 변수를 선언함.
	int num1, num2;

	// 어떤 연산을 할지 연산자를 저장할 변수를 선언한다.
	String op;

	public Calc() {

		// JTextField 객체를 생성
		jtf = new JTextField(50);

		// 제목 표시줄 설정하기
		setTitle("계산기");

		// 화면배치방식을 순서대로 배치하도록 설정
//		setLayout(new FlowLayout());

		// 화면배치방식을 동,서,남,북,가운데로 배치방식인 BorderLayout으로 배치한다.
		setLayout(new BorderLayout());

		// 16개의 버튼에 들어갈 문자열 배열을 만든다.
		String[] str = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", "=", "/" };

		// 버튼 배열을 16개를 만든다.
		JButton[] btn = new JButton[16];

		// 버튼 16개를 담을 패널을 생성한다.
		JPanel p = new JPanel();

		// 패널의 레이아웃방식을 버튼 16개를 담도록
		// 4행 4열의 그리드레이아웃으로 설정
		p.setLayout(new GridLayout(4, 4));

		// 반복문을 이용하여 16개의 버튼을 생성하여 패널에 담는다
		for (int i = 0; i < str.length; i++) {
			btn[i] = new JButton(str[i]);

			// 버튼이 눌러졌을 때 일을 하도록 이벤트 등록을 한다.
			btn[i].addActionListener(this);

			p.add(btn[i]); // 패널에 담는다

		}

		// 계산결과를 출력할 텍스트필드를 프레임의 북쪽에 담는다.
		add(jtf, BorderLayout.NORTH);

		// 16개의 버튼이 있는 패널을 프레임의 가운데에 담는다.
		add(p, BorderLayout.CENTER);

		// 버튼을 만들어서 창에 담아요.
//		add(new JButton("버튼"));
//		add(new JButton("버튼2"));

		// 창의 크기를 설정
		setSize(300, 200);

		// 창을 보여주도록 설정
		setVisible(true);

		// 창을 닫으면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 글자를 가지고 온다.
		String cmd = e.getActionCommand();
		System.out.print(cmd + " ");

		// 만약에 눌러진 버튼의 글자가 연산자(+,-,*,/)라면, 현재 화면에 있는 숫자를 num1에 저장하고 화면을 지운다.
		// 눌러진 연산자를 변수 op에 저장한다.

		if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {

			// 현재 화면에 있는 숫자를 정수로 변환하여 num1에 저장
			num1 = Integer.parseInt(jtf.getText());

			// 화면을 지운다.
			jtf.setText("");

			// 연산자를 op에 저장
			op = cmd;

		} else if (cmd.equals("=")) {
			// 현재 텍스트필드의 내용을 num2에 저장한다.
			num2 = Integer.parseInt(jtf.getText());

			// op에 담긴 연산자에 따라서 해당연산을 수행하여 변수 result에 담는다.
			int result = 0;
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			}

			// result를 텍스트필드에 출력한다.
			jtf.setText(result + ""); // 형변환

		} else if (cmd.equals("C")) {
			//num1, num2를 0으로 설정
			num1 = 0;
			num2 = 0;
			
			
			//텍스트 필드를 지워준다.
			jtf.setText("");
			
			
			
		} else {
			// 눌러진 버튼의 글자를 텍스트 필드에 출력해보자.
			// jtf.setText(cmd);

			// 버튼이 눌러지면 눌러진 버튼의 글자를 텍스트필드에 누적하여 출력해보자.
			jtf.setText(jtf.getText() + cmd);
		}
	}
}

public class CalcTest {

	public static void main(String[] args) {
		new Calc();

	}

}
