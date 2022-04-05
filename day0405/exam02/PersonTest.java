package exam02;

class Person {
	String name; // �Ϲ� �������� ��ü�� �����ؾ߸� �޸� ������ Ȯ���ȴ�.
	int age;
	static String addr; // Ŭ���� ���� -> ��ü�� �����ϰ� ����ϰų� ��� ��ü�� �������� ����ϴ� ������
	
	public void sayHello() { //�Ϲ� �޼ҵ�
		System.out.println("�ȳ�, " + name);
	}
	
	public static void pro() { //��ü�� �����ϰ� ��ü���̵� �����ϰ� ���� �� �տ� static�� �ٿ��ش�. ==> Ŭ�����޼ҵ�
		System.out.println("Person�� pro �Դϴ�.");
		//System.out.println(name); //name, age�� static �ȿ��� ���� �� �� ����.
		System.out.println(addr); //����
		//static �޼ҵ�(Ŭ�����޼ҵ�) �ȿ����� static ���(Ŭ��������, Ŭ�����޼ҵ�)���� ������ �� �ִ�.
		//��ü�� �����ؾ߸� Ȯ���Ǵ� �Ϲݸ������ ������ �� ����!
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person.pro(); //static �޼ҵ�� ��ü�� �����ϰ� ȣ���� �� �ִ�. Ŭ���� �̸����� �����Ѵ�.
		
		Person.addr = "����� ������ ������"; // ��ü ���� �����ؾ� �ϹǷ� Ŭ���� �̸����� �����Ѵ�. ==> Ŭ��������
		System.out.println(Person.addr);

		Person kim = new Person(); // ��ü���� , ��ü�� �����ؾ����� ���� class Person�� �ִ� name�� age ��Ʈ��ŭ �޸𸮰� ������.
		Person lee = new Person(); // lee�� kim�� name, age�� ������ �޸�
		kim.name = "�����";
		kim.age = 28;

		lee.name = "������";
		lee.age = 26;
		
		kim.sayHello();
		lee.sayHello(); //�Ϲ� ��� �޼ҵ�� �ݵ�� ��ü�� �����ϰ� �� ��ü�� ���ؼ� ����� �� �ִ�.

		System.out.println(kim.name + ", " + kim.age + ", " + kim.addr); // ��ü�� ������ ��ü�� ���ؼ��� ������ �� �ִ�.
		System.out.println(lee.name + ", " + lee.age + ", " + lee.addr);

		kim.addr = "���ֵ� �������� �ֿ���"; // �������� ����ϴ� �������̱� ������ ��� addr�� �ٲ��.
		System.out.println(kim.addr); // ��ü�� ������ ��ü�� ���ؼ��� ������ �� �ִ�.
		System.out.println(lee.addr);
		System.out.println(Person.addr);
	}

}
