package day0331;

import java.util.Random;
//��ǻ�Ͱ� �ڵ����� �ζǹ�ȣ�� ���
public class LottoAutoPractice {

	public static void main(String[] args) {
		
		int []data = new int[6];
		//1~45������ �ƹ� ���ڸ� ������ ��. ==>  ����
		
		Random r = new Random(); //���� 
		
		for(int i=0; i<data.length; i++) {
			data[i] = r.nextInt(45) + 1; //0���� �����ϱ� ������ +1�� ���ָ� ���ϴ� ���ڰ� ����.
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		


	}

}
