package day0329;

import java.util.Scanner;

public class AgePractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("���尡��");
		} else {
			System.out.println("����Ұ���");
		}

	}

}
