package day0329;

import java.util.Scanner;

//����ڿ��� n�� �Է¹޾� �������, 0����, �������� �Ǻ��ϴ� ���α׷�
public class IfPractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("���");
		} else if (n < 0) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
