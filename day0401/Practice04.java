package day0401;

import java.util.Scanner;

//0331 4�� ����
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []dap = {1,2,3,4,1,2,3,4,1,2}; //10���� �������� �̸� ����
		int []user = new int[10];
		
		for(int i=0; i<user.length; i++) {
			System.out.print((i+1) + "�� ���� �Է��ϼ���: ");
			user[i] = sc.nextInt();
			
		}
		
		for (int i=1; i<=10; i++) { //������ ���
			System.out.print(i + "  "); //1~10�� ������ ���
		}
		System.out.println(); //�ٹٲ�
		
		int n = 0;//������� ���� n�� ����
		for(int i=0; i<10; i++) {
			if(dap[i] == user[i]) { //�迭�� �ִ� ��� user�� �� ���� ���� ��
				System.out.print("O  "); //O�� ���
				n++;
			} else { //���� �ʴٸ�
				System.out.print("X  "); //x�� ���
			}
		}
		
		System.out.println();
		System.out.println("���� ��:" + n);
		System.out.println("Ʋ���� ��: " +(10-n));
	}

}
