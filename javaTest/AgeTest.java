package day0328;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		if (age >= 10 && age <= 19) {
			System.out.println("10�� �Դϴ�.");
		} else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
		

	}

}
