package day0331;

import java.util.Random;
//��ǻ�Ͱ� �ڵ����� �ζǹ�ȣ�� ���
public class LottoAutoUniquePractice {

	public static void main(String[] args) {
		
		int []data = new int[6];
		//1~45������ �ƹ� ���ڸ� ������ ��. ==>  ����
		
		Random r = new Random(); //���� 
		
		for(int i=0; i<data.length;) {
			int n = r.nextInt(45) + 1;
			//n�� data �迭�� �̹� �ִ��� �Ǻ��Ͽ� �ߺ��� ���� �ʵ��� ó���ϱ�.
			int j;
			for(j=0; j<i; j++) { 
				if(n == data[j]) { //�տ� ���ڿ� �ߺ��� ���� �ִ��� �Ǻ� �� ���� ���� ������ Ż��
					break;
				}
			}
			
			if(j == i) {
				data[i] = n;
				i++;	
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		


	}

}
