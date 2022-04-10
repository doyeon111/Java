package exam07;

public class DivTest07 {

	// 두 개의 정수를 매개변수로 전달받아 나누기 한 결과를 출력하는 메소드
	public static void calcDiv(int a, int b) throws ArithmeticException { // 호출하는 쪽으로 예외를 전달

		int div = a / b;
		System.out.println("나누기 결과: " + div);

	}

	public static void main(String[] args) {

		try { //여기서 처리를 해준다.
			calcDiv(9, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요!");
		}
	}

}
 
