package practice274;


class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}

class Bird extends Animal {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void fly() {
		System.out.println("���� �� ����");
	}
	
	void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}
