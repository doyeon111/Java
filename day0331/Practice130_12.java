package day0331;

import java.util.Scanner;

public class Practice130_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []data = new int[4];
		
		int total=0;
		
		for(int i=0; i<data.length;) {
			System.out.print("������ �Է��ϼ���: ");
			 int n = sc.nextInt(); //�Է� ���� n�� ����
			 
			 if(n == -1) { //n�� -1�̵Ǹ� �ݺ��� ����
				 break;
			 } else { //n�� -1�� �ƴϸ� n�� ���� �ְ� i�� ����
				 data[i]=n;
				 i++;
			 }
			 
//			if(data[i] == -1) {
//				break;
//			}

		}
		
		for(int i=0; i<data.length; i++) {
			total += data[i]; //data[i]�� ����
		}
		double avg = total / (double)data.length; //data[i]���� ��հ�
		
		System.out.println("�հ�: " + total);
		System.out.println("���: " + avg);

	}

}
