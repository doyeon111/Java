package day0331;

public class WhileTest01 {

	public static void main(String[] args) {
		int i=1; //초기값이 미리온다.
		
		while(i <= 5) {
			System.out.println("hello");
			i++; //증감식을 while문 안에 작성해준다.
		}
		System.out.println("종료");
		System.out.println(i); //i가 6번째 일 때 while문을 탈출한다는 것.
	}

}
