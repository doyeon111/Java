package day0329;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,n10,n1; 
		//24
		
		System.out.print("0~99������ ���� �Է��ϼ���: ");
		n = sc.nextInt();
		
		if(n >= 0 && n <= 99) {
			if(n == 0) {
				System.out.println("��!");
			}else {
				n10 = n / 10;
				n1 = n % 10;
				//�����ڸ��� ó��
				if(n10 == 0) {
					System.out.print("");
				}
				else if(n10 == 1) {
					System.out.print("��");
				}else if(n10 == 2) {
					System.out.print("�̽�");
				}else if(n10 == 3) {
					System.out.print("���");
				}else if(n10 == 4) {
					System.out.print("���");
				}else if(n10 == 5) {
					System.out.print("����");
				}else if(n10 == 6) {
					System.out.print("����");
				}else if(n10 == 7) {
					System.out.print("ĥ��");
				}else if(n10 == 8) {
					System.out.print("�Ƚ�");
				}else if(n10 == 9) {
					System.out.print("����");
				}
				
				//�����ڸ��� ó��
				if(n1 == 0) {
					System.out.println("");
				}else if(n1 == 1) {
					System.out.println("��");
				}else if(n1 == 2) {
					System.out.println("��");
				}else if(n1 == 3) {
					System.out.println("��");
				}else if(n1 == 4) {
					System.out.println("��");
				}else if(n1 == 5) {
					System.out.println("��");
				}else if(n1 == 6) {
					System.out.println("��");
				}else if(n1 == 7) {
					System.out.println("ĥ");
				}else if(n1 == 8) {
					System.out.println("��");
				}else if(n1 == 9) {
					System.out.println("��");
				}
			}
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		
		}

	}

}
