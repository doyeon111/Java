package exam03;

import java.util.Scanner;

//프로그램 실행 시 두 개의 정수를 전달받아 나누기 한 결과를 출력
//java DivTest 4 2 
//발생할 수 있는 다양한 예외에 대한 처리를 구현
public class DivTest03 {

	public static void main(String[] args) {
		int a, b, div;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a / b;
			System.out.println("나누기 결과: " + div);
		} catch (ArithmeticException e) { // 0으로 나누었을 때 예외
			System.out.println("0으로는 나눌 수 없어요!");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식에 맞지 않습니다!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("나누기 할 두 수를 전달해주세요!");
		}
	}

}
