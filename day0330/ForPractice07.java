package day0330;

import java.util.Scanner;

public class ForPractice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i; 
		
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for(i = 2; i < n; i++) {
			if(n % i == 0) { 
				break; //�ϳ��� ������ ���� ���� ������ Ż��
			}
			
		}
		//���࿡ n�� �Ҽ���� i�� n�� ���� �� �ݺ����� Ż��
		if(i == n) {
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		} else { 
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}

}
