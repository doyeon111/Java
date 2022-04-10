package exam05;

import java.util.Scanner;

//프로그램 실행 시 두 개의 정수를 전달받아 나누기 한 결과를 출력
//java DivTest 4 2 
//발생할 수 있는 다양한 예외에 대한 처리를 구현
public class DivTest05 {

	public static void main(String[] args) {
		int a, b, div;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a / b;
			System.out.println("나누기 결과: " + div);

		} catch (ArithmeticException e) { // catch문을 써줄 때는 자식클래스부터 와야 한다.

			System.out.println("0으로는 나눌 수 없어요!");
		} catch (Exception e) { // 모든 예외처리
			System.out.println("나누기 할 두 개의 정수를 전달해 주세요.");
		} finally { //예외가 발생하거나 발생하지 않거나 반드시 동작
			System.out.println("작업종료");
		}
	}

}
 
