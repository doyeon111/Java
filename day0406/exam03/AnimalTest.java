package exam03;

abstract class Animal {

	// ��� ������ �����δ�. ��� ���
	public abstract void move(); // �ڽ��� �ݵ�� �������̵� �ϵ��� ����

	public void pro() { // �ڽ��� �������̵� �ص� �ǰ�, �� �ص� �ǰ� ���û���

	}

}

class Lion extends Animal {
	public void move() {
		System.out.println("���ڴ� �� �߷� �Ȱų� �پ �����Դϴ�.");
	}
}

class Snake extends Animal {
	public void move() {
		System.out.println("���� �� �����Դϴ�.");
	}
}

class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("���� ���Ƽ� �����Դϴ�.");

	}

}

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Snake snake = new Snake();
		Bird bird = new Bird();
		
		lion.move(); //���ڴ� �� �߷� �Ȱų� �پ �����Դϴ�.
		snake.move(); //���� �� �����Դϴ�.
		bird.move(); //���� ���Ƽ� �����Դϴ�.

		//��ü���� ��Ų ���� �����ϴ�.(��ü���� ������ �޼����� �־���.)
		//�׷��� ��ü���� ���� �����ϴ� ����� �ٸ���.(�پ��ϴ�.)
		// == ������

	}

}
