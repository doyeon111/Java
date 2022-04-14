package exam03;

class Person implements Runnable { //Runnable 인터페이스를 상속받아 쓰레드

	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello, " + name + " " + i);
			
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
		
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		
		//p1.start(); // Runnable 인터페이스에는 start가 없다.
		
		//Runnable 인터페이스를 구현한 객체를 쓰레드를 가동시키기 위해서는 Thread 클래스의 객체를 생성한 후 가동해야 한다.
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		t1.start(); //thread객체로 포장하여 start를 실행해야 한다.
//		t2.start();
		
		
		(new Thread(p1)).start(); //바로 객체를 생성하여 바로 start해도 된다.
		(new Thread(p2)).start();
		
	}

}
 
