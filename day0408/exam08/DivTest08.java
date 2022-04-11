package exam08;

//ArithmeticException은 RuntimeException의 후손이다.
// RuntimeException은 따로 예외처리를 하지 않아도 컴파일이 되고 실행이 된다.
//필요하다면 사용자가 따로 예외처리 할 수 있다.
public class DivTest08 {

	// 두 개의 정수를 매개변수로 전달받아 나누기 한 결과를 출력하는 메소드
	public static void calcDiv(int a, int b) throws ArithmeticException { // 호출하는 쪽으로 예외를 전달

		int div = a / b;
		System.out.println("나누기 결과: " + div);

	}

	public static void main(String[] args) {

			calcDiv(9, 0);
		
	}

}
 
