package day0331;

import java.util.Scanner;

public class FactorialPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=1;
		
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		int i=n; //i�� �ʱⰪ�� n���� ����
		while(i>=1) { //i�� 1���� ũ�ų� ��������
			sum *= i; //i�� ���� ���� ����
			System.out.print(i);
			if(i != 1) {
				System.out.print("*");
			}
			i--;
			
		}
		System.out.print("=" + sum);
	}

}
