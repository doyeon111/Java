package exam01;

//final Ŭ���� ������ �տ� �� ���

class Person {
	String name = "ȫ�浿";
	int age = 20;
	final static String ADDR = "����� ������ ������"; //final�̸� static�̴�. (����� ��� �빮�ڷ� ǥ���Ͽ� �Ϲ� ��������� �����Ѵ�.)
	//final�� ������ �� �ٲٴ� ���̶� ��ü���� ���� �޸𸮸� ���� �ʿ䰡 ����.
	//�׷��� final�̸� static���� ���� ��� ��ü�� ���� ����Ѵ�.
}

public class FinalTest01 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 21;
		p2.age = 31; //���� ���� �� ����.
		
		//p1.ADDR = "���ֵ� �������� �ֿ���"; //final�� ���� �־��� ������ �����ؼ� ���� �ٲ� �� ����. ������ �߻�
		//p2.ADDR = "��⵵ ���ֽ�" //addr�� ����̱� ������ ���� ������ �� ����.

	}

}
