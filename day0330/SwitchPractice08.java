package day0330;

import java.util.Scanner;

public class SwitchPractice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, date = 31;
		//30: 4, 6, 9, 11
		//31: 1, 3, 5, 7, 8, 10, 12
		//28: 2
		
		System.out.print("���� �Է��ϼ���: ");
		m = sc.nextInt();
		
//		if (m >= 1 && m <= 12) {
//			switch (m) {
//			case 1,3,5,7,8,10,12: System.out.print(m + "���� 31�ϱ��� �־��!"); break;
//			case 2: System.out.print(m + "���� 28�ϱ��� �־��!"); break;
//			case 4,6,9,11: System.out.print(m + "���� 30�ϱ��� �־��!"); break;
//
//			}
//		} else {
//			System.out.println("�Է� ������ ������ϴ�.");
//		}
		
		if (m < 1 || m > 12) {
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
			return;
		}
		switch (m) {
		case 2: date = 28;
		case 4,6,9,11: date = 30;
		} System.out.println(m + "���� " + date + "�� ���� �־��!");
	}

}
