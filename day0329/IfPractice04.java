package day0329;

import java.util.Scanner;

public class IfPractice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.print("���� �Է��ϼ���: ");
		m = sc.nextInt();
		
		if (m == 3 || m == 4 || m == 5) {
			System.out.println(m + "���� ���Դϴ�." );
		} else if (m == 6 || m == 7 || m == 8) {
			System.out.println(m + "���� �����Դϴ�." );
		} else if (m == 9 || m == 10 || m == 11) {
			System.out.println(m + "���� �����Դϴ�." );
		} else if (m == 12 || m == 1 || m == 2) {
		System.out.println(m + "���� �ܿ��Դϴ�." );
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}

	}

}
