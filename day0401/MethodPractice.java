package day0401;

//�� ���� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ����ϴ� �޼ҵ带 ����
//�޼ҵ��� ���ҿ� ���� ���ϰ��� �������� �ְ� ���� ���� �ִ�. 
//���� ���� ���� ���� �޼ҵ� �̸� ���ʿ� ���� ���� �ڷ����� ���ش�. 
//���� ���� ���� ���� void ��� ���ش�. 
public class MethodPractice {
	public static int max(int a, int b) { //void�� �������� return���� �ƹ��͵� ���� ��� ��.
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r; //���� ���� �ڷ����� ���� �޼ҵ� �̸� ���ʿ� ������ �ڷ����� ���ش�.
	}

	public static void main(String[] args) {
		int result = max(3, 4); //��� int�� �������.
		
		System.out.println(result);
		System.out.println(max(40,30));

	}

}
