package exam08;

public class PersonTest {

	public static void main(String[] args) {
//		Person p1;
//		p1 = new Person();
		
		Person p1 = new Person(); //�Ű������� �ϳ��� ������ Person.java���� �����س��� ȫ�浿�� ����.
		Person p2 = new Person("�̼���" , 30);
		Person p3 = new Person("�̼���");
		Person p4 = new Person(30);
		
		p1.eat("���");
		p2.eat("���");
		p3.eat("���");
		p4.eat("���");
		
		

	}

}
