package day0404;
/*
 * ��� 		 Person(Ŭ����)
		�Ӽ�
			�̸�		String name		"ȫ�浿"
			���� 		int age			20
			
		����
			�Դ´�	void eat(String food)
			�Ĵ´�	void wash(String soap)*/
public class Person {
	String name;
	int age;
	void eat(String food) { //� ������ �Դ��� �޼ҵ�
		System.out.println(age + "�� " + name + "��(��) " + food + "��(��) �Ծ��");
		
		
	}
	
	void wash(String soap) { //� ������ �Դ��� �޼ҵ�
		System.out.println(age + "�� " + name + "��(��) " + soap + "���� �ľ���");
		
		
	}
}
