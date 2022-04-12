package exam07;
//pdf ������� �׷��� ���� programmin 1��

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//��, �÷��̾�, �̻����� �������� ������ �� �θ�Ŭ������ �����.
class GraphicObject {
	// �׸������� ������ ������ ����
	BufferedImage img = null;

	// �׸��� ����� ��ġ ������ ����
	int x = 0, y = 0;

	// ���� �ÿ� �׸����ϸ��� ���޹޴´�.
	public GraphicObject(String name) {
		try { // �׸������� �о� ���� ���� ���ܰ� �߻��ϱ� ������ ����ó���� ���ش�.
			img = ImageIO.read(new File(name)); // ������ �̸��� �Ű������� ���޹޴´�.

		} catch (IOException e) {
			// ���ܰ� �߻��ϸ� ���� �޽����� ���
			System.out.println("���ܹ߻�: " + e.getMessage());

			// ���ܰ� �߻��ϸ� ���α׷��� �����Ŵ
			System.exit(0);
		}
	}

	// �׷����� ��ġ�� �����ϱ� ���� �޼ҵ带 ����
	// body�� ��üȭ���� �ʾƼ� �ڽ�Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �Ѵ�.
	public void update() {
	}

	// ����� ��ġ�� �׷����� �׷��ֱ� ���� �޼ҵ�
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	// Ű���� �̺�Ʈ�� ó���ϱ� ���� �޼ҵ�
	// body�� ��üȭ���� �ʾƼ� �ڽ�Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �Ѵ�.
	public void keyPressed(KeyEvent event) {
	}

}

//GrapicObject�� Ȯ���� �̻��� Ŭ������ �����.
class Missile extends GraphicObject {
	// �̻����� �׷����� ������ ���� ���º���
	boolean launched = false;

	// ���� �ÿ� �̻����� �׸����� �̸��� ���޹޴´�.
	public Missile(String name) {
		// �׸� ������ �̸��� �θ�����ڿ��� ����
		super(name);

		// �̻����� y��ǥ�� -200���� ����
		y = -200;
	}

	@Override
	// �̻����� ��ġ�� �����ϱ� ���Ͽ� �θ��� update �޼ҵ带 �������̵��Ѵ�.
	public void update() {
		// ���� �̻����� �߻�� ���¶��(�׷���� �� ���¶��)
		// �̻����� ���� �����ϵ��� 1��ŭ ����Ͽ� ���ҽ�Ų��.
		if (launched == true) {
			y -= 50;
		}

		// ���� �̻����� ��ġ�� �����Ͽ� ȭ���� �������� ����ٸ�
		// �̻����� ȭ�鿡 �׸��ʿ䰡 �����Ƿ� launched�� false�� �����Ѵ�.
		if (y < -100) {
			launched = false;
		}

	}

	// Ű���尡 �������� �̺�Ʈ ó���� ���� �޼ҵ带 �����.
	// Ű���� �̺�Ʈ�� �̻����� ����� x,y��ǥ�� �Ű������� ���޹޴´�.
	public void keyPressed(KeyEvent event, int x, int y) {

		// ������ Ű�� �����̽������� �Ǻ�
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {

			// �̻����� �߻��Ű�� ���Ͽ� launched�� true�� ����
			launched = true;

			// �̻����� �����ġ�� ����
			this.x = x;
			this.y = y;
		}
	}

}

//���� ���� Ŭ����
class Enermy extends GraphicObject {
	// ���� x�� �̵� ������ ���ϱ�
	int dx = -10;

	// �����ÿ� ���� �׸����ϸ��� ���޹޴´�.
	public Enermy(String name) {
		// �θ��� �����ڿ��� �׸����ϸ��� ����
		super(name);

		// ���� ��ġ�� ����
		x = 200;
		y = 0;
	}

	@Override
	// ���� ��ġ�� �����Ű�� ���� update �޼ҵ带 �������̵� �Ѵ�.
	public void update() {
		// x�����θ� �̵���Ű�� ���Ͽ� x�� �̵��Ÿ��� dx�� �����Ѵ�.
		x += dx;

		// ����, �̵������� �����ε� x��ġ�� 0���� �۾����� �̵������� ����� �����.
		if (x < 0) {
			dx = +10;
		}

		// ���� �̵������� ����ε� x��ġ�� 500���� Ŀ���� �̵������� ������ �����.
		if (x > 500) {
			dx = -10;
		}
	}

}

//�÷��̾ ���� Ŭ����
class SpaceShip extends GraphicObject {

