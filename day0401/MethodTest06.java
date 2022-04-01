package day0401;

//두 개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 출력하는 메소드를 정의
public class MethodTest06 {
	public static void max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		System.out.println("큰 수는 " + r + "입니다.");
	}

	public static void main(String[] args) {
		max(3, 4);

	}

}
