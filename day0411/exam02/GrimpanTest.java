package exam02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponent(g);
		
		g.setColor(Color.red);
		g.drawLine(10, 10, 100, 100); //���� �׾���.
		
		g.setColor(Color.blue);
		g.drawOval(10, 10, 100, 100); //�� �׸���
	
	
		g.setColor(Color.green);
		g.drawRect(10, 10, 100, 100); //�簢�� �׸���
	}
	
}


class Grimpan extends JFrame { 
	
	//�׸��� �ų��� ����� ����
	GrimpanPanel gp;
	
	
	public Grimpan() {
		gp = new GrimpanPanel();
		add(gp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class GrimpanTest {

	public static void main(String[] args) {
		
		new Grimpan();
	}

}
