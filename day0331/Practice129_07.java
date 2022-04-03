package day0331;

public class Practice129_07 {

	public static void main(String[] args) {
		System.out.print("2부터 100사이의 모든 소수: ");
		int k = 2;
		do {
			int j = 2;
			do {
				if (k % 2 == 0) {//하나라도 나누어지는 것이 있으면 빠져나옴.
					break;
				}
				j++;
			} while (j < k);
			if (k == j) {
				System.out.print(j + " ");
			}
			k++;

		} while (k <= 100); 

	}

}
