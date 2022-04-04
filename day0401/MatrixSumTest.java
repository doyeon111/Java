package day0401;

public class MatrixSumTest {

	public static void main(String[] args) {
		int[][] a = new int[5][5];

		int n = 1;
		for (int i = 0; i < a.length - 1; i++) { // 행
			for (int j = 0; j < a[0].length-1; j++) { // 열
				a[i][j] = n++;
				a[i][4] += a[i][j]; //마지막 열에는 각 행의 합을 누적
				a[4][j] += a[i][j]; //마지막 행에는 각 열의 합을 누적
				a[4][4] += a[i][j]; //맨 마지막 행, 열은 모두 요소의 합을 누적
			}

		}
		
		//출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " \t"); // \t 탭설정하는 만큼 공백을 설정
			}
			System.out.println(); // 줄이 끝날 때마다 줄바꿈
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
