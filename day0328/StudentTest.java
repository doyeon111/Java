package day0328;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, tot, avg;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name =  sc.next();
		System.out.print("���� ������ �Է��ϼ���: ");
		kor =  sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng =  sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		math =  sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3;
		
		String result = "";
		
		if (avg >= 60) {
			result = "�հ�";
		} else {
			result ="���հ�";
		}
		
		System.out.println("*** ���� ó�� ��� ***");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		System.out.println("����: " + tot);
		System.out.println("���: " + avg);
		System.out.println("���: " + result);
		
	}

}

