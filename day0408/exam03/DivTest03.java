package exam03;

import java.util.Scanner;

//���α׷� ���� �� �� ���� ������ ���޹޾� ������ �� ����� ���
//java DivTest 4 2 
//�߻��� �� �ִ� �پ��� ���ܿ� ���� ó���� ����
public class DivTest03 {

	public static void main(String[] args) {
		int a, b, div;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a / b;
			System.out.println("������ ���: " + div);
		} catch (ArithmeticException e) { // 0���� �������� �� ����
			System.out.println("0���δ� ���� �� �����!");
		} catch (NumberFormatException e) {
			System.out.println("���� ���Ŀ� ���� �ʽ��ϴ�!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� �� ���� �������ּ���!");
		}
	}

}
