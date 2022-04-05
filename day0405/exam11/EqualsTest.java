package exam11;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object p) {
		boolean f = false;
		Person p2 = (Person)p; //�̰��� ��������� name�� age�� ����� �� �ִ�.
		
		//���� �̸��� �Ű������� ���޹��� ����� �̸��� ����, ���� ���̿� �Ű������� ���޹��� ����� ���̰� ������ �Ǻ�
		//String�� ���� ������ Ȯ���Ϸ��� equals�� �̿�
		if(name.equals(p2.name) && age == p2.age) { //���� �̸��� ���޹��� name�� ��������? ��, ���� ���̿� ���޹��� ���̰� ��������?
			f = true;
		}
		return f;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("�����", 28);
		Person p2 = new Person("�����", 28);
		if(p1 == p2) { //���� �ٸ��ٰ� ���´�. �ٸ� �޸𸮸� �ٶ󺸰� �ֱ� ������ ���� �ٸ���.
			System.out.println("���ƿ�");
		} else {
			System.out.println("�޶��");
		}
		System.out.println("-------------------------------------");
		System.out.println("equals �޼ҵ带 �̿��� ��");
		if(p1.equals(p2)) {
			System.out.println("���ƿ�");
		} else {
			System.out.println("�޶��");
		}
	}

}
