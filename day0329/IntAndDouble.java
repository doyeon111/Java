package day0329;

public class IntAndDouble {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		double r = a / b; // ���� 2.5�� �ƴ� 2.0�� ����. �� ������, a�� b�� ��� int �̱� ����
		System.out.println(r);
		
		double r2 = a / (double)b; //���ϴ� 2.5�� ���� �� �ִ�.
		System.out.println(r2);
	}

}
