package exam14;

class Person {
	private String name;
	int age; //�ڵ����� int�� 0, string ���� null�� �����ȴ�.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}



public class PersonTest01 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("�⺻ �����ڷ� ��ü�� ������ �� �ִ�.");
		System.out.println("�̸�: " + p.getName());
		System.out.println("����: " + p.getAge());

	}

}
