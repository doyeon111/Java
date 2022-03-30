package day0329;

public class SwapTest {

	public static void main(String[] args) {
		// 두 개의 변수의 값을 서로 맞바꾸어 봅시다.
		int a = 17;
		int b = 24;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int temp; //임시변수
		temp = a;
		a = b;
		b = temp; // a와 b의 값을 서로 맞바꿔지는 것을 확인
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
