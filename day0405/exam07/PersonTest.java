package exam07;

class Person { //�θ��� �����ڰ� ���� �����Ѵ�.
	public Person() {
		System.out.println("Person�� ������ ������!");
	}
}

class Customer extends Person { // �θ��� �����ڰ� ������ �Ŀ� �ڽ��� �����ڰ� �����Ѵ�.
	public Customer() {
		//super(); //�θ��� �Ű������� ���� �ʴ� ������ ==> �⺻�����ڸ� �䱸�ϴ� ����� �����Ǿ��ִ�.
		System.out.println("Customer�� ������ ������.");
	}
}
 
public class PersonTest {

	public static void main(String[] args) {
		Customer c = new Customer(); //�⺻�����ڰ� �����ȴٴ� ��

	}

}
