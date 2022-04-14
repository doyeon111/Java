package exam02;

class Person extends Thread {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello, " + name + " " + i);

			try {
				Thread.sleep(100); // 대기시간을 생성 , 컴퓨터를 0.1초 멈추도록 한다.
			} catch (Exception e) {

			}
		}
	}

}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		
//		p1.run(); //일반메소드로 호출하여 p1이 끝나야만 p2를 실행함.
//		p2.run();
		
		p1.start(); //둘이 공평하게 실행할 수 있게 끔 
		p2.start();

	}

} 
