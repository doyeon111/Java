package day0329;

public class SwapTest {

	public static void main(String[] args) {
		// �� ���� ������ ���� ���� �¹ٲپ� ���ô�.
		int a = 17;
		int b = 24;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int temp; //�ӽú���
		temp = a;
		a = b;
		b = temp; // a�� b�� ���� ���� �¹ٲ����� ���� Ȯ��
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
