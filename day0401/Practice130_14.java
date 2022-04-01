package day0401;

public class Practice130_14 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 2 }, { 1 }, { 1, 2, 3 } };


		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " \t");
				
			}
			System.out.println(); // 줄이 끝날 때마다 줄바꿈
		}
		



	}
}