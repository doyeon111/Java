package day0401;

public class MethodTest03 {

	public static void sayHello(String name) { // �޼ҵ��� ���� , �̸��� �������ֱ� ���� name�� ������
		for (int i = 1; i <= 3; i++) {
			System.out.println(name + "��(��) �ȳ�");
		}
		return; // ȣ���� ������ �ǵ��ư�.
	}

	public static void main(String[] args) {
		sayHello("����"); // �޼ҵ��� �̸��� ȣ��

		int year = 2022;

		System.out.println("���ش� " + year + "���� �Դϴ�.");
		sayHello("����"); // �޼ҵ��� ȣ��

		String title = "�ֿ뱳������";
		System.out.println(title + "���� �Ʒùް� �־��.");

		sayHello("����"); // �޼ҵ��� ȣ��
	}

}
