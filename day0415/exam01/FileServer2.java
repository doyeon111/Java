package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//0414 과제 8번
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer2 extends JFrame {
	// 이미지를 표현하기 위한 라벨을 멤버변수로 선언
	JLabel label;

	// 라벨의 이미지를 표현하기 위하여 이미지 아이콘이 필요하다
	ImageIcon icon;

	public FileServer2() {
		// 이미지 아이콘 객체를 생성
		icon = new ImageIcon("flower.png");

		// 이미지 아이콘 객체를 갖고 라벨을 생성
		label = new JLabel(icon);

		// 라벨을 프레임의 가운데에 담는다.
		add(label, BorderLayout.CENTER);

		JButton btn = new JButton("이미지 바꾸기");
		add(btn, BorderLayout.SOUTH);

		// 이름없는 Inner클래스(익명클래스)를 통해서 이벤트 처리
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이미지 아이콘을 다시만든다.
				icon = new ImageIcon("enemy.png");

				// 다시 만들어진 이미지 아이콘을 라벨에 설정
				label.setIcon(icon);
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FileServer2();

	}

}
