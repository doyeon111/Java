package day0331;

import java.util.Random;

public class AutoLottoSortPractice {

	public static void main(String[] args) {
		//�ζǹ�ȣ�� �ߺ����� �ʵ��� �ڵ����� �����ϰ�, ������������ �����Ͽ� ���
		

		int []data = new int[6];
		
		Random r = new Random(); 
		
		for(int i=0; i<data.length;) {
			int n = r.nextInt(45) + 1; //0~44���� ������ �������. +1�� �����ν� 45�� ������ֱ�
			int j;
			for(j=0; j<i; j++) { 
				if(n == data[j]) { //�߻��� ���� n�� �̹� �ִ��� �����ϱ�
					break;
				}
			}
			
			if(j == i) { //j�� i�� ������ �� Ż��
				data[i] = n;
				i++;	
			}
		}
		//����
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) { // i+1������ ��
				if (data[j] < data[i]) {
					int temp = data[i]; //������������ ����
					data[i] = data[j];
					data[j] = temp;
				}
			} 

		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		

	}

}
