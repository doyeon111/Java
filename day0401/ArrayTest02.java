package day0401;

/*
 ex) 	[][]
		[][][][]
		[][][]
		
		int [][]a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];

 */


public class ArrayTest02 {

	public static void main(String[] args) {
		int [][]a = new int [3][];
		
		a[0] = new int[2];
		a[1] = new int[5];
		a[2] = new int[3];
		
		
		//�� �迭�� ��ҿ� 1���� 1�� ������ ���� �����غ���.
		int n=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = n++;
				
			}

		}
		
		//��� �迭�� ��Ҹ� ���
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " \t");
			}
			System.out.println(); // ���� ���� ������ �ٹٲ�
		}
		
	}


}
