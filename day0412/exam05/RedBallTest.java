package exam05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class RedBall extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		//빨간색으로 색상을 선택
		g.setColor(Color.red);
		
		//채운 원을 그리기.
		g.fillOval(10, 220, 30, 30);
	}
	
}


class MyFrame extends JFrame {
	
	RedBall rb;
	
	public MyFrame() {
		rb = new RedBall();
		add(rb);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



public class RedBallTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
