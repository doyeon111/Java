package exam07;
//pdf 스레드와 그래픽 연습 programmin 1번

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//적, 플레이어, 미사일이 공통으로 가져야 할 부모클래스를 만든다.
class GraphicObject {
	// 그림파일을 참조할 변수를 선언
	BufferedImage img = null;

	// 그림을 출력할 위치 변수를 선언
	int x = 0, y = 0;

	// 생성 시에 그림파일명을 전달받는다.
	public GraphicObject(String name) {
		try { // 그림파일을 읽어 들일 때에 예외가 발생하기 때문에 예외처리를 해준다.
			img = ImageIO.read(new File(name)); // 파일의 이름을 매개변수로 전달받는다.

		} catch (IOException e) {
			// 예외가 발생하면 예외 메시지를 출력
			System.out.println("예외발생: " + e.getMessage());

			// 예외가 발생하면 프로그램을 종료시킴
			System.exit(0);
		}
	}

	// 그래픽의 위치를 변경하기 위한 메소드를 정의
	// body를 구체화하지 않아서 자식클래스들이 자신에게 맞도록 오버라이딩 하도록 한다.
	public void update() {
	}

	// 변경된 위치에 그래픽을 그려주기 위한 메소드
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	// 키보드 이벤트를 처리하기 위한 메소드
	// body를 구체화하지 않아서 자식클래스들이 자신에게 맞도록 오버라이딩 하도록 한다.
	public void keyPressed(KeyEvent event) {
	}

}

//GrapicObject를 확장한 미사일 클래스를 만든다.
class Missile extends GraphicObject {
	// 미사일을 그려줄지 말지를 위한 상태변수
	boolean launched = false;

	// 생성 시에 미사일의 그림파일 이름을 전달받는다.
	public Missile(String name) {
		// 그림 파일의 이름을 부모생성자에게 전달
		super(name);

		// 미사일의 y좌표를 -200으로 설정
		y = -200;
	}

	@Override
	// 미사일의 위치를 변경하기 위하여 부모의 update 메소드를 오버라이딩한다.
	public void update() {
		// 현재 미사일이 발사된 상태라면(그려줘야 할 상태라면)
		// 미사일이 위로 진행하도록 1만큼 계속하여 감소시킨다.
		if (launched == true) {
			y -= 50;
		}

		// 만약 미사일의 위치가 감소하여 화면의 영역에서 벗어났다면
		// 미사일을 화면에 그릴필요가 없으므로 launched에 false를 저장한다.
		if (y < -100) {
			launched = false;
		}

	}

	// 키보드가 눌러지는 이벤트 처리를 위한 메소드를 만든다.
	// 키보드 이벤트와 미사일의 출발점 x,y좌표를 매개변수로 전달받는다.
	public void keyPressed(KeyEvent event, int x, int y) {

		// 눌러진 키가 스페이스바인지 판별
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {

			// 미사일을 발사시키기 위하여 launched에 true를 설정
			launched = true;

			// 미사일의 출발위치를 설정
			this.x = x;
			this.y = y;
		}
	}

}

//적을 위한 클래스
class Enermy extends GraphicObject {
	// 적의 x축 이동 간격을 정하기
	int dx = -10;

	// 생성시에 적의 그림파일명을 전달받는다.
	public Enermy(String name) {
		// 부모의 생성자에게 그림파일명을 전달
		super(name);

		// 적의 위치를 설정
		x = 200;
		y = 0;
	}

	@Override
	// 적의 위치를 변경시키기 위한 update 메소드를 오버라이딩 한다.
	public void update() {
		// x축으로만 이동시키기 위하여 x에 이동거리인 dx를 누적한다.
		x += dx;

		// 만약, 이동방향이 음수인데 x위치가 0보다 작아지면 이동뱡향을 양수로 만든다.
		if (x < 0) {
			dx = +10;
		}

		// 만약 이동방향이 양수인데 x위치가 500보다 커지면 이동방향을 음수로 만든다.
		if (x > 500) {
			dx = -10;
		}
	}

}

//플레이어를 위한 클래스
class SpaceShip extends GraphicObject {

