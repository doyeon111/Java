package day0329;

import java.util.Scanner;

public class BooleanPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		boolean a;
		
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		a = age >= 20;
		System.out.println(age + "�̹Ƿ� " + a);
	}

}
