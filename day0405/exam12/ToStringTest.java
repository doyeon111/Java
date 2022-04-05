package exam12;

import java.util.Objects;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//������ ���콺�� �ڵ�����
	@Override //�������̵� �ƴٴ� ǥ��
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) {
		Person kim = new Person("�����", 28);
		Person kim2 = new Person("�����", 28);
		System.out.println(kim); //exam12.Person@1c4af82c�� ��µ�.(�ּҰ�) ==> �������̵� �Ŀ��� ���������� ��µ�.
		//�ּҸ��� �� ��ü�� �����ִ� �Ӽ����� ����ϰ� �ʹ�.
		// �׷��� �Ϸ��� �ڹ� ������ ���� ����Ŭ������ Object�� toString�� ������ �°� �������Ѵ�.
		//��¹��� ��ü�� ǥ���ϸ� toString�� �ڵ����� ��µȴ�.
		if(kim.equals(kim2)) {
			System.out.println("���ƿ�");
		} else {
			System.out.println("�޶��");
		}
	}

}
