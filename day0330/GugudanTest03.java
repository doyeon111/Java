package day0330;

import java.util.Scanner;

public class GugudanTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("������ �߿� ����� ����ұ��? ");
		dan = sc.nextInt();
		
		//�ݺ����� �ʿ��� ������ �̸� ������ ���� �ְ�, �ʿ��� ������ �ٷ� �����Ͽ� ����� �� �ִ�.
		//����, �ʿ��ϴٸ� �ݺ������� ���ù��� ǥ���� ���� �ִ�.
		for(int i = 9 ; i >= 1; i--) {
			if (i % 2 == 1) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		
			}
		}
	}

}
