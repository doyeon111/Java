package exam01;

import java.util.Scanner;

//��������� �� ���� ������ �Է¹޾� ������ �� ����� ���
public class DivTest {

	public static void main(String[] args) {
		int a, b, div;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("ù ��° ���� �Է��ϼ���: ");
			a = sc.nextInt();

			System.out.print("�� ��° ���� �Է��ϼ���: ");
			b = sc.nextInt();

			div = a / b;
			System.out.println("������ ���: " + div);
		} catch (ArithmeticException e) { //0���� �������� �� ����
			System.out.println("0���δ� ���� �� �����.");
		}
	}

}
