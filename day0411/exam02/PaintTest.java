package exam02;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class Paint extends JFrame implements ActionListener{
	public Paint() {
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponents(g);
		g.drawLine(10, 10, 100, 100); //선을 그리는 코드
	
	}
	
	
	
}

public class PaintTest {

	public static void main(String[] args) {
		new Paint();

	}

}
