package day0401;

public class MethodTest07_Array {
	// 정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 출력하는 메소드를 정의
	public static void printMax(int[] a) { // 배열을 전달받기
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("배열 중에 가장 큰 수는: " + max);
	}

	public static void main(String[] args) {
		int[] data = { 9, 2, 7, 50, 6 };
		printMax(data);
	}

}
 
