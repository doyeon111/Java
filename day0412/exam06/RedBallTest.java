package exam06;
//���� ��ġ�� �����Ű��
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class RedBall extends JPanel implements Runnable{
	
	
	//���� ��ġ�� ������ ������ ��������� ����
	private int x=10, y=200;

	@Override
	protected void paintComponent(Graphics g) {
		//�θ��� paintComponent�� ȣ���Ͽ� ȭ���� �����ش�.
		super.paintComponent(g);
		
		//���������� ������ ����
		g.setColor(Color.red);
		
		//ä�� ���� �׸���.
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void run() { //���� �̵���Ű��
		
		//����Ͽ� ����
		while(true) {
			x += 10; //x�� ��ġ�� ����
			y -= 10;  //y�� ��ġ�� ���� , x y ��� �� �밢�� �������� ����
			
			try {
				Thread.sleep(100);
				repaint(); //�ٽñ׷��ּ���
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
