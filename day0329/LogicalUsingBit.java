package day0329;

import java.util.Scanner;

public class LogicalUsingBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		double height;
		
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���: ");
		height = sc.nextInt();
		
		if(age >= 30 & height <= 160) { // & ���� ������ -> �������ڷ� ��밡��
			System.out.println("���尡��");
		} else {
			System.out.println("����Ұ���");
		}
	}

}