	// 생성 시에 그림파일명을 전달받는다.
	public SpaceShip(String name) {
		// 부모의 생성자에게 그림파일명을 전달받는다.
		super(name);

		// 플레이어의 위치를 설정
		x = 150;
		y = 350;
	}

	// 키보드 이벤트처리를 위한 메소드를 정의
	public void keyPressed(KeyEvent event) {
		// 왼쪽 방향키를 눌렀다면 x의 값을 감소시켜 플레이어 위치를 왼쪽으로 이동시킴.
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}

		// 오른쪽 방향키를 눌렀다면 x의 값을 증가시켜 플레이어 위치를 오른쪽으로 이동시킴.
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}

		// 위쪽 방향키를 눌렀다면 x의 값을 감소시켜 플레이어 위치를 위쪽으로 이동시킴.
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}

		// 아래쪽 방향키를 눌렀다면 x의 값을 증가시켜 플레이어 위치를 아래쪽으로 이동시킴.
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}
}

//적, 플레이어, 미사일을 그래픽으로 표현하기 위한 패널 클래스를 만든다.
//키보드 이벤트 처리를 위하여 KeyListener 인터페이스를 구현
class MyPanel extends JPanel implements KeyListener {

	// 게임의 구성요소인 적, 플레이어, 미사일 객체를 멤버변수로 선언
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;

	// 생성자에서 키보드이벤트를 등록하고 각각의 적, 플레이어, 미사일의 객체를 생성
	public MyPanel() {

		// 키보드 이벤트를 등록
		addKeyListener(this);

		// 컨테이너 역할인 패널에 키보드 이벤트를 등록하기 위하여 다음의 메소드를 호출
		requestFocus();
		setFocusable(true);

		// 적을 위한 객체를 생성
		enermy = new Enermy("enemy.png");

		// 플레이어를 위한 객체를 생성
		spaceship = new SpaceShip("player.png");

		// 미사일을 위한 객체를 생성
		missile = new Missile("misile.png");

		// 적, 플레이어, 미사일이 각자 서로 방해받지 않고 그래픽을 표현하도록 쓰레드 클래스를 만든다.
		// 그리고 이 클래스는 다른 곳에서는 사용될 일이 없고 여기 패널에서만 필요하다.
		// 이 때에 클래스를 클래스 안에 만들 수 있다. ==> inner 클래스
		class MyThread extends Thread {

			@Override
			// run을 오버라이딩하여 쓰레드가 해야할 일을 써준다.
			public void run() {

				// 계속 반복하여 적, 플레이어, 미사일의 위치를 변경하여 다시 그리도록 한다.
				while (true) {
					enermy.update(); // 적의 위치를 변경
					spaceship.update(); // 플레이어의 위치를 변경
					missile.update(); // 미사일의 위치를 변경
					repaint(); // 변경된 위치에 다시 그려준다.
					
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						
					}
					
					
				}
			} // end run

		}// end Thread

		// 쓰레드 객체를 생성
		Thread t = new MyThread();

		// 쓰레드를 가동
		t.start();

	}

	@Override
	// 패널에 그래픽을 표현하기 위하여 paint 메소드를 오버라이딩 한다.
	public void paint(Graphics g) {

		// 부모의 paint를 호출하여 화면을 깨끗하게 지운다.
		super.paint(g);

		// 적을 그린다.
		enermy.draw(g);

		// 플레이어를 그린다.
		spaceship.draw(g);

		// 미사일을 그린다.
		missile.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	// 키보드가 눌러졌을 때에 다음의 메소드가 동작
	public void keyPressed(KeyEvent e) {
		// 키보드가 눌러지면 플레이어의 위치를 변경하도록 메소드를 호출
		spaceship.keyPressed(e);

		// 키보드가 눌러지면 미사일을 발사시키기 위하여 메소드를 호출
		// 현재 플레이어의 위치에서 미사일이 발사되도록 플레이어의 위치를 전달
		missile.keyPressed(e, spaceship.x, spaceship.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

//프레임을 위한 클래스를 만든다.

class MyFrame extends JFrame {

	// 생성자에서 패널을 생성하여 담는다.
	public MyFrame() {
		setTitle("My Game");
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Game {

	public static void main(String[] args) {
		new MyFrame();

	}

}
