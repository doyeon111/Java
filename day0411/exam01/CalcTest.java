package exam01;

import java.awt.BorderLayout;
//���� �����
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame implements ActionListener {

	// ������� ����� JTextField�� ��������� ����
	JTextField jtf;

	// ������ �� �� ���� ���� �����ϱ� ���� ������ ������.
	int num1, num2;

	// � ������ ���� �����ڸ� ������ ������ �����Ѵ�.
	String op;

	public Calc() {

		// JTextField ��ü�� ����
		jtf = new JTextField(50);

		// ���� ǥ���� �����ϱ�
		setTitle("����");

		// ȭ���ġ����� ������� ��ġ�ϵ��� ����
//		setLayout(new FlowLayout());

		// ȭ���ġ����� ��,��,��,��,����� ��ġ����� BorderLayout���� ��ġ�Ѵ�.
		setLayout(new BorderLayout());

		// 16���� ��ư�� �� ���ڿ� �迭�� �����.
		String[] str = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", "=", "/" };

		// ��ư �迭�� 16���� �����.
		JButton[] btn = new JButton[16];

		// ��ư 16���� ���� �г��� �����Ѵ�.
		JPanel p = new JPanel();

		// �г��� ���̾ƿ������ ��ư 16���� �㵵��
		// 4�� 4���� �׸��巹�̾ƿ����� ����
		p.setLayout(new GridLayout(4, 4));

		// �ݺ����� �̿��Ͽ� 16���� ��ư�� �����Ͽ� �гο� ��´�
		for (int i = 0; i < str.length; i++) {
			btn[i] = new JButton(str[i]);

			// ��ư�� �������� �� ���� �ϵ��� �̺�Ʈ ����� �Ѵ�.
			btn[i].addActionListener(this);

			p.add(btn[i]); // �гο� ��´�

		}

		// ������� ����� �ؽ�Ʈ�ʵ带 �������� ���ʿ� ��´�.
		add(jtf, BorderLayout.NORTH);

		// 16���� ��ư�� �ִ� �г��� �������� ����� ��´�.
		add(p, BorderLayout.CENTER);

		// ��ư�� ���� â�� ��ƿ�.
//		add(new JButton("��ư"));
//		add(new JButton("��ư2"));

		// â�� ũ�⸦ ����
		setSize(300, 200);

		// â�� �����ֵ��� ����
		setVisible(true);

		// â�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ��ư�� ���ڸ� ������ �´�.
		String cmd = e.getActionCommand();
		System.out.print(cmd + " ");

		// ���࿡ ������ ��ư�� ���ڰ� ������(+,-,*,/)���, ���� ȭ�鿡 �ִ� ���ڸ� num1�� �����ϰ� ȭ���� �����.
		// ������ �����ڸ� ���� op�� �����Ѵ�.

		if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {

			// ���� ȭ�鿡 �ִ� ���ڸ� ������ ��ȯ�Ͽ� num1�� ����
			num1 = Integer.parseInt(jtf.getText());

			// ȭ���� �����.
			jtf.setText("");

			// �����ڸ� op�� ����
			op = cmd;

		} else if (cmd.equals("=")) {
			// ���� �ؽ�Ʈ�ʵ��� ������ num2�� �����Ѵ�.
			num2 = Integer.parseInt(jtf.getText());

			// op�� ��� �����ڿ� ���� �ش翬���� �����Ͽ� ���� result�� ��´�.
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

			// result�� �ؽ�Ʈ�ʵ忡 ����Ѵ�.
			jtf.setText(result + ""); // ����ȯ

		} else if (cmd.equals("C")) {
			//num1, num2�� 0���� ����
			num1 = 0;
			num2 = 0;
			
			
			//�ؽ�Ʈ �ʵ带 �����ش�.
			jtf.setText("");
			
			
			
		} else {
			// ������ ��ư�� ���ڸ� �ؽ�Ʈ �ʵ忡 ����غ���.
			// jtf.setText(cmd);

			// ��ư�� �������� ������ ��ư�� ���ڸ� �ؽ�Ʈ�ʵ忡 �����Ͽ� ����غ���.
			jtf.setText(jtf.getText() + cmd);
		}
	}
}

public class CalcTest {

	public static void main(String[] args) {
		new Calc();

	}

}
