package day0401;

import java.util.Random;

public class Practice131_15 {

	public static void main(String[] args) {
		int[][] a = new int[3][5];

		Random r = new Random(); // 난수

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(2);

				System.out.print(a[i][j] + "\t");
			}
				System.out.println(); // 줄이 끝날 때마다 줄바꿈
			

		}
	}

}
