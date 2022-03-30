package day0330;

public class EvenTest {

	public static void main(String[] args) {
		//1에서 100까지의 짝수만 모두 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		} System.out.println();//빈줄
		for (int j = 2; j <= 100; j=j+2) {
			System.out.print(j + " ");
		}
	}

}
