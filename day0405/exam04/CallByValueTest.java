package exam04;
//���� ���� ȣ�⿡ ���� Ư¡
class Exam01 {
	// ������ �����ϳ��� �Ű������� ���޹޾� 1 ������Ű�� �޼ҵ�
	public static void plusOne(int n) {
		n = n + 1;
		System.out.println(n); //���� �� ����
		System.out.println("�޼ҵ� �ȿ��� ���� �����Ͽ����ϴ�.");
		System.out.println();
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		int age;
		age = 28;
		Exam01.plusOne(age); //Ŭ���� �̸����� static �޼ҵ带 �ҷ��� �� �ִ�.(�޼ҵ� ȣ��)
		System.out.println("����: " + age); //n=n+1�� 1 ���� ���� �ƴ� ������ �� 28�� ��µǰ� �ȴ�.(�⺻�ڷ����� ���޵Ǳ� ������)
		System.out.println("�׷��� �޼ҵ� ȣ���ϴ� �ʿ����� ����� ������ ������� �ʾƿ�!");
	}

}
