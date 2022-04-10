package exam06;

public class DivTest06 {
	
	//두 개의 정수를 매개변수로 전달받아 나누기 한 결과를 출력하는 메소드
	public static void calcDiv(int a, int b) {
		
		try {
		int div = a/b;
		System.out.println("나누기 결과: " + div);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수는 없어요!");
		}
	}

	public static void main(String[] args) {
		calcDiv(9, 0);

	}

}
 
