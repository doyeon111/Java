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
		
		
		//각 배열의 요소에 1부터 1씩 증가한 값을 저장해보자.
		int n=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = n++;
				
			}

		}
		
		//모든 배열의 요소를 출력
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " \t");
			}
			System.out.println(); // 줄이 끝날 때마다 줄바꿈
		}
		
	}

 
}
