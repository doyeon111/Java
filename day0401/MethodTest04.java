package day0401;

public class MethodTest04 {

	public static void sayHello(String name, int n) { // �޼ҵ��� ���� , �̸��� �������ֱ� ���� name�� ������
		for (int i = 1; i <= n; i++) {
			System.out.println(name + "��(��) �ȳ�");
		}
		return; // ȣ���� ������ �ǵ��ư�.
	}

	public static void main(String[] args) {
		sayHello("����", 10); // �޼ҵ��� �̸��� ȣ��

		int year = 2022;

		System.out.println("���ش� " + year + "���� �Դϴ�.");
		sayHello("����", 5); // �޼ҵ��� ȣ��

		String title = "�ֿ뱳������";
		System.out.println(title + "���� �Ʒùް� �־��.");

		sayHello("����", 2); // �޼ҵ��� ȣ��
	}

}
