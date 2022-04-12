package exam03;

class Person implements Runnable { //Runnable �������̽��� ��ӹ޾� ������

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
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
		
		//p1.start(); // Runnable �������̽����� start�� ����.
		
		//Runnable �������̽��� ������ ��ü�� �����带 ������Ű�� ���ؼ��� Thread Ŭ������ ��ü�� ������ �� �����ؾ� �Ѵ�.
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		t1.start(); //thread��ü�� �����Ͽ� start�� �����ؾ� �Ѵ�.
//		t2.start();
		
		
		(new Thread(p1)).start(); //�ٷ� ��ü�� �����Ͽ� �ٷ� start�ص� �ȴ�.
		(new Thread(p2)).start();
		
	}

}
