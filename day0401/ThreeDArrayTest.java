package day0401;

//3���� �迭 , ù��° �鿡�� ��� 0��, �ι�° �鿡�� ��� 1�� ������ ���α׷��� �ۼ��ϼ���.
public class ThreeDArrayTest {

	public static void main(String[] args) {
		int[][][] a = new int[2][3][5]; // 3���ְ� 5ĭ�ִ� ���� 2�� �ִ�.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i;
				}
			}
		}

		// ��� �迭�� ��Ҹ� ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

}
