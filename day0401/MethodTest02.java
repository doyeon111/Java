package day0401;

public class MethodTest02 {
	public static void sayHello(){ //�޼ҵ��� ����
		System.out.println("����� �ȳ�"); //�̷��� ���� �� �ݺ��Ǵ� �͵��� ��� �����ֱ� ���ٴ� �޼ҵ带 �����Ͽ� ȣ���ϸ� �����ϰ� �ڵ带 �ۼ��� �� �ִ�.
		System.out.println("����� �ȳ�");
		System.out.println("����� �ȳ�");
		return; //ȣ���� ������ �ǵ��ư�.
	}

	public static void main(String[] args) {
		sayHello(); //�޼ҵ��� ȣ��
		
		
		int year = 2022;
		
		System.out.println("���ش� " + year + "���� �Դϴ�.");
		sayHello(); //�޼ҵ��� ȣ��
		
		String title = "�ֿ뱳������";
		System.out.println(title + "���� �Ʒùް� �־��.");
		
		sayHello(); //�޼ҵ��� ȣ��
	}

}
