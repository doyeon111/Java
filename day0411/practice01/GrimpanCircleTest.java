package practice01;

//���콺�� Ŭ���ϰ� ���� �� �׸���
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

//�׷����� ǥ���ϱ� ���Ͽ� JPanel�� ����� Ŭ������ ������ش�.
//��, ���콺
class GrimpanPanel extends JPanel implements MouseListener {
	// ���콺�� ������ ������, ������ �����ϱ� ���� ������ ����
	int x1, y1, x2, y2;

	//�����ڿ��� ���콺 �̺�Ʈ�� ���
	public GrimpanPanel() {
		// �гο� ���콺 �̺�Ʈ�� ���
		addMouseListener(this);
	}

	
	//�г��� �ٽ� �׷��� �ʿ䰡 ���� ���� paintComponent�� �ڵ����� ���۵�.
	//paintComponent�� �������̵� �Ͽ� �׷����� ǥ�����ش�.

	protected void paintComponent(Graphics g) {
		//System.out.println("�ٽ� �׷��ݴϴ�.");
		//g.drawLine(x1, y1, x2, y2); // ���� �׾���.
		g.drawOval(x1, y1, x2, y2);
	//	g.drawRect(x1, y1, x2, y2);

	}



	
	//���콺�� �������� �� 
	@Override
	public void mouseClicked(MouseEvent e) {

	}
	//���콺�� �������� �� x,y��ǥ�� �׷����� ���������� ����
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX(); // ���콺�� ������ x1�� �ֱ�
		y1 = e.getY();

	}
	//���콺�� �������� ���� x,y��ǥ�� �׷����� �������� ����
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX(); // ���콺�� ������ ���� x2�� �ֱ�
		y2 = e.getY();

		//�׷����� �ϼ��Ǿ��� �� �׷����� �׷��޶�� ��û
		// "�ٽ� �׷��ּ���"��� ��û
		repaint(); // paintComponent�� ���۵ȴ�.

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

class Grimpan extends JFrame {

	// �׸��� �ų��� ����� ����
	GrimpanPanel gp;

	public Grimpan() {
		gp = new GrimpanPanel();
		add(gp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class GrimpanCircleTest {
//	public static Scanner sc;
//	
//	public static void printMenu() {
//		System.out.println("----------------------------------------------");
//		System.out.println("1. ��, 2. ��, 3. �簢��, 0. ����");
//		System.out.print("�޴��� �����ϼ���: ");
//	}

	public static void main(String[] args) {
//		sc = new Scanner(System.in);

		new Grimpan();
	}

}
