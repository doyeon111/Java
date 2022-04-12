package practice01;

//마우스를 클릭하고 뗄때 선 그리기
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

//그래픽을 표현하기 위하여 JPanel을 상속한 클래스를 만들어준다.
//또, 마우스
class GrimpanPanel extends JPanel implements MouseListener {
	// 마우스가 눌러진 시작점, 끝점을 저장하기 위한 변수를 선언
	int x1, y1, x2, y2;

	//생성자에서 마우스 이벤트를 등록
	public GrimpanPanel() {
		// 패널에 마우스 이벤트를 등록
		addMouseListener(this);
	}

	
	//패널을 다시 그려줄 필요가 있을 때에 paintComponent가 자동으로 동작됨.
	//paintComponent를 오버라이딩 하여 그래픽을 표현해준다.

	protected void paintComponent(Graphics g) {
		//System.out.println("다시 그려줍니다.");
		//g.drawLine(x1, y1, x2, y2); // 선을 그어줌.
		g.drawOval(x1, y1, x2, y2);
	//	g.drawRect(x1, y1, x2, y2);

	} 



	
	//마우스가 눌러졌을 때 
	@Override
	public void mouseClicked(MouseEvent e) {

	}
	//마우스가 눌러졌을 때 x,y좌표를 그래픽의 시작점으로 저장
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX(); // 마우스가 눌러진 x1에 넣기
		y1 = e.getY();

	}
	//마우스가 떼어졌을 때에 x,y좌표를 그래픽의 끝점으로 저장
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX(); // 마우스가 떼어진 순간 x2에 넣기
		y2 = e.getY();

		//그래픽이 완성되었을 때 그래픽을 그려달라고 요청
		// "다시 그려주세요"라고 요청
		repaint(); // paintComponent가 동작된다.

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

	// 그림판 매널을 멤버로 선언
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
//		System.out.println("1. 선, 2. 원, 3. 사각형, 0. 종료");
//		System.out.print("메뉴를 선택하세요: ");
//	}

	public static void main(String[] args) {
//		sc = new Scanner(System.in);

		new Grimpan();
	}

}
