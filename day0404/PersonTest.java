package day0404;

public class PersonTest {

	public static void main(String[] args) {
		int a; //a�� ������Ÿ���� int
		a=5;
		double b;
		b=2.7; //�⺻ �ڷ����� �ٷ� �����Ͽ� ����� �� ������,
		
		Person kim; //��ü ���� ����
		kim = new Person(); //Ŭ������ �̷��� �������� ����� �� �ִ�.
		//���� �� �� kim.name = "�����"; .�� ���ٿ����� (������ٿ�����) 
		//kim.age = 28;
		kim.name = "�����";
		kim.age = 28;
		kim.wash("��Ǫ");
		kim.eat("����");
		
		
		Person park;
		park = new Person();
		park.name = "������";
		park.age = 30;
		park.eat("�ʹ�");
		park.wash("�ٵ����");

	}

}