	// ���� �ÿ� �׸����ϸ��� ���޹޴´�.
	public SpaceShip(String name) {
		// �θ��� �����ڿ��� �׸����ϸ��� ���޹޴´�.
		super(name);

		// �÷��̾��� ��ġ�� ����
		x = 150;
		y = 350;
	}

	// Ű���� �̺�Ʈó���� ���� �޼ҵ带 ����
	public void keyPressed(KeyEvent event) {
		// ���� ����Ű�� �����ٸ� x�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ŵ.
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}

		// ������ ����Ű�� �����ٸ� x�� ���� �������� �÷��̾� ��ġ�� ���������� �̵���Ŵ.
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}

		// ���� ����Ű�� �����ٸ� x�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ŵ.
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}

		// �Ʒ��� ����Ű�� �����ٸ� x�� ���� �������� �÷��̾� ��ġ�� �Ʒ������� �̵���Ŵ.
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}
}

//��, �÷��̾�, �̻����� �׷������� ǥ���ϱ� ���� �г� Ŭ������ �����.
//Ű���� �̺�Ʈ ó���� ���Ͽ� KeyListener �������̽��� ����
class MyPanel extends JPanel implements KeyListener {

	// ������ ��������� ��, �÷��̾�, �̻��� ��ü�� ��������� ����
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;

	// �����ڿ��� Ű�����̺�Ʈ�� ����ϰ� ������ ��, �÷��̾�, �̻����� ��ü�� ����
	public MyPanel() {

		// Ű���� �̺�Ʈ�� ���
		addKeyListener(this);

		// �����̳� ������ �гο� Ű���� �̺�Ʈ�� ����ϱ� ���Ͽ� ������ �޼ҵ带 ȣ��
		requestFocus();
		setFocusable(true);

		// ���� ���� ��ü�� ����
		enermy = new Enermy("enemy.png");

		// �÷��̾ ���� ��ü�� ����
		spaceship = new SpaceShip("player.png");

		// �̻����� ���� ��ü�� ����
		missile = new Missile("misile.png");

		// ��, �÷��̾�, �̻����� ���� ���� ���ع��� �ʰ� �׷����� ǥ���ϵ��� ������ Ŭ������ �����.
		// �׸��� �� Ŭ������ �ٸ� �������� ���� ���� ���� ���� �гο����� �ʿ��ϴ�.
		// �� ���� Ŭ������ Ŭ���� �ȿ� ���� �� �ִ�. ==> inner Ŭ����
		class MyThread extends Thread {

			@Override
			// run�� �������̵��Ͽ� �����尡 �ؾ��� ���� ���ش�.
			public void run() {

				// ��� �ݺ��Ͽ� ��, �÷��̾�, �̻����� ��ġ�� �����Ͽ� �ٽ� �׸����� �Ѵ�.
				while (true) {
					enermy.update(); // ���� ��ġ�� ����
					spaceship.update(); // �÷��̾��� ��ġ�� ����
					missile.update(); // �̻����� ��ġ�� ����
					repaint(); // ����� ��ġ�� �ٽ� �׷��ش�.
					
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						
					}
					
					
				}
			} // end run

		}// end Thread

		// ������ ��ü�� ����
		Thread t = new MyThread();

		// �����带 ����
		t.start();

	}

	@Override
	// �гο� �׷����� ǥ���ϱ� ���Ͽ� paint �޼ҵ带 �������̵� �Ѵ�.
	public void paint(Graphics g) {

		// �θ��� paint�� ȣ���Ͽ� ȭ���� �����ϰ� �����.
		super.paint(g);

		// ���� �׸���.
		enermy.draw(g);

		// �÷��̾ �׸���.
		spaceship.draw(g);

		// �̻����� �׸���.
		missile.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	// Ű���尡 �������� ���� ������ �޼ҵ尡 ����
	public void keyPressed(KeyEvent e) {
		// Ű���尡 �������� �÷��̾��� ��ġ�� �����ϵ��� �޼ҵ带 ȣ��
		spaceship.keyPressed(e);

		// Ű���尡 �������� �̻����� �߻��Ű�� ���Ͽ� �޼ҵ带 ȣ��
		// ���� �÷��̾��� ��ġ���� �̻����� �߻�ǵ��� �÷��̾��� ��ġ�� ����
		missile.keyPressed(e, spaceship.x, spaceship.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

//�������� ���� Ŭ������ �����.

class MyFrame extends JFrame {

	// �����ڿ��� �г��� �����Ͽ� ��´�.
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
