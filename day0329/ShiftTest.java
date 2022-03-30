package day0329;

public class ShiftTest {

	public static void main(String[] args) {
		int i = 8; //2진수 0000 1000
		int a = i << 1; // 0001 0000 = 16 // 그 수의 * 2 한 결과 값과 같다.
		int b = i >> 1; // 0000 0100 = 4 // 그 수의 / 2 한 결과 값과 같다.
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
