package day0401;

//�� �迭�� �ִ� ����� ������ �����ϴ�. �� �� �ְ� ������ ����� �̸��� ����ϼ���. +�ְ��� ����� �θ��� ���
public class MaxTest03 {

	public static void main(String[] args) {
		String[] name = { "ȫ�浿", "������", "�̼���", "������", "������","������" };
		int[] score = { 40, 70, 30, 100, 90, 100 };

		//1. �ϴ�, max�� ���Ѵ�.
		//2. score �迭 �߿� max�� ���� ���� ���� �ε������� ���Ѵ�.
		//3. �� �ε����鿡 �ش��ϴ� �л��̸��� ����Ѵ�.
		
		
		//1. �ϴ�, max�� ���Ѵ�.
		int max = score[0]; //max�� ���� ���Ѵ�.
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				
			}
		}
		
		//2. score �迭 �߿� max�� ���� ���� ���� �ε������� ���Ѵ�.
		int []n = new int[score.length]; //score�� ���̸�ŭ ���Ѵ�.
		//									max  =  100
		//[3][5][][][][]						n�迭	j=0,1
		//[40][70][30][100][90][100]		score   i=0,1,2,3 //i�� 3��°�϶� 100�� ����. ���� j�� 0��° �ε����� 3�� �־��ش�. 
		
		int j=0;
		for (int i=0; i<score.length; i++) {
			if(score[i] == max) { //score i���� max�� ������ n�迭�� j�� i���� ����־��.
				n[j] = i;
				j++;
			}
		}
		System.out.println("�ְ�����: " + max);
		System.out.print("�ְ������� �л�: ");
		
		//j������ ���Ͽ� max�� ������ ���� ���� ����� ���� �� �� �ִ�. 
		for(int i=0; i<j; i++) {
			System.out.print(name[n[i]]+ " "); 
		}
		
	}	

}
