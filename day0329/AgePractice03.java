package day0329;

import java.util.Scanner;

public class AgePractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double h;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���: ");
		h = sc.nextDouble();
		
		if (age >= 30 && h <= 160) {
			System.out.println(name + "��, ���尡��");
		} else {
			System.out.println(name + "��, ����Ұ���");
		}

	}

}
