package day0330;

import java.util.Scanner;

public class SwitchPractice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.print("���� �Է��ϼ���: ");
		m = sc.nextInt();
		
		switch (m) {
		case 3,4,5: System.out.println(m + "���� ���Դϴ�."); break;
		case 6,7,8: System.out.println(m + "���� �����Դϴ�."); break;
		case 9,10,11: System.out.println(m + "���� �����Դϴ�."); break;
		case 12,1,2: System.out.println(m + "���� �ܿ��Դϴ�."); break;
		default: System.out.println("������ ������ϴ�.");
		}
	}

}
