package day0330;

import java.util.Scanner;

public class ForPractice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0; //n�� ����ڷ� ���� �Է¹ޱ� ���� ����, cnt�� �Է¹��� n�� ����� ������ ���� ����
		
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) { //n�� ����� ���ϱ�
				cnt++; //����� ������ ������Ŵ.
			}
			
		}
		if(cnt == 2) { //����� ������ 2���̸� �Ҽ�
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}

}
