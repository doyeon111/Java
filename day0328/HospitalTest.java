package day0328;

import java.util.Scanner;

public class HospitalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
	
		
		if (age >= 40) {
			System.out.println(name + "��, �� ���� ������Դϴ�.");
		} else {
			System.out.println(name + "��, �� ���� ����ڰ� �ƴմϴ�.");
		}

	}

}
