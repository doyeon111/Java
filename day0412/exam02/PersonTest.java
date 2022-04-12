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
				Thread.sleep(100); // ���ð��� ���� , ��ǻ�͸� 0.1�� ���ߵ��� �Ѵ�.
			} catch (Exception e) {

			}
		}
	}

}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
		
//		p1.run(); //�Ϲݸ޼ҵ�� ȣ���Ͽ� p1�� �����߸� p2�� ������.
//		p2.run();
		
		p1.start(); //���� �����ϰ� ������ �� �ְ� �� 
		p2.start();

	}

}
