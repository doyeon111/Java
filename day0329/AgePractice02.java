package day0329;

import java.util.Scanner;

public class AgePractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstAge, secondAge;
		
		System.out.print("ù ��° ����� ���̸� �Է��ϼ���: ");
		firstAge = sc.nextInt();
		System.out.print("�� ��° ����� ���̸� �Է��ϼ���: ");
		secondAge = sc.nextInt();
		
		if (firstAge == secondAge) {
			System.out.println("���̰� �����ϴ�.");
		} else {
			System.out.println("���̰� ���� �ʽ��ϴ�.");
		}

	}

}
