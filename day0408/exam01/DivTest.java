package exam01;

import java.util.Scanner;

//사용자한테 두 개의 정수를 입력받아 나누기 한 결과를 출력
public class DivTest {

	public static void main(String[] args) {
		int a, b, div;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("첫 번째 수를 입력하세요: ");
			a = sc.nextInt();

			System.out.print("두 번째 수를 입력하세요: ");
			b = sc.nextInt();

			div = a / b;
			System.out.println("나누기 결과: " + div);
		} catch (ArithmeticException e) { //0으로 나누었을 때 예외
			System.out.println("0으로는 나눌 수 없어요.");
		}
	}

}
 
