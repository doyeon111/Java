package day0331;

public class WhileAndDoWhile {
//while문과 do~while문의 차이
	public static void main(String[] args) {
		
		int i = 10;
		while (i <= 5) { //처음부터 조건을 만족하지 않는다면 한 번도 실행되지 않는다.(while문)
			System.out.println("hello");
			i++;
		}

		System.out.println("---------------------------------------");

		int j = 10;
		do { //처음부터 조건이 만족하지 않아도, 일단 먼저 한 번은 실행을 한다.(do~while문)
			System.out.println("hello");
			j++;
		} while (j <= 5);

	}

}
 
