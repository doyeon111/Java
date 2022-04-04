package exam08;

public class Person {
	private String name;
	private int age;
	
	//�����ڰ� �Ű������� ���� ���� �ִ�.(�Ű����� 2��)
	public Person(String name, int age) {
		this.name = name; //this�� ����� �� �ǹ̸� ��Ȯ�ϰ� ������ �� �ִ�.
		this.age = age;
	}
	
	//������ �Լ��� �ߺ��� �� �ִ�.
	public Person() {
		name = "ȫ�浿"; //�̷���쿡�� this�� ���൵ �ǰ� �� ���൵ �ȴ�.
		age = 20;
	}
	
	public Person(String name) {
		this.name = name;
		age = 20;
	}
	
	public Person(int age) {
		name = "ȫ�浿";
		this.age = age;
	}
	
	//name�� �����Ͽ� ���� �����ϴ� �޼ҵ带 �����.
	public void setName(String name) { //setName, setAge ���� �ɹ��� �����Ͽ� ���� �����Ű�� �޼ҵ�� ==> setter(������)��� �Ѵ�.
		this.name = name;
	}
	//age�� �����Ͽ� ���� �����ϴ� �޼ҵ�
	public void setAge(int age) {
		this.age = age;
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
