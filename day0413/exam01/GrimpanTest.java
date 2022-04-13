package exam01;

//���콺�� Ŭ���ϰ� ���� �� �׸���
import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

//�ϳ��� �׷����� ������ ǥ���ϱ� ���� Ŭ������ �����.
class GraphicInfo {
	private int x1, y1, x2, y2;

	public GraphicInfo(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "GraphicInfo [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
	}

}

//�׷����� ǥ���ϱ� ���Ͽ� JPanel�� ����� Ŭ������ ������ش�.
//��, ���콺 �̺�Ʈ ó���� ���Ͽ� MouseListener�� ����
class GrimpanPanel extends JPanel implements MouseListener {

	// �׷��� �׷����� ������ ��� ���� ����Ʈ�� �����.
	ArrayList<GraphicInfo> list;

	// ���콺�� ������ ������, ������ �����ϱ� ���� ������ ����
	int x1, y1, x2, y2;

	// �����ڿ��� ���콺 �̺�Ʈ�� ���
	public GrimpanPanel() {

		// �׷��� �׷����� ������ ��� ���� ����Ʈ�� ����
		list = new ArrayList<GraphicInfo>();

		// �гο� ���콺 �̺�Ʈ�� ���
		addMouseListener(this);
	}

	// �г��� �ٽ� �׷��� �ʿ䰡 ���� ���� paintComponent�� �ڵ����� ���۵�.
	// paintComponent�� �������̵� �Ͽ� �׷����� ǥ�����ش�.
	@Override
	protected void paintComponent(Graphics g) {

		// ����Ʈ�� ��� �׷����� ������ŭ �׷��ش�.
		for (GraphicInfo info : list) { //���� �׸� ������ ����Ʈ�� ��� ũ�⸦ �����Ͽ��� ���� ������� �ʰ� �����ְ� �ϱ�
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			int x = info.getX1();
			int y = info.getY1();

			if (info.getX2() < info.getX1()) {
				x = info.getX2();
				width = info.getX1() - info.getX2();

			}

			if (info.getY2() < info.getY1()) {
				y = info.getY2();
				height = info.getY1() - info.getY2();
			}

			System.out.println(info);
			System.out.println("width: " + width + " height: " + height);

			g.drawOval(x, y, width, height);
		}

//		System.out.println("�ٽ� �׷��ݴϴ�.");
//		// g.drawLine(x1, y1, x2, y2); // ���� �׾���.
//		int width = x2 - x1;// ���� �׸����� w,h�� �ʿ���. x2 ������ x1 ������ ���ָ� ���̰� ����.
//		int height = y2 - y1;
//
//		int x = x1; // ������
//		int y = y1;
//
//		// ���� x�� ������ x���� �� �۴ٸ� ������ �׷��ȿ� ���������� �Ѵ�.
//		// ���������� ������ �� ���� ���� ���̷� �Ѵ�.
//		if (x2 < x1) {
//			x = x2;
//			width = x1 - x2;
//		}
//
//		// ���� y�� ������ y���� �� �۴ٸ� ������ �׷����� ���������� �Ѵ�.
//		// ���������� ������ �� ���� ���� ���̷� �Ѵ�.
//		if (y2 < y1) {
//			y = y2; // �׷����� �������� ����
//			height = y1 - y2;
//		}
//
//		g.drawOval(x, y, width, height); // ���׸���
//
//		// g.drawRect(x, y, width, height); // �簢�� �׸���

	}

	// ���콺�� �������� ��
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	// ���콺�� �������� �� x,y��ǥ�� �׷����� ���������� ����
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX(); // ���콺�� ������ x1�� �ֱ�
		y1 = e.getY();

	}

	// ���콺�� �������� ���� x,y��ǥ�� �׷����� �������� ����
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX(); // ���콺�� ������ ���� x2�� �ֱ�
		y2 = e.getY();

		// ���� �ϼ��� �׷����� ������ ����Ʈ�� ��´�.
		list.add(new GraphicInfo(x1, y1, x2, y2));

		// �׷����� �ϼ��Ǿ��� �� �׷����� �׷��޶�� ��û
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

public class GrimpanTest {

	public static void main(String[] args) {

		new Grimpan();
	}

}
