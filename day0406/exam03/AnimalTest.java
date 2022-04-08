package exam03;

abstract class Animal {

	// 모든 동물은 움직인다. 라는 기능
	public abstract void move(); // 자식이 반드시 오버라이딩 하도록 강제

	public void pro() { // 자식이 오버라이딩 해도 되고, 안 해도 되고 선택사항

	}

}

class Lion extends Animal {
	public void move() {
		System.out.println("사자는 네 발로 걷거나 뛰어서 움직입니다.");
	}
}

class Snake extends Animal {
	public void move() {
		System.out.println("뱀은 기어서 움직입니다.");
	}
}

class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("새는 날아서 움직입니다.");

	}

}

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Snake snake = new Snake();
		Bird bird = new Bird();
		
		lion.move(); //사자는 네 발로 걷거나 뛰어서 움직입니다.
		snake.move(); //뱀은 기어서 움직입니다.
		bird.move(); //새는 날아서 움직입니다.

		//객체에게 시킨 일은 동일하다.(객체에게 동일한 메세지를 주었다.)
		//그런데 객체마다 서로 동작하는 방식이 다르다.(다양하다.)
		// == 다형성

	}

}
 
