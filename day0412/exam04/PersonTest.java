package exam04;

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
		System.out.println(Thread.MAX_PRIORITY); //10
		System.out.println(Thread.MIN_PRIORITY); //1
		System.out.println(Thread.NORM_PRIORITY); //5
		
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		Person p3 = new Person("김유신");
		
		p1.setPriority(Thread.MIN_PRIORITY); //최고 우선순위
		p2.setPriority(1); //바로 위에처럼 써줘도 되고 1로써줘도 동일
		p3.setPriority(Thread.MAX_PRIORITY ); //일을 먼저 끝내달라고 요청을 하지만 꼭 반드시 먼저 끝내는 것은 아니다.

		p1.start(); //둘이 공평하게 실행할 수 있게 끔 
		p2.start();
		p3.start();

	}

} 
