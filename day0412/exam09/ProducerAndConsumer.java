package exam09;

import java.util.Random;

//제품에 대한 클래스
class Product {
	// 난수발생을 위한 랜덤객체를 생성
	Random r = new Random();

	// 생산자는 계속해서 새로운 정수를 만들어내고, 소비자는 그 정수를 가져다 쓰도록 한다.
	private int num;

	// 새로운 제품이 생산되었는지 판별할 변수를 만든다.
	// 생산자가 새로운 제품을 만들면 true에 담고, 소비자가 제품을 소비하면 false에 담는다.
	boolean isNew;

	// 생산을 위한 메소드
	public synchronized void makeNumber() {

		// 아직 소비자가 소비를 안한동안 기다린다.
		while (isNew == true) {

			try {
				wait();
			} catch (Exception e) {

			}
		}

		// 새로운 제품을 생산한다.
		num = r.nextInt(100);

		System.out.println("생산자가 새로운 제품을 생산하였습니다. ===>" + num);

		// 새로운 제품이 생산되었다는 표시로 isNew에 true를 저장
		isNew = true;

		// 대기중인 소비자를 깨워준다
		notify();
	}

	// 소비를 위한 메소드
	public synchronized int useNum() {

		// 생산자가 새로운 제품을 생산할 때까지 기다림.
		while (isNew == false) {
			try {
				wait(); // 기다리는 메소드는 예외처리를 안고있다.
			} catch (Exception e) {

			}
		}

		// 소비되었다고 표시하기 위하여 isNew에 false를 저장
		isNew = false;

		// 대기중인 생산자를 깨워줌.
		notify();

		System.out.println("소비자가 제품을 소비하였습니다. ==> " + num);

		return num;
	}

}

//생산자 클래스
class Producer extends Thread {
	// 제품 클래스를 멤버변수로 선언
	Product product;

	// 생성시에 제품객체를 전달받는다.
	public Producer(Product product) {
		this.product = product;
	}

	// run을 오버라이딩하여 스레드가 해야할 일을 써준다.
	public void run() {

		// 10번 반복하여 새로운 제품을 생산하도록 한다.
		for (int i = 0; i <= 10; i++) {
			product.makeNumber();

			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}

}

//소비자 클래스
class Consumer extends Thread {
	// 제품을 멤버변수로 선언
	private Product product;

	// 생성시에 제품을 전달받는다.
	public Consumer(Product product) {
		this.product = product;
	}

	// run을 오버라이딩 하여 스레드가 해야할 일을 써준다.
	public void run() {
		for (int i = 0; i < 10; i++) {
			product.useNum();

			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}
		}
	}

} 

public class ProducerAndConsumer {

	public static void main(String[] args) {
		//제품객체를 생성
		Product product = new Product();
		
		//생산자객체를 생성
		Producer pd = new Producer(product);
		
		//소비자객체를 생성
		Consumer c = new Consumer(product);
		
		//생산자의 스레드를 가동
		pd.start();
		
		//소비자의 스레드를 가동
		c.start();

	}

}
