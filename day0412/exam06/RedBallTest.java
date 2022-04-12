package exam06;
//공의 위치를 변경시키기
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class RedBall extends JPanel implements Runnable{
	
	
	//공의 위치를 저장할 변수를 멤버변수로 선언
	private int x=10, y=200;

	@Override
	protected void paintComponent(Graphics g) {
		//부모의 paintComponent를 호출하여 화면을 지워준다.
		super.paintComponent(g);
		
		//빨간색으로 색상을 선택
		g.setColor(Color.red);
		
		//채운 원을 그리기.
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void run() { //원을 이동시키기
		
		//계속하여 진행
		while(true) {
			x += 10; //x의 위치를 변경
			y -= 10;  //y의 위치를 변경 , x y 모두 다 대각선 방향으로 변경
			
			try {
				Thread.sleep(100);
				repaint(); //다시그려주세요
			}catch(Exception e) {
				
			}
		}
		
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
		
		(new Thread(rb)).start();
	}
}



public class RedBallTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
