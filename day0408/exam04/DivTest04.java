package exam04;

import java.util.Scanner;

//���α׷� ���� �� �� ���� ������ ���޹޾� ������ �� ����� ���
//java DivTest 4 2 
//�߻��� �� �ִ� �پ��� ���ܿ� ���� ó���� ����
public class DivTest04 {

	public static void main(String[] args) {
		int a, b, div;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a / b;
			System.out.println("������ ���: " + div);
		} catch (ArithmeticException e) { // catch���� ���� ���� �ڽ�Ŭ�������� �;� �Ѵ�.

			System.out.println("0���δ� ���� �� �����!");
		} catch (Exception e) { // ��� ����ó��
			System.out.println("������ �� �� ���� ������ ������ �ּ���.");
		}
	}

}
