package day0330;

import java.util.Scanner;

public class ForPractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n; //������� �Է°� �����ϱ� ���� ����
		int even_sum = 0, even_cnt = 0; //sum = ¦���� ��, cnt = ¦���� ��
		int odd_sum = 0, odd_cnt = 0; // sum = Ȧ���� ��, cnt = Ȧ���� ��
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even_sum += i; //¦���� �� ����
				even_cnt++; //¦���� ��
			} else {
				odd_sum += i; //Ȧ���� �� ����
				odd_cnt++; // Ȧ���� ��
			}
		}
			

		System.out.println("1���� " + n + "������ ¦���� ��:" + even_cnt);
		System.out.println("1���� " + n + "������ ¦���� ��:" + even_sum);
		System.out.println("1���� " + n + "������ Ȧ���� ��:" + odd_cnt);
		System.out.println("1���� " + n + "������ Ȧ���� ��:" + odd_sum);
	}

}
