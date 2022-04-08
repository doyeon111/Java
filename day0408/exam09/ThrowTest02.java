package exam09;

import java.io.IOException;

public class ThrowTest02 {

	public static void main(String[] args) {
		System.out.println("hello");

		
		try {
			throw new IOException("입출력 오류 발생"); //반드시 예외처리 해야함.
		} catch(IOException e) {
			System.out.println("예외발생: " + e.getMessage());
		}
	}

}
