package exam06;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//â�����
import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener { // ���콺 �̺�Ʈ�� ���� MouseListener �������̽��� ���
	public MyFrame(String title) { // ������(Ŭ�����̸��� ����)
		super(title);
		setSize(400, 300); // setSize�� ���⼭ �������൵ ����. (â�� ũ�⸦ ����)
		setVisible(true); // â�� �����ּ���.(setVisible)
		
		addMouseListener(this); //���콺 �̺�Ʈ ó�� ����� = this

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� Ŭ���Ͽ����ϴ�.");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ���������ϴ�.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ���������ϴ�.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ���Խ��ϴ�.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� �������ϴ�.");
	}
}
