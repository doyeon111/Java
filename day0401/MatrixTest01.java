package day0401;

public class MatrixTest01 {

	public static void main(String[] args) {
		int [][]a = new int[3][4]; //3행 4열의 2차원 배열 ==> 12개의 정수형 메모리가 잡힌다.
		
		//중첩반복문을 이용하여 각 배열에 요소에 1부터 1씩 증가한 값을 저장해보자.
		int n = 1;
		for(int i=0; i<3; i++) { //줄 수(행 수)
			for(int j=0; j<4; j++) { //열 수
				a[i][j] = n++;
			}
		}
		
		
		//모든 배열의 요소를 출력해보자.
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j] + " \t"); //\t 탭설정하는 만큼 공백을 설정
			}
			System.out.println(); //줄이 끝날 때마다 줄바꿈
		}
		
		/*
					  0 1 2 3
		  			0[][][][]
		  			1[][][][]
		  			2[][][][]
		  			
		  			a[0][0] = 100
		  			a[0][3] = 5
					a[2][1] = 7
					
					2차원 배열의 접근할 때는 배열이름[행인덱스][열인덱스];
		 */
	}

}
