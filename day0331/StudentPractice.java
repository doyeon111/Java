package day0331;

import java.util.Scanner;

public class StudentPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] student = new int[5];
		int total = 0;

		for (int i = 0; i < student.length; i++) {
			System.out.print((i+1) + "��° �л��� ������ �Է��ϼ���: ");
			student[i] = sc.nextInt();
		}
		
		System.out.println("*** ���� ó�� ��� ***");
		
		for(int i=0; i<student.length; i++) {
			System.out.println((i+1) + "��° �л��� ����: " + student[i]);
			total += student[i];
		}
		
		double avg = total / (double)student.length;
		System.out.println("������ ����: " + total);
		System.out.println("������ ���: " + avg);

	}

}
