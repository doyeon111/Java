package day0401;

public class MatrixSumTest {

	public static void main(String[] args) {
		int[][] a = new int[5][5];

		int n = 1;
		for (int i = 0; i < a.length - 1; i++) { // ��
			for (int j = 0; j < a[0].length-1; j++) { // ��
				a[i][j] = n++;
				a[i][4] += a[i][j]; //������ ������ �� ���� ���� ����
				a[4][j] += a[i][j]; //������ �࿡�� �� ���� ���� ����
				a[4][4] += a[i][j]; //�� ������ ��, ���� ��� ����� ���� ����
			}

		}
		
		//���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " \t"); // \t �Ǽ����ϴ� ��ŭ ������ ����
			}
			System.out.println(); // ���� ���� ������ �ٹٲ�
		}

	}
}

/*
 	 0 1 2 3 4	
	0[][][][][]   [0][4]
	1[][][][][]   [1][4]
	2[][][][][]   [2][4]
	3[][][][][]   [3][4]
	4[][][][][]                        [4][4]
[4][0]/[4][1]/[4][2]/[4][3]

*/