package day0328;

import java.util.Date;
import java.util.Scanner;

public class HospitalAddEven02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date(); // ���� ������ ���� ��¥�� ������.
		int thisYear = today.getYear() + 1900;
		String name;
		int userYear;
		int age;
		
		System.out.println("*** ���� �ϰ��� ����� Ȯ�� ���α׷� ***");
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("����⵵�� �Է��ϼ���: ");
		userYear = sc.nextInt();
		
		age = thisYear - userYear; //������ ���� ���ϱ�
		
		System.out.println("*** ��� Ȯ�� ***");
//		System.out.println("�̸�: " + name);
		System.out.println("�̹��⵵: " + thisYear);
		System.out.println("����⵵: " + userYear);
		System.out.println("����: " + age);
		
		if (age >= 40 && thisYear % 2 == userYear % 2) {
			System.out.println(name + "��, ���� �ϰ��� ������Դϴ�.");
		} else {
			System.out.println(name + "��, ���� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
		
		
	}

}
