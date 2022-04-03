package day0331;

public class BreakTest02 {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			if(i%3 == 0) { //i를 3으로 나누었을 때 나머지가 0이면 탈출
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("종료");
		System.out.println("반복문 탈출 후의 i값: " + i); //i는 11
	}

}
