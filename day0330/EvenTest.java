package day0330;

public class EvenTest {

	public static void main(String[] args) {
		//1에서 100까지의 짝수만 모두 출력
		for(int i = 1; i <= 100; i++) { //i가 1부터 100까지 1씩 증가
			if(i % 2 == 0) { //i가 2로 나누었을 때 나머지가 0인 경우
				System.out.print(i + " "); //i출력
			}
		} System.out.println();//빈줄
		for (int j = 2; j <= 100; j=j+2) {
			System.out.print(j + " ");
		}
	}

}
