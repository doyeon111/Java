package day0401;

//3차원 배열 , 첫번째 면에는 모두 0이, 두번째 면에는 모두 1이 들어가도록 프로그램을 작성하세요.
public class ThreeDArrayTest {

	public static void main(String[] args) {
		int[][][] a = new int[2][3][5]; // 3줄있고 5칸있는 면이 2장 있다.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i;
				}
			}
		}

		// 모든 배열의 요소를 출력
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
