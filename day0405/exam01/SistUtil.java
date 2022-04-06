package exam01;

public class SistUtil {
	// 두 개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public int getMax(int a, int b) {
		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;

	}
	// 세 개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의

	public int getMax(int a, int b, int c) { // 매개변수의 개수가 다르거나 자료형이 달라야한다.
		int max;

		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		return max;
	}

	// 두 개의 실수형 변수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public double getMax(double a, double b) {
		double max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;
	}

	// 정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 반환하는 메소드를 정의
	// 메소드 안의 내용을 구체화 해보자.

	public int getMax(int[] data) {
		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}

		return max;
	}

}
 
