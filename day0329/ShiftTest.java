package day0329;

public class ShiftTest {

	public static void main(String[] args) {
		int i = 8; //2���� 0000 1000
		int a = i << 1; // 0001 0000 = 16 // �� ���� * 2 �� ��� ���� ����.
		int b = i >> 1; // 0000 0100 = 4 // �� ���� / 2 �� ��� ���� ����.
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
