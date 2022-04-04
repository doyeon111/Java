package exam05;

public class Person {
	private String name;
	private int age;
	
	//�����ڰ� �Ű������� ���� ���� �ִ�.(�Ű����� 2��)
	public Person(String n, int a) { //Ŭ���� �̸��� �����ϰ�
		name = n;
		age = a;
	}
	
	//������ �Լ��� �ߺ��� �� �ִ�.
	public Person() {
		name = "ȫ�浿";
		age = 20;
	}
	
	public Person(String n) {
		name = n;
		age = 20;
	}
	
	public Person(int a) {
		name = "ȫ�浿";
		age = a;
	}
	
	//name�� �����Ͽ� ���� �����ϴ� �޼ҵ带 �����.
	public void setName(String n) { //setName, setAge ���� �ɹ��� �����Ͽ� ���� �����Ű�� �޼ҵ�� ==> setter(������)��� �Ѵ�.
		name = n;
	}
	//age�� �����Ͽ� ���� �����ϴ� �޼ҵ�
	public void setAge(int a) {
		age = a;
	}
	
	//name�� ��ȯ�ϴ� �޼ҵ带 �����.
	public String getName() { //getName, getAge�� ���� �ɹ������� �����Ͽ� ���� �о���� ��ɵ� ==> getter(������)��� �Ѵ�.
		return name;
	}
	
	//age�� ��ȯ�ϴ� �޼ҵ�
	public int getAge() {
		return age;
	}
	
	public void eat(String food) {
		System.out.println(age + "�� " + name + "��(��) " + food + "��(��) �Ծ��!");
	}
	
	public void wash(String soap) {
		System.out.println(age + "�� " + name + "��(��) " + soap + "���� �ľ��!");
	}
}
