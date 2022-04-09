package exam06;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//창만들기
import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener { // 마우스 이벤트를 위해 MouseListener 인터페이스를 사용
	public MyFrame(String title) { // 생성자(클래스이름과 동일)
		super(title);
		setSize(400, 300); // setSize를 여기서 생성해줘도 좋다. (창의 크기를 설정)
		setVisible(true); // 창을 보여주세요.(setVisible)
		
		addMouseListener(this); //마우스 이벤트 처리 담당자 = this

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 클릭하였습니다.");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 눌러졌습니다.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 떼어졌습니다.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 들어왔습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 나갔습니다.");
	}
}
 
