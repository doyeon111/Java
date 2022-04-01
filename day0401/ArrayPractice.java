package day0401;

public class ArrayPractice {

	public static void main(String[] args) {
		int[][] a = new int[4][5]; // 3행 4열의 2차원 배열 ==> 12개의 정수형 메모리가 잡힌다.
		
		/*
		 		  0  1  2  3  4
		 		0[1][2][3][4][10]    a[0][4]
		 		1[][][][][]	 		 a[1][4]
		 		2[][][][][]  		 a[2][4]
		 		3[][][][][]  		 a[3][4]
		 */
		
		
		
		
		// 중첩반복문을 이용하여 각 배열에 요소에 1부터 1씩 증가한 값을 저장해보자.
		int n = 1;
		for (int i = 0; i < 4; i++) { // 줄 수(행 수)
			for (int j = 0; j < 4; j++) { // 열 수인데 마지막은 더해준 값을 저장하기 위하여 4까지만 설정해준다.
				a[i][j] = n++;
				a[i][4] += a[i][j];
			}
		}

		// 모든 배열의 요소를 출력해보자.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " \t"); // \t 탭설정하는 만큼 공백을 설정
			}
			System.out.println(); // 줄이 끝날 때마다 줄바꿈
		}

	}

}
